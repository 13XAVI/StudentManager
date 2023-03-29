<%-- 
    Document   : registration
    Created on : Mar 9, 2023, 1:31:50 PM
    Author     : t
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="UTF-8" >
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-compatible" content="ie-edge">
        <title>Registration Form</title>
        <link rel="stylesheet" href="../css/registration.css">
        <script defer src="../js/registration.js"></script>

    </head>

    <body>
        <form action="registerStudent.jsp" method="POST" id="registration" onchange="changeLanguage()">
            <header class="navbar">

                <%
                    HttpSession prevSession = request.getSession(false);
                    prevSession.getAttribute("username");
                    prevSession.getAttribute("loggedInUser");
                    String sessionLanguage = (String) prevSession.getAttribute("language");
                    if (sessionLanguage == null) {
                        sessionLanguage = "en"; // Default language
                    }
                    prevSession.getAttribute("loggedInUser");
                    if (prevSession == null) {
                        response.sendRedirect("login.jsp");
                    }
                %>

                <nav class="navbar-menu">
                    <select id="language-select" name="language" onchange="changeLanguage()">
                        <option value="en" <%= sessionLanguage.equals("en") ? "selected" : ""%>>English</option>
                        <option value="fr" <%= sessionLanguage.equals("fr") ? "selected" : ""%>>Français</option>
                        <option value="kin" <%= sessionLanguage.equals("kin") ? "selected" : ""%>>Kinyarwanda</option>
                    </select>
                </nav>
                <!-- <button id="nav-toggle" class="navbar-toggle">
                    <span></span>
                    <span></span>
                    <span></span>
                </button> -->
            </header>
            <main>
                <h1 data-i18n="title">Registration Form</h1>



                <h3 data-i18n="personal_information">Personal information</h3>
                <fieldset>
                    <label for="id" data-i18n="id">ID:</label> <input type="text" name="id" />
                    <label for="first_name" data-i18n="first_name">First Name:</label> <input type="text" name="first_name"
                                                                                              required />
                    <label for="last_name" data-i18n="last_name">Last Name: </label><input type="text" name="last_name"
                                                                                           required />

                    <label for="gender" data-i18n="gender">Gender:</label>
                    <select name="gender">
                        <option value="" data-i18n="select_one">(select one)</option>
                        <option value="male" data-i18n="male">Male</option>
                        <option value="Female" data-i18n="female">Female</option>
                        <option value="non" data-i18n="none">Prefer not to say</option>
                    </select>

                    <label for="dob" data-i18n="dob">Date of Birth:</label> <input type="date" name="age" required />
                    <label for="photo" data-i18n="photo">Upload a profile picture: </label><input type="file" name="photo"
                                                                                                  data-i18n="file" accept="image/jpeg, image/png/">

                </fieldset>

                <h3 data-i18n="address_contact">Address/Contact</h3>
                <fieldset>
                    <label for="nationality" data-i18n="nationality">Nationality:</label>
                    <input type="text" name="nationality" required />

                    <label for="email" data-i18n="email">Email: </label><input type="email" name="per_email" required />
                    <label for="tel_person" data-i18n="tel_personal">Telephone Number:</label> <input type="text"
                                                                                                      name="tel_personal" required />
                    <label for="tel_parent" data-i18n="tel_parent">Parent Contact: </label><input type="text"
                                                                                                  name="tel_parent" />

                </fieldset>

                <h3 data-i18n="academic">Academic Information</h3>
                <fieldset>
                    <label for="certificate" data-i18n="certificate">Upload your High School Certificate:</label> <input
                        type="file" name="certificate" accept="application/pdf" required />

                    <label for="faculty" data-i18n="faculty">Faculty:</label>
                    <select id="faculty" name="faculty">
                        <option value="" data-i18n="select_one">(select one)</option>
                        <option value="Information_Technology" data-i18n="it">Information Technology</option>
                        <option value="Education" data-i18n="education">Education</option>
                        <option value="Business" data-i18n="business">Business</option>

                    </select>

                    <label for="department" data-i18n="department">Department:</label>
                    <select id="department" name="department">
                        <option value="" data-i18n="select_one">(select one)</option>
                    </select>

                </fieldset>
                <button type="submit"  data-i18n="register" value="Submit">Register</button>

        </form>
    </main>
</body>
</html>
