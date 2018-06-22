package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Doctor.Doctor;
import Doctor.DoctorDAOImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public final class DoctorAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin</title>\n");
      out.write("         <link href=\"css/admin.css\" rel=\"stylesheet\" />\n");
      out.write("    </head>\n");
      out.write("    <script>\n");
      out.write("        function getDoctorid(item){\n");
      out.write("            \n");
      out.write("            console.log(item);\n");
      out.write("            document.getElementById(\"updatableId\").value = item;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("  </script>\n");
      out.write("   \n");
      out.write("    <body>\n");
      out.write("        <h1>Admin Panel</h1>\n");
      out.write("        \n");
      out.write("        <div id=\"structure\">\n");
      out.write("<div id=\"main\">    \n");
      out.write("            <p id=\"heading\"> ADD DOCTOR </p>\n");
      out.write("            <form action=\"EditDoctor\" method=\"post\">\n");
      out.write("                \n");
      out.write("            <p id=\"data1\"> Doctor Name: <input type=\"text\" name=\"name\"  /></p>\n");
      out.write("            \n");
      out.write("            <p id=\"data1\"> Age <input type=\"text\" name=\"age\"  /></p>\n");
      out.write("          \n");
      out.write("            <p id=\"data1\"> Specialization <input type=\"text\" name=\"specialization\"  /></p>\n");
      out.write("           \n");
      out.write("            <p id=\"data1\"> Phone <input type=\"text\" name=\"phone\"  /></p>\n");
      out.write("            \n");
      out.write("            <p id=\"data1\"> Address: <input type=\"text\" name=\"address\"  /></p>\n");
      out.write("            \n");
      out.write("            <p id=\"data1\"> Pincode: <input type=\"text\" name=\"pincode\"  /></p>\n");
      out.write("            \n");
      out.write("            <p id=\"data1\"> Email: <input type=\"text\" name=\"email\" /></p>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("                      <input type=\"Submit\" value=\"Add\"></input>\n");
      out.write("    </form>\n");
      out.write("</div></div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("         ");

            
        DoctorDAOImpl pdao = new DoctorDAOImpl();
        List<Doctor> list = pdao.getDoctor();
        
        request.setAttribute("data", list);
        
      out.write("\n");
      out.write("        \n");
      out.write("        <table>\n");
      out.write("            <thead> \n");
      out.write("                    <tr>\n");
      out.write("                        <th>Doctor ID</th>\n");
      out.write("                        <th>Doctor Name</th>\n");
      out.write("                        <th>Age</th>\n");
      out.write("                        <th>Specialization</th>\n");
      out.write("                        <th>Phone</th>\n");
      out.write("                        <th>Address</th>\n");
      out.write("                        <th>Pincode</th>\n");
      out.write("                        <th>Email</th>\n");
      out.write("                        <th colspan=2>Action</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                \n");
      out.write("                <tbody>\n");
      out.write("                    <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"x\">\n");
      out.write("                    <tr>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("           <td>   ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getDoctorid()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </td>\n");
      out.write("            <td> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getDoctorName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </td>\n");
      out.write("            <td> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getAge()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </td>\n");
      out.write("            <td> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getSpecialization()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </td>\n");
      out.write("            <td> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getPhone()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </td>\n");
      out.write("           <td> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getAddress()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </td>\n");
      out.write("            <td> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getPincode()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </td>\n");
      out.write("            <td> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </td>\n");
      out.write("           <td><a href=\"ProfilesDAOImpl?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>Update</a></td>\n");
      out.write("                <td><a href=\"ProfilesDAOImpl?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">delete</a></td>\n");
      out.write("                    \n");
      out.write("                            </tr> \n");
      out.write("                    </c:forEach>\n");
      out.write("                            \n");
      out.write("                </tbody>\n");
      out.write("           </table>\n");
      out.write("              \n");
      out.write("        \n");
      out.write("      \n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
