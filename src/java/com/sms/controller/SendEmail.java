package Controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author t
 */
import java.util.Properties;
import javax.mail.Message;
import javax.mail.internet.*;
import java.util.Properties;
import javax.mail.Session;
import javax.mail.internet.*;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class SendEmail {
    public static void main(String[] args) throws Exception {
   // Set up email account credentials
      String host = "smtp.gmail.com";
      String username = "tresorxavier16@gmail.com";
      String password = "jsqblequoqtfjytk";
      
      // Set up email message properties
      String to = "tresorxavier16@gmail.com";
      String from = "tresorxavier16@gmail.com";
      String subject = "Test email";
      String body = "This is a test email from JavaMail API.";

      // Set up email session properties
      Properties props = new Properties();
      props.put("mail.smtp.host", host);
      props.put("mail.smtp.auth", "true");
      props.put("mail.smtp.starttls.enable", "true");
      props.put("mail.smtp.port", "587");

      // Create a Session object
      Session session = Session.getInstance(props,
         new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
               return new PasswordAuthentication(username, password);
            }
         });

      try {
         // Create a message object and set its properties
         Message message = new MimeMessage(session);
         message.setFrom(new InternetAddress(from));
         message.setRecipients(Message.RecipientType.TO,
            InternetAddress.parse(to));
         message.setSubject("Thank you for Working with us and your information is being processed");
         message.setText(body);

         // Send the email message
         Transport.send(message);

         System.out.println("Email sent successfully!");
      } catch (MessagingException e) {
         throw new RuntimeException(e);
      }
    }
}
