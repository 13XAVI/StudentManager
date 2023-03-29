package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.sms.model.Student;
import com.sms.service.StudentService;
import com.sms.service.StudentInterface;
import java.util.ArrayList;
import java.util.List;
import com.sms.service.LoginService;
import com.sms.service.LoginInterface;
import com.sms.model.Login;

public final class Display_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-compatible\" content=\"ie-edge\">\n");
      out.write("        <title>Admission Form</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/admin.css\" />\n");
      out.write("        <script defer src=\"../js/admin.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    ");

        HttpSession prevSession = request.getSession(false);
        prevSession.getAttribute("username");
    
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <h1>All Student Information</h1>\n");
      out.write("        <a href=\"login.jsp\" data-i18n=\"success\" class=\"Back\"> Turn Back</a></br</br>\n");
      out.write("        <div>\n");
      out.write("            <table>\n");
      out.write("                <thead>\n");
      out.write("                <th>First Name</th>\n");
      out.write("                <th>Last Name</th>\n");
      out.write("                <th>Gender</th>\n");
      out.write("                <th>Date of Birth</th>\n");
      out.write("                <th>Faculty</th>\n");
      out.write("                <th>Department</th>\n");
      out.write("                <th>Nationality</th>\n");
      out.write("                <th>Email</th>\n");
      out.write("                <th>Tel_Number</th>\n");
      out.write("                <th>Parent Conctact</th>\n");
      out.write("                <th>School Certificate</th>\n");
      out.write("                <th>Photo</th>\n");
      out.write("                <th>Action</th>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("\n");
      out.write("                    ");

                        List<Student> students = new ArrayList<Student>();
                        StudentInterface studService = new StudentService();
                        students = studService.findAll();

                        for (Student stud : students) {
                    
      out.write("\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(stud.getFirst_name());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(stud.getLast_name());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(stud.getGender());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(stud.getDob());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(stud.getFaculty());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(stud.getDepartment());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(stud.getNationality());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(stud.getEmail());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(stud.getTel_number());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(stud.getParent_contact());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(stud.getHigh_school_certificate());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(stud.getPhoto());
      out.write("</td>\n");
      out.write("                        \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <td>\n");
      out.write("                            <a href=\"editStudent.jsp?id=");
      out.print(stud.getNational_id());
      out.write("&action=Update\">Update</a>\n");
      out.write("                            <a href=\"editStudent.jsp?id=");
      out.print(stud.getNational_id());
      out.write("&action=Delete\">Delete</a>\n");
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("               \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
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
