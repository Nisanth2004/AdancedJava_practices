package com.misanth.sendemail;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailService
{
  private final JavaMailSender javaMailSender;

    public EmailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @Value("${spring.mail.username}")
  private String sender;

    public String sendEmail(Email email)
    {
        try
        {
            SimpleMailMessage mailMessage=new SimpleMailMessage();
            mailMessage.setFrom("Nisanth selvaraj<"+sender+">");
            mailMessage.setTo(email.getRecipient());
            mailMessage.setSubject(email.getSubject());
            mailMessage.setText(email.getMessage());

            javaMailSender.send(mailMessage);
            return "Mail send Successfully";
        }
        catch(Exception e)
        {
              return "Email Sending error";
        }
    }

    public String sendEmailWithAttachment(Email email) throws MessagingException
    {
        try {
            // create mime message
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
            mimeMessageHelper.setFrom("Nisanth selvaraj<" + sender + ">");
            mimeMessageHelper.setTo(email.getRecipient());
            mimeMessageHelper.setSubject(email.getSubject());
            mimeMessageHelper.setText(email.getMessage());

            //adding the attachment
            mimeMessageHelper.addAttachment(email.getAttachment().getOriginalFilename(), email.getAttachment());


            // send the email;
            javaMailSender.send(mimeMessage);

            return "Mail send succesfully with attachment";
        }
        catch(Exception e)
        {
            return "mail send wrong";
        }

    }
}
