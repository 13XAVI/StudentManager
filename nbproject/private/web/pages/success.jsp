<%-- 
    Document   : success
    Created on : Mar 9, 2023, 3:09:40 PM
    Author     : t
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Success</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="../css/success.css">
        <script defer src="../js/success.js"></script>
    </head>
    <body>
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
                <p data-i18n="message">Your registration form has be submitted successfully,</p></br></br>
        <p>to return home <a href="login.jsp" data-i18n="success"> click here</a>
        </p> 

    </body>
</html>