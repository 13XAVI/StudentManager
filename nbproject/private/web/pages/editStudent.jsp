<%-- 
    Document   : editStudent
    Created on : Mar 10, 2023, 1:30:55 PM
    Author     : t
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="com.sms.model.Student"%>
<%@page import="com.sms.service.StudentService"%>
<%@page import="com.sms.service.StudentInterface"%>
<jsp:useBean id="studBean" class="com.sms.beans.StudentBean" scope="request" />

<%
    HttpSession prevSession = request.getSession(false);
    prevSession.getAttribute("username");
    
    
    studBean.setNational_id(request.getParameter("id"));
    String action = request.getParameter("action");

    StudentInterface stud = new StudentService();
    Student student = stud.findStudent(studBean.getNational_id());

    DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    studBean.setDob(formatter.format(student.getDob()));
    
    studBean.setFirst_name(student.getFirst_name());
    studBean.setLast_name(student.getLast_name());

    studBean.setGender(student.getGender());
    studBean.setPhoto(student.getPhoto());
    studBean.setNationality(student.getNationality());
    studBean.setEmail(student.getEmail());
    studBean.setTel_number(student.getTel_number());
    studBean.setParent_contact(student.getParent_contact());
    studBean.setHigh_school_certificate(student.getHigh_school_certificate());
    studBean.setFaculty(student.getFaculty());
    studBean.setDepartment(student.getDepartment());
    studBean.setPhoto(student.getPhoto());
    
    studBean.setAdmitted(student.getAdmitted());
    request.setAttribute("action", action);
    
    HttpSession newSession = request.getSession(true);
    
    newSession.setAttribute("username",  prevSession.getAttribute("username"));
    request.getRequestDispatcher("adminEdit.jsp").forward(request, response);

%>
