
<%

    String to = request.getParameter("to");
    String subject = request.getParameter("subject");
    String msg = request.getParameter("msg");

    Mailer.send("ciradukunda17@gmail.com", "TEST", "Did you know that i can send email using servle.....");
   
%>


<%-- <%-- 
    Document   : email
    Created on : Mar 15, 2023, 12:26:52 PM
    Author     : chris

<%@page import="javax.mail.MessagingException"%>
<%@page import="javax.mail.Transport"%>
<%@page import="javax.mail.internet.InternetAddress"%>
<%@page import="javax.mail.Message"%>
<%@page import="javax.mail.internet.MimeMessage"%>
<%@page import="javax.mail.PasswordAuthentication"%>
<%@page import="javax.mail.Session"%>
<%@page import="javax.mail.Authenticator"%>
<%@page import="java.util.Properties"%>

    String recipient = "ciradukunda17@gmail.com"; // change this to the email address you want to send the email to
    String subject = "Registration Form Submission"; // change this to the email subject
    String message = "Thank you for submitting the registration form!"; // change this to the email message

// send the email using JavaMail API
    Properties props = new Properties();
    props.put("mail.smtp.host", "smtp.gmail.com"); // change this to your SMTP server's host
    props.put("mail.smtp.port", "587"); // change this to your SMTP server's port
    props.put("mail.smtp.auth", true); // set to true if your SMTP server requires authentication
    props.put("mail.smtp.starttls.enable", true); // set to true if your SMTP server uses TLS encryption

    String account = "chriszxn99@gmail.com";
//            String final passwd = "wnhcpybbevowjuqw";

    Session mailSession = Session.getInstance(props, new Authenticator() {
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication("B Chris", "wnhcpybbevowjuqw"); // change this to your email account's username and password
        }
    });
    try {
        MimeMessage mimeMessage = new MimeMessage(mailSession);
        mimeMessage.setFrom(new InternetAddress(account)); // change this to your email address
        mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
        mimeMessage.setSubject(subject);
        mimeMessage.setText(message);
        Transport.send(mimeMessage);
        out.println("Email sent successfully!");
    } catch (MessagingException e) {
        out.println("Failed to send email. Error message: " + e.getMessage());
    }
--%>
