package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import profiles.Profiles;
import profiles.ProfilesDAOImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public final class Admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin</title>\n");
      out.write("         <link href=\"css/admin.css\" rel=\"stylesheet\" />\n");
      out.write("<link href=\"http://fonts.googleapis.com/css?family=Roboto+Condensed:300italic,400italic,700italic,400,700,300\" rel=\"stylesheet\" type=\"text/css\" /><link href=\"http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("<link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" /><link href=\"maincss/animate.min.css\" rel=\"stylesheet\" /><link href=\"maincss/owl.carousel.css\" rel=\"stylesheet\" /><link href=\"maincss/style.css\" rel=\"stylesheet\" /><link id=\"colors\" href=\"maincss/style1.css\" rel=\"stylesheet\" /><link rel=\"stylesheet\" href=\"maincss/switcher.css\" /><link href=\"maincss/responsive.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("   \n");
      out.write("    <body>\n");
      out.write("        <h1>Admin Panel</h1>\n");
      out.write("        \n");
      out.write("           <div id=\"structure\">\n");
      out.write("<div id=\"main\">  \n");
      out.write("            <p id=\"heading\"> ADD USER </p>\n");
      out.write("            <form action=\"EditRecord\" method=\"post\">\n");
      out.write("                \n");
      out.write("            <p id=\"data1\"> Name: <input type=\"text\" name=\"fullname\" Placeholder=\"Enter Name\" /></p>\n");
      out.write("            \n");
      out.write("            <p id=\"data1\"> Password: <input type=\"text\" name=\"password\" Placeholder=\"Enter Password\" /></p>\n");
      out.write("          \n");
      out.write("            <p id=\"data1\"> Phone: <input type=\"text\" name=\"phonenumber\" Placeholder=\"Enter Phone\" /></p>\n");
      out.write("           \n");
      out.write("            <p id=\"data1\"> Email: <input type=\"text\" name=\"email\" Placeholder=\"Enter Email\" /></p>\n");
      out.write("            \n");
      out.write("            <p id=\"data1\"> Address: <input type=\"text\" name=\"address\" Placeholder=\"Enter Address\" /></p>\n");
      out.write("            \n");
      out.write("            <p id=\"data1\"> Pincode: <input type=\"text\" name=\"pincode\" Placeholder=\"Enter Pincode\" /></p>\n");
      out.write("            \n");
      out.write("            <p id=\"data1\"> Country: <input type=\"text\" name=\"country\" Placeholder=\"Enter Country\" /></p>\n");
      out.write("            \n");
      out.write("            <p id=\"data1\"> Gender: <input type=\"text\" name=\"gender\" Placeholder=\"Enter Gender\" /></p>\n");
      out.write("            \n");
      out.write("                      <input type=\"Submit\" value=\"Add User\"></input>\n");
      out.write("    </form>\n");
      out.write("        </div>\n");
      out.write("           </div>\n");
      out.write("        \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        ");

            
        ProfilesDAOImpl pdao = new ProfilesDAOImpl();
        List<Profiles> list = pdao.getProfiles();
        
        request.setAttribute("data", list);
        
      out.write("\n");
      out.write("        \n");
      out.write("        <table>\n");
      out.write("            <thead> \n");
      out.write("                    <tr>\n");
      out.write("                        <th>Patient ID</th>\n");
      out.write("                        <th>Full Name</th>\n");
      out.write("                        <th>Password</th>\n");
      out.write("                        <th>Phone</th>\n");
      out.write("                        <th>Email</th>\n");
      out.write("                        <th>Address</th>\n");
      out.write("                        <th>Pincode</th>\n");
      out.write("                        <th>Country</th>\n");
      out.write("                        <th>Gender</th>\n");
      out.write("                        <th colspan=2>Action</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                \n");
      out.write("                <tbody>\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            \n");
      out.write("                </tbody>\n");
      out.write("           </table>\n");
      out.write("        \n");
      out.write("  \n");
      out.write("   <!-- Modal -->\n");
      out.write("  <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog modal-lg\">\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("          <h4 id=\"header1\" class=\"modal-title\">Update</h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("                    <form id=\"main\" action=\"UpdateServlet\" method=\"post\" name=\"myform\">\n");
      out.write("\n");
      out.write("             <p id=\"data1\"> <input type=\"hidden\" name=\"id\" value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'/><br></p>\n");
      out.write("        <p id=\"data1\"> NAME <input type=\"text\" name=\"fullname\" placeholder=\"Enter Name\" value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'></p>\n");
      out.write("          <p id=\"data1\"> PASSWORD <input type=\"text\" name=\"password\" placeholder=\"Enter Password\" value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'></p>\n");
      out.write("          <p id=\"data1\"> PHONE <input type=\"text\" name=\"phone\" placeholder=\"Enter Phone\" value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'></p>\n");
      out.write("           <p id=\"data1\"> EMAIL <input type=\"text\" name=\"email\" placeholder=\"Enter Email\" value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'></p>\n");
      out.write("          <p id=\"data1\"> ADDRESS <input type=\"text\" name=\"address\" placeholder=\"Enter Address\" value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'></p>\n");
      out.write("          <p id=\"data1\"> PINCODE <input type=\"text\" name=\"pincode\" placeholder=\"Enter Pincode\" value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pin}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'></p>\n");
      out.write("           <p id=\"data1\"> COUNTRY <input type=\"text\" name=\"country\" placeholder=\"Enter Country\" value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${country}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'></p>\n");
      out.write("          <p id=\"data1\"> GENDER <input type=\"text\" name=\"gender\" placeholder=\"Enter Gender\" value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${gender}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'></p>\n");
      out.write("         \n");
      out.write("                    \n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-footer\">\n");
      out.write("            <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\"><b>Close</b></button>\n");
      out.write("         \n");
      out.write("          <input type=\"Submit\" class=\"btn btn-default\" value=\"Update\"></input>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("x");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <tr>\n");
          out.write("        \n");
          out.write("        \n");
          out.write("            <td>   ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>\n");
          out.write("            <td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getFullname()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>\n");
          out.write("            <td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getPassword()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>\n");
          out.write("            <td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getPhone()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>\n");
          out.write("            <td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>\n");
          out.write("            <td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getAddress()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>\n");
          out.write("            <td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getpincode()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>\n");
          out.write("            <td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getcountry()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>\n");
          out.write("            <td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getgender()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>\n");
          out.write("            <td><button type=\"button\" id=\"heading1\" data-toggle=\"modal\" data-target=\"#myModal\">Update</button>\n");
          out.write("           </td>\n");
          out.write("                <td><a href=\"DeleteRecord?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">delete</a></td>\n");
          out.write("                    \n");
          out.write("                            </tr> \n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
