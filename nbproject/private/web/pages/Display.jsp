<%-- 
    Document   : admin
    Created on : Mar 9, 2023, 2:21:32 PM
    Author     : t
--%>

<%@page import="com.sms.model.Student"%>
<%@page import="com.sms.service.StudentService"%>
<%@page import="com.sms.service.StudentInterface"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.sms.service.LoginService"%>
<%@page import="com.sms.service.LoginInterface"%>
<%@page import="com.sms.model.Login"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-compatible" content="ie-edge">
        <title>Admission Form</title>
        <link rel="stylesheet" href="../css/admin.css" />
        <script defer src="../js/admin.js"></script>
    </head>
    <%
        HttpSession prevSession = request.getSession(false);
        prevSession.getAttribute("username");
    %>
    <body>

        <h1>All Student Information</h1>
        <a href="login.jsp" data-i18n="success" class="Back"> Turn Back</a></br</br>
        <div>
            <table>
                <thead>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Gender</th>
                <th>Date of Birth</th>
                <th>Faculty</th>
                <th>Department</th>
                <th>Nationality</th>
                <th>Email</th>
                <th>Tel_Number</th>
                <th>Parent Conctact</th>
                <th>School Certificate</th>
                <th>Photo</th>
                <th>Action</th>
                </thead>
                <tbody>

                    <%
                        List<Student> students = new ArrayList<Student>();
                        StudentInterface studService = new StudentService();
                        students = studService.findAll();

                        for (Student stud : students) {
                    %>

                    <tr>
                        <td><%=stud.getFirst_name()%></td>
                        <td><%=stud.getLast_name()%></td>
                        <td><%=stud.getGender()%></td>
                        <td><%=stud.getDob()%></td>
                        <td><%=stud.getFaculty()%></td>
                        <td><%=stud.getDepartment()%></td>
                        <td><%=stud.getNationality()%></td>
                        <td><%=stud.getEmail()%></td>
                        <td><%=stud.getTel_number()%></td>
                        <td><%=stud.getParent_contact()%></td>
                        <td><%=stud.getHigh_school_certificate()%></td>
                        <td><%=stud.getPhoto()%></td>
                        



                        <td>
                            <a href="editStudent.jsp?id=<%=stud.getNational_id()%>&action=Update">Update</a>
                            <a href="editStudent.jsp?id=<%=stud.getNational_id()%>&action=Delete">Delete</a>

                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
               
        </div>


    </body>
</html>
