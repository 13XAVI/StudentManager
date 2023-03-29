<%-- 
    Document   : signRegister
    Created on : Mar 9, 2023, 12:49:39 PM
    Author     : t
--%>

<%@page import="com.sms.service.LoginService"%>
<%@page import="com.sms.service.LoginInterface"%>
<%@page import="com.sms.model.Login"%>
<%

//    HttpSession mySession = request.getSession();
//    
//    mySession.setAttribute("username", request.getParameter("email"));
//    mySession.getAttribute("language");

    try {
        Login log = new Login();
        log.setEmail(request.getParameter("email"));
        log.setPassword(request.getParameter("password"));

        LoginInterface login = new LoginService();
        login.createLogin(log);
        
        HttpSession newSession = request.getSession(true);
        newSession.setAttribute("language", request.getParameter("language"));

        request.getRequestDispatcher("login.jsp").forward(request, response);

    } catch (Exception ex) {
        ex.printStackTrace();
    }
%>
