<%-- 
    Document   : adminEdit
    Created on : Mar 11, 2023, 11:09:21 AM
    Author     : t
--%>

<%@page import="java.util.Base64"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="studBean" class="com.sms.beans.StudentBean" scope="request" />

<!DOCTYPE html>
<html>

    <head>
        <meta charset="UTF-8" >
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-compatible" content="ie-edge">
        <title>Admin Edit Form</title>
        <link rel="stylesheet" href="../css/registration.css">
        <script defer src="../js/registration.js"></script>

    </head>

    <body>
        <main>
            <h1 data-i18n="title">Registration Edit Form</h1>



            <form action="saveEdit.jsp" method="POST" id="registration">
                <h3 data-i18n="personal_information">Personal information</h3>
                <fieldset>
                    <label for="id" data-i18n="id">ID:</label> 
                    <input type="text" name="id" value="${studBean.getNational_id()}" required/>
                    <label for="first_name" data-i18n="first_name">First Name:</label> 
                    <input type="text" name="first_name" value="${studBean.getFirst_name()}" required />
                    <label for="last_name" data-i18n="last_name">Last Name: 
                    </label><input type="text" name="last_name" value="${studBean.getLast_name()}" required />

                    <label for="gender" data-i18n="gender">Gender:</label>
                    <input type="text" name="gender" value="${studBean.getGender()}" required />

                    <label for="dob" data-i18n="dob">Date of Birth:</label> 
                    <input type="date" name="age" value="${studBean.getDob()}"/>
                    <label for="photo" data-i18n="photo">Profile picture: </label>

                </fieldset>

                <h3 data-i18n="address_contact">Address/Contact</h3>
                <fieldset>
                    <label for="nationality" data-i18n="nationality">Nationality:</label>
                    <input type="text" name="nationality" value="${studBean.getNationality()}" />

                    <label for="email" data-i18n="email">Email: </label>
                    <input type="email" name="per_email" value="${studBean.getEmail()}" required />
                    <label for="tel_person" data-i18n="tel_personal">Telephone Number:</label> 
                    <input type="text" name="tel_personal" value="${studBean.getTel_number()}" name="tel_personal" required />
                    <label for="tel_parent" data-i18n="tel_parent">Parent Contact: </label>
                    <input type="text"  name="tel_parent" value="${studBean.getParent_contact()}"name="tel_parent" />

                </fieldset>

                <h3 data-i18n="academic">Academic Information</h3>
                <fieldset>

                    <label for="faculty" data-i18n="faculty">Faculty:</label>
                      <input type="text" name="faculty" value="${studBean.getFaculty()}" />
                    <label for="department" data-i18n="department">Department:</label>
                    <input type="text" name="department" value="${studBean.getDepartment()}" />

                </fieldset>
                <div>
                    <label>Admit Student</label>
                    <select name="admission">
                        <option value="null">Review Later</option>
                        <option value="true">Yes</option>
                        <option value="false">No</option>
                    </select>
                </div>


                <%= request.getAttribute("action")%>
                <button type="submit" name="action" data-i18n="register" value="${action}"><%= request.getAttribute("action")%></button>

            </form>
        </main>
    </body>
</html>