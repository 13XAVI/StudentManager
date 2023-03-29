<%-- 
    Document   : login
    Created on : Mar 9, 2023, 1:02:01 PM
    Author     : t
--%>
<%@ page language="java" pageEncoding="UTF-8" isErrorPage="true" %>
<% pageContext.getServletContext().log("Compiling " + request.getRequestURI());%>

<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>
<link rel="stylesheet" href="../css/login.css" />
<script defer src="../js/login.js"></script>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-compatible" content="ie-edge">
        <title data-i18n="name">Login Page</title>

    </head>
    <body>
        <div class="form-container">
            <form action="loginCheck.jsp" method="post">
                <header class="navbar">
                    <nav class="navbar-menu">

                        <%
                            String sessionLanguage = (String) session.getAttribute("language");
                            if (sessionLanguage == null) {
                                sessionLanguage = "en"; // Default language
                            }
                        %>
                        <select id="language-select" name="language" onchange="changeLanguage()">
                            <option value="en" <%= sessionLanguage.equals("en") ? "selected" : ""%>>English</option>
                            <option value="fr" <%= sessionLanguage.equals("fr") ? "selected" : ""%>>Français</option>
                            <option value="kin" <%= sessionLanguage.equals("kin") ? "selected" : ""%>>Kinyarwanda</option>
                        </select>
                    </nav>
                   
                </header>

                <h1 data-i18n="title">Login</h1>
                <label for="username" data-i18n="email">Email:</label>
                <input type="email" id="username" name="username" required>

                <label for="password" data-i18n="password">Password:</label>
                <input type="password" id="password" name="password" required>

                <button type="submit" name="check" data-i18n="login">Login</button> <br>
                <div id="signup">
                    <p data-i18n="sign_up">No account,please </p> <a href="signup.jsp" data-i18n="link">Sign Up</a>
                </div>
            </form>
        </div>

    </body>
</html>
