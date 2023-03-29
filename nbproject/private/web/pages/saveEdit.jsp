<%-- 
    Document   : saveEdit
    Created on : Mar 11, 2023, 11:34:05 AM
    Author     : t
--%>

<%@page import="java.io.OutputStream"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="com.sms.service.StudentService"%>
<%@page import="com.sms.service.StudentInterface"%>
<%@page import="com.sms.model.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="studBean" class="com.sms.beans.StudentBean" scope="request" />
<%
    HttpSession prevSession = request.getSession(false);

    Student student = new Student();
    Student studPrevious = new Student();
    StudentInterface studCheck = new StudentService();

    studPrevious = studCheck.findStudent(request.getParameter("id"));

    byte[] photoData = studPrevious.getPhoto();
    byte[] certiData = studPrevious.getHigh_school_certificate();

    DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    if (request.getParameter("age") != null) {
        student.setDob(formatter.parse(request.getParameter("age")));
    }

    student.setPhoto(photoData);
    student.setHigh_school_certificate(certiData);

    student.setNational_id(request.getParameter("id"));
    student.setFirst_name(request.getParameter("first_name"));
    student.setLast_name(request.getParameter("last_name"));
    student.setGender(request.getParameter("gender"));

    student.setNationality(request.getParameter("nationality"));
    student.setEmail(request.getParameter("per_email"));
    student.setTel_number(request.getParameter("tel_personal"));
    student.setParent_contact(request.getParameter("tel_parent"));

    student.setFaculty(request.getParameter("faculty"));
    student.setDepartment(request.getParameter("department"));

    if (request.getParameter("admission").equalsIgnoreCase("true")) {
        student.setAdmitted(true);
    } else if (request.getParameter("admission").equalsIgnoreCase("false")) {
        student.setAdmitted(false);
    } else {
        student.setAdmitted(null);
    }
    StudentInterface stud = new StudentService();

    if (request.getParameter("action").equals("Update")) {
        stud.updateStudent(student);
    } else if (request.getParameter("action").equals("Delete")) {
        stud.deleteStudent(student);
    }

    HttpSession newSession = request.getSession(true);
    
    newSession.setAttribute("username", prevSession.getAttribute("username"));
    request.getRequestDispatcher("admin.jsp").forward(request, response);

%>