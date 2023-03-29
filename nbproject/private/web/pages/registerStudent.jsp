<%-- 
    Document   : registerStudent
    Created on : Mar 9, 2023, 2:56:10 PM
    Author     : t
--%>

<%@page import="com.sms.controller.SendEmail"%>
<%@page import="javax.mail.Message"%>
<%@page import="javax.mail.Transport"%>
<%@page import="javax.mail.MessagingException"%>
<%@page import="javax.mail.internet.InternetAddress"%>
<%@page import="javax.mail.internet.MimeMessage"%>
<%@page import="javax.mail.PasswordAuthentication"%>
<%@page import="javax.mail.Session"%>
<%@page import="javax.mail.Authenticator"%>
<%@page import="java.util.Properties"%>
<%@page import="java.util.Date"%>
<%@page import="com.sms.service.StudentService"%>
<%@page import="com.sms.service.StudentInterface"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="com.sms.model.Student"%>
<%
    HttpSession mySession = request.getSession(false);
    mySession.getAttribute("username");
    mySession.getAttribute("language");
    mySession.getAttribute("loggedInUser");
    if (mySession == null) {
        return;
    }

    try {
        Student stud = new Student();

        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        if (request.getParameter("age") != null) {
            stud.setDob(formatter.parse(request.getParameter("age")));
        }

        stud.setNational_id(request.getParameter("id"));
        stud.setFirst_name(request.getParameter("first_name"));
        stud.setLast_name(request.getParameter("last_name"));
        stud.setGender(request.getParameter("gender"));
        stud.setPhoto(request.getParameter("photo").getBytes());
        stud.setNationality(request.getParameter("nationality"));
        stud.setEmail(request.getParameter("per_email"));
        stud.setTel_number(request.getParameter("tel_personal"));
        stud.setParent_contact(request.getParameter("tel_parent"));
        stud.setHigh_school_certificate(request.getParameter("certificate").getBytes());
        stud.setFaculty(request.getParameter("faculty"));
        stud.setDepartment(request.getParameter("department"));

        StudentInterface student = new StudentService();
        if (student.createStudent(stud)) {
            HttpSession newSession = request.getSession(false);
            newSession.setAttribute("username", mySession.getAttribute("username"));
            newSession.setAttribute("language", request.getParameter("language"));

            String recipientEmail = "cyusa.ayman@gmail.com";
            String recipientName = "TresorXavier";
            String host = "smtp.gmail.com";
            String port = "587";
            final String username = "tresorxavier16@gmail.com";
            final String password = "Tresor@Email202";

            Properties props = new Properties();
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", port);
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");

            Session mailSession = Session.getInstance(props,
                    new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });
            request.getRequestDispatcher("Home_1.jsp").forward(request, response);
            SendEmail.main(new String[]{"tresorxavier16@gmail.com"});
            out.println("Email sent successfully");

        } else {
            request.getRequestDispatcher("signUp.jsp").forward(request, response);

        }

    } catch (Exception ex) {
        ex.printStackTrace();
    }
%>

