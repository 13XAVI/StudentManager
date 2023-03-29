<%-- 
    Document   : loginCheck
    Created on : Mar 9, 2023, 1:25:20 PM
    Author     : t
--%>

<%@page import="com.sms.service.LoginInterface"%>
<%@page import="com.sms.service.LoginService"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.sms.model.Login"%>


<%

    List<Login> logs = new ArrayList<Login>();
    LoginInterface logService = new LoginService();
    logs = logService.findAll();
    Boolean found = false;

    if (request.getParameter("username").equals("admin@me.com")
            && request.getParameter("password").equals("admin")) {
        HttpSession mySession = request.getSession(true);
        
         mySession.setAttribute("username", request.getParameter("username"));
        request.getRequestDispatcher("admin.jsp").forward(request, response);

    }
    for (Login log : logs) {
        if (request.getParameter("username").equals(log.getEmail())
                && request.getParameter("password").equals(log.getPassword())) {
            found = true;
        }
    }

    if (found) {
        HttpSession mySession = request.getSession(true);
        mySession.setAttribute("loggedInUSer", request.getParameter("username"));
        mySession.setAttribute("username", request.getParameter("username"));
        mySession.setAttribute("language", request.getParameter("language"));
         String email = request.getParameter("email");
         session.setAttribute("tresorxavier16@gmail.com", email);
                    session.setAttribute("isLoggedIn", true);
                    
                    session.setMaxInactiveInterval(86400*365);
                    Cookie userCookie = new Cookie("Tresor", email);
                    userCookie.setMaxAge(86400*365);
                    response.addCookie(userCookie);
                    
                    //readCookie
                    Cookie[] cookies = request.getCookies();
                    if (cookies != null) {
                        for (Cookie cookie : cookies) {
                            if (cookie.getName().equals("Hey")) {
                                out.println("Cookie value: " + cookie.getValue());
                            }
                        }
                    }
        request.getRequestDispatcher("Home_1.jsp").forward(request, response);
   

    } else {
     
        request.getRequestDispatcher("login.jsp").forward(request, response);

    }
%>