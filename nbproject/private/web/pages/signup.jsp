<%-- 
    Document   : signup
    Created on : Mar 9, 2023, 12:21:29 PM
    Author     : t
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="../css/signup.css">

<script defer src="../js/signup.js"></script>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-compatible" content="ie-edge">
        <title data-i18n="name">Sign Up Page</title>

    </head>

    <body>
        <form action="signRegister.jsp" method="POST" id="signup">
            <header class="navbar">

                <%
                    HttpSession prevSession = request.getSession(false);
                    String sessionLanguage = (String) prevSession.getAttribute("language");
                    if (sessionLanguage == null) {
                        sessionLanguage = "en"; // Default language
                    }
                %>
                <nav class="navbar-menu">
                    <select id="language-select" name="language" onchange="changeLanguage()">
                        <option value="en" <%= sessionLanguage.equals("en") ? "selected" : ""%>>English</option>
                        <option value="fr" <%= sessionLanguage.equals("fr") ? "selected" : ""%>>Français</option>
                        <option value="kin" <%= sessionLanguage.equals("kin") ? "selected" : ""%>>Kinyarwanda</option>
                    </select>
                </nav>
            </header>
            <h1 data-i18n="title">Sign Up Form</h1>
            <p  data-i18n="description">Please fill this form with accurate information</p>

            <div>
                <label for="email" data-i18n="email">Email:</label>
                <input type="email" id="email" name="email" required>
                <span id="email-error" class="error-message"></span>
            </div>
            <div>
                <label for="password" data-i18n="password">Password:</label>
                <input type="password" id="password" name="password" required>
                <span id="password-error" class="error-message"></span>
            </div>
            <div>
                <label for="confirm-password" data-i18n="confirm_passowrd">Confirm Password:</label>
                <input type="password" id="confirm-password" name="confirm-password" required>
                <span id="confirm-password-error" class="error-message"></span>
            </div>
            <div>
                <br>
                <button type="submit" data-i18n="sign_up">Sign Up</button>
            </div>
        </form>
    </body>

</html>
