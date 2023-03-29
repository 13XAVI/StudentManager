<%-- 
    Document   : Home
    Created on : Mar 9, 2023, 9:14:42 AM
    Author     : t
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="../css/AddDisplayBtn.css"/>
    </head>
    <body>
<!--        <div class="test">
            <h1>Student Registration Form</h1>
        </div>-->
            <div class="hero">
                <div class="container">
                    <h1>Welcome to Our WebSite</h1>
                    <p>We provide the best services in the industry</p>
                </div>
            </div>
            <p>${message}</p>
        <div class="separator">
            <a href="registration.jsp" class="button">Add Student</a>
            <a href="Display.jsp" class="button">Display Student</a> 
        </div>

    </body>
</html>
