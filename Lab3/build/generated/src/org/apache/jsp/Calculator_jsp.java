package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Calculator_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        ");

            String num1 = "0", num2 = "0";
            int result = 0;
            String op = "+";
            char opchar = op.charAt(0);
            
            if (request.getParameter("op") != null) {
                op = request.getParameter("op");
                opchar = op.charAt(0);
                
                num1 = request.getParameter("operandi1");
                num2 = request.getParameter("operandi2");
            
                switch(opchar) {
                    case '0': result = Integer.parseInt(num1) + Integer.parseInt(num2);
                    break;
                    case '1': result = Integer.parseInt(num1) - Integer.parseInt(num2);
                    break;
                    case '2': result = Integer.parseInt(num1) * Integer.parseInt(num2);
                    break;
                    case '3': result = Integer.parseInt(num1) / Integer.parseInt(num2);
                    break;
                    case '4': result = Integer.parseInt(num1) % Integer.parseInt(num2);
                    break;
                }
            }
        
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"#a00FFF\" text=\"gold\">\n");
      out.write("    <center>\n");
      out.write("        \n");
      out.write("        <h2>Basic Calculator Program in JSP</h2>\n");
      out.write("        <form method=\"GET\" name=\"fi\">\n");
      out.write("            <input type=\"text\" size=\"20\" name=\"operandi1\" value=\"\"/>\n");
      out.write("            <select name=\"op\" size=\"1\">\n");
      out.write("                <option value=\"0\">+</option>\n");
      out.write("                <option value=\"1\">-</option>\n");
      out.write("                <option value=\"2\">*</option>\n");
      out.write("                <option value=\"3\">/</option>\n");
      out.write("                <option value=\"4\">%</option>\n");
      out.write("            </select>\n");
      out.write("            \n");
      out.write("            <input type=\"text\" size=\"20\" name=\"operandi2\" value=\"\"/>\n");
      out.write("            <p><br><br><br><br>\n");
      out.write("                <input type=\"submit\" value=\"Calculate\"/>\n");
      out.write("                Result = ");
      out.print(result + "");
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </center>\n");
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
