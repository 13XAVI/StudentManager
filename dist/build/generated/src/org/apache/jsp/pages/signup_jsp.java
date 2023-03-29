package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"../css/signup.css\">\n");
      out.write("\n");
      out.write("<script defer src=\"../js/signup.js\"></script>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-compatible\" content=\"ie-edge\">\n");
      out.write("        <title data-i18n=\"name\">Sign Up Page</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <form action=\"signRegister.jsp\" method=\"POST\" id=\"signup\">\n");
      out.write("            <header class=\"navbar\">\n");
      out.write("\n");
      out.write("                ");

                    HttpSession prevSession = request.getSession(false);
                    String sessionLanguage = (String) prevSession.getAttribute("language");
                    if (sessionLanguage == null) {
                        sessionLanguage = "en"; // Default language
                    }
                
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
      out.write("            </header>\n");
      out.write("            <h1 data-i18n=\"title\">Sign Up Form</h1>\n");
      out.write("            <p  data-i18n=\"description\">Please fill this form with accurate information</p>\n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <label for=\"email\" data-i18n=\"email\">Email:</label>\n");
      out.write("                <input type=\"email\" id=\"email\" name=\"email\" required>\n");
      out.write("                <span id=\"email-error\" class=\"error-message\"></span>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <label for=\"password\" data-i18n=\"password\">Password:</label>\n");
      out.write("                <input type=\"password\" id=\"password\" name=\"password\" required>\n");
      out.write("                <span id=\"password-error\" class=\"error-message\"></span>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <label for=\"confirm-password\" data-i18n=\"confirm_passowrd\">Confirm Password:</label>\n");
      out.write("                <input type=\"password\" id=\"confirm-password\" name=\"confirm-password\" required>\n");
      out.write("                <span id=\"confirm-password-error\" class=\"error-message\"></span>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <br>\n");
      out.write("                <button type=\"submit\" data-i18n=\"sign_up\">Sign Up</button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("\n");
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
