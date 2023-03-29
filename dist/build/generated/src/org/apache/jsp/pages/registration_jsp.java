package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\" >\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-compatible\" content=\"ie-edge\">\n");
      out.write("        <title>Registration Form</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/registration.css\">\n");
      out.write("        <script defer src=\"../js/registration.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <form action=\"registerStudent.jsp\" method=\"POST\" id=\"registration\" onchange=\"changeLanguage()\">\n");
      out.write("            <header class=\"navbar\">\n");
      out.write("\n");
      out.write("                ");

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
                
      out.write("\n");
      out.write("\n");
      out.write("                <nav class=\"navbar-menu\">\n");
      out.write("                    <select id=\"language-select\" name=\"language\" onchange=\"changeLanguage()\">\n");
      out.write("                        <option value=\"en\" ");
      out.print( sessionLanguage.equals("en") ? "selected" : "");
      out.write(">English</option>\n");
      out.write("                        <option value=\"fr\" ");
      out.print( sessionLanguage.equals("fr") ? "selected" : "");
      out.write(">Français</option>\n");
      out.write("                        <option value=\"kin\" ");
      out.print( sessionLanguage.equals("kin") ? "selected" : "");
      out.write(">Kinyarwanda</option>\n");
      out.write("                    </select>\n");
      out.write("                </nav>\n");
      out.write("                <!-- <button id=\"nav-toggle\" class=\"navbar-toggle\">\n");
      out.write("                    <span></span>\n");
      out.write("                    <span></span>\n");
      out.write("                    <span></span>\n");
      out.write("                </button> -->\n");
      out.write("            </header>\n");
      out.write("            <main>\n");
      out.write("                <h1 data-i18n=\"title\">Registration Form</h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <h3 data-i18n=\"personal_information\">Personal information</h3>\n");
      out.write("                <fieldset>\n");
      out.write("                    <label for=\"id\" data-i18n=\"id\">ID:</label> <input type=\"text\" name=\"id\" />\n");
      out.write("                    <label for=\"first_name\" data-i18n=\"first_name\">First Name:</label> <input type=\"text\" name=\"first_name\"\n");
      out.write("                                                                                              required />\n");
      out.write("                    <label for=\"last_name\" data-i18n=\"last_name\">Last Name: </label><input type=\"text\" name=\"last_name\"\n");
      out.write("                                                                                           required />\n");
      out.write("\n");
      out.write("                    <label for=\"gender\" data-i18n=\"gender\">Gender:</label>\n");
      out.write("                    <select name=\"gender\">\n");
      out.write("                        <option value=\"\" data-i18n=\"select_one\">(select one)</option>\n");
      out.write("                        <option value=\"male\" data-i18n=\"male\">Male</option>\n");
      out.write("                        <option value=\"Female\" data-i18n=\"female\">Female</option>\n");
      out.write("                        <option value=\"non\" data-i18n=\"none\">Prefer not to say</option>\n");
      out.write("                    </select>\n");
      out.write("\n");
      out.write("                    <label for=\"dob\" data-i18n=\"dob\">Date of Birth:</label> <input type=\"date\" name=\"age\" required />\n");
      out.write("                    <label for=\"photo\" data-i18n=\"photo\">Upload a profile picture: </label><input type=\"file\" name=\"photo\"\n");
      out.write("                                                                                                  data-i18n=\"file\" accept=\"image/jpeg, image/png/\">\n");
      out.write("\n");
      out.write("                </fieldset>\n");
      out.write("\n");
      out.write("                <h3 data-i18n=\"address_contact\">Address/Contact</h3>\n");
      out.write("                <fieldset>\n");
      out.write("                    <label for=\"nationality\" data-i18n=\"nationality\">Nationality:</label>\n");
      out.write("                    <input type=\"text\" name=\"nationality\" required />\n");
      out.write("\n");
      out.write("                    <label for=\"email\" data-i18n=\"email\">Email: </label><input type=\"email\" name=\"per_email\" required />\n");
      out.write("                    <label for=\"tel_person\" data-i18n=\"tel_personal\">Telephone Number:</label> <input type=\"text\"\n");
      out.write("                                                                                                      name=\"tel_personal\" required />\n");
      out.write("                    <label for=\"tel_parent\" data-i18n=\"tel_parent\">Parent Contact: </label><input type=\"text\"\n");
      out.write("                                                                                                  name=\"tel_parent\" />\n");
      out.write("\n");
      out.write("                </fieldset>\n");
      out.write("\n");
      out.write("                <h3 data-i18n=\"academic\">Academic Information</h3>\n");
      out.write("                <fieldset>\n");
      out.write("                    <label for=\"certificate\" data-i18n=\"certificate\">Upload your High School Certificate:</label> <input\n");
      out.write("                        type=\"file\" name=\"certificate\" accept=\"application/pdf\" required />\n");
      out.write("\n");
      out.write("                    <label for=\"faculty\" data-i18n=\"faculty\">Faculty:</label>\n");
      out.write("                    <select id=\"faculty\" name=\"faculty\">\n");
      out.write("                        <option value=\"\" data-i18n=\"select_one\">(select one)</option>\n");
      out.write("                        <option value=\"Information_Technology\" data-i18n=\"it\">Information Technology</option>\n");
      out.write("                        <option value=\"Education\" data-i18n=\"education\">Education</option>\n");
      out.write("                        <option value=\"Business\" data-i18n=\"business\">Business</option>\n");
      out.write("\n");
      out.write("                    </select>\n");
      out.write("\n");
      out.write("                    <label for=\"department\" data-i18n=\"department\">Department:</label>\n");
      out.write("                    <select id=\"department\" name=\"department\">\n");
      out.write("                        <option value=\"\" data-i18n=\"select_one\">(select one)</option>\n");
      out.write("                    </select>\n");
      out.write("\n");
      out.write("                </fieldset>\n");
      out.write("                <button type=\"submit\"  data-i18n=\"register\" value=\"Submit\">Register</button>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </main>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
