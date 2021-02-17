package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class F1StudentForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel =\"stylesheet\" type=\"text/css\" href=\"StudentFormStyles.css\">\n");
      out.write("    </head>\n");
      out.write("<!--    <body>\n");
      out.write("                <h1>Hello World!</h1>\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <form action = \"AddStudent.jsp\" method=\"POST\" >\n");
      out.write("                \n");
      out.write("                    <table>\n");
      out.write("                   \n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Student Information Form</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                  \n");
      out.write("                    \n");
      out.write("                        <tbody>\n");
      out.write("                       \n");
      out.write("                            <td>\n");
      out.write("                                Student Id: \n");
      out.write("                            </td>\n");
      out.write("                        \n");
      out.write("                            <td>\n");
      out.write("                                <input type=\"text\" name=\"id\"> </td>\n");
      out.write("                       \n");
      out.write("                            <td>Name</td>\n");
      out.write("                            <td><input type=\"text\" name=\"name\"> </td>\n");
      out.write("                        \n");
      out.write("                            <td> Gender </td>\n");
      out.write("                            <td><select name=\"gender\">\n");
      out.write("                                    <option>MALE</option>  \n");
      out.write("                                    <option>FEMALE</option>    \n");
      out.write("                                </select>\n");
      out.write("                            </td>\n");
      out.write("                       \n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    Date of Birth\n");
      out.write("                                </td> \n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"date\" name =\"dob\">\n");
      out.write("                                </td>\n");
      out.write("                            </tr> \n");
      out.write("                       \n");
      out.write("                            <tr>\n");
      out.write("                                <td></td>\n");
      out.write("                                <td></td>\n");
      out.write("                            </tr>  \n");
      out.write("                        \n");
      out.write("                            <tr>\n");
      out.write("                                <td></td>\n");
      out.write("                                <td><button type=\"submit\">Next</button></td>\n");
      out.write("                            </tr>\n");
      out.write("                      \n");
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>-->\n");
      out.write("<body style=\"display: grid;width: 100%; height:100%\">\n");
      out.write("        <div class=\"Container\" style=\"background-color: grey\">\n");
      out.write("\n");
      out.write("            <div class=\"box\" style=\"margin-left: 400px ; margin-right: 400px; margin-top: 20px;margin-bottom: 100%; background-color: white;border-radius: 20px;   \">\n");
      out.write("                <div class=\"text\" style=\"border-radius: 15px 15px 0 0; background-color:blueviolet;font-weight: 600;line-height: 100px\">\n");
      out.write("                    <h1 style=\"text-align: center; color: black;font-size: 25px\">Student Information Form</h1>\n");
      out.write("                </div>\n");
      out.write("                <form style=\"display: flex; flex-direction: column;  padding: 5px; margin-top: 50px; border-color:blueviolet \" action=\"AddStudent.jsp\" method=\"POST\">\n");
      out.write("\n");
      out.write("                    <input style=\"padding: 10px; margin-left: 20px; margin-right: 20px; border-radius: 15px;outline: none;border: 2px solid lightgrey;transition: all 0.3s ease\" type=\"text\" placeholder=\"Write the Student id number\" name=\"id\">\n");
      out.write("\n");
      out.write("                    <span style=\"margin-bottom: 10px\"></span>\n");
      out.write("                    <input  style=\"padding: 10px; margin-left: 20px; margin-right: 20px; border-radius: 15px;outline: none;border: 2px solid lightgrey\" type=\"text\" placeholder=\"Enter Student's Name\" name=\"name\">\n");
      out.write("                    <span style=\"margin-bottom: 10px\"></span>\n");
      out.write("                    <select style=\"padding: 10px; margin-left: 20px; margin-right: 20px; border-radius: 15px;outline: none; border-color: black;border: 2px solid lightgrey\" type=\"text\" name=\"gender\">Select gender\n");
      out.write("                        <option>Male</option>\n");
      out.write("                        <option>Female</option>\n");
      out.write("                    </select>\n");
      out.write("                    <span style=\"margin-bottom: 10px\"></span>\n");
      out.write("                    <input style=\"padding: 10px; margin-left: 20px; margin-right: 20px; border-radius: 15px;outline: none;border: 2px solid lightgrey\" type=\"date\" name=\"Date\" >\n");
      out.write("                    <span style=\"margin-bottom: 10px\"></span>\n");
      out.write("                    <button type=\"submit\" style=\"padding:10px; margin-left: 20px; margin-right: 20px; border-radius: 15px; margin-bottom: 50px; background-color: purple; color:white;font-size:20px\">Next</button>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
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
