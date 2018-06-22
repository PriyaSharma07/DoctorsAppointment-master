package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class InsertData_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Insert</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <form action=\"\n");
      out.write("          \" method=\"post\">\n");
      out.write("                <p id=\"data1\"> Id: <input type=\"text\" name=\"id\" Placeholder=\"Enter Id\" /></p>\n");
      out.write("            <br>\n");
      out.write("            <p id=\"data1\"> Name: <input type=\"text\" name=\"fullname\" Placeholder=\"Enter Name\" /></p>\n");
      out.write("            <br>\n");
      out.write("            <p id=\"data1\"> Password: <input type=\"text\" name=\"password\" Placeholder=\"Enter Password\" /></p>\n");
      out.write("            <br>\n");
      out.write("            <p id=\"data1\"> Phone: <input type=\"text\" name=\"phone\" Placeholder=\"Enter Phone\" /></p>\n");
      out.write("            <br>\n");
      out.write("            <p id=\"data1\"> Email: <input type=\"text\" name=\"email\" Placeholder=\"Enter Email\" /></p>\n");
      out.write("            <br>\n");
      out.write("            <p id=\"data1\"> Address: <input type=\"text\" name=\"address\" Placeholder=\"Enter Address\" /></p>\n");
      out.write("            <br>\n");
      out.write("            <p id=\"data1\"> Pincode: <input type=\"text\" name=\"pin\" Placeholder=\"Enter Pincode\" /></p>\n");
      out.write("            <br>\n");
      out.write("            <p id=\"data1\"> Country: <input type=\"text\" name=\"country\" Placeholder=\"Enter Country\" /></p>\n");
      out.write("            <br>\n");
      out.write("            <p id=\"data1\"> Gender: <input type=\"text\" name=\"gender\" Placeholder=\"Enter Gender\" /></p>\n");
      out.write("            <br>\n");
      out.write("                      <input type=\"Submit\" class=\"btn btn-default\"></input>\n");
      out.write("    </form>\n");
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
