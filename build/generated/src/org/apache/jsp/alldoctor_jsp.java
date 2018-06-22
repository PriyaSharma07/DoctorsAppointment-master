package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Doctor.Doctor;
import Doctor.DoctorDAOImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public final class alldoctor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head><title>\n");
      out.write("\tAll Doctor's Details\n");
      out.write("</title>\n");
      out.write("    <link href=\"css/Alldoctor.css\" rel=\"stylesheet\" />\n");
      out.write("<link href=\"http://fonts.googleapis.com/css?family=Roboto+Condensed:300italic,400italic,700italic,400,700,300\" rel=\"stylesheet\" type=\"text/css\" /><link href=\"http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("<link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" /><link href=\"maincss/animate.min.css\" rel=\"stylesheet\" /><link href=\"maincss/owl.carousel.css\" rel=\"stylesheet\" /><link href=\"maincss/style.css\" rel=\"stylesheet\" /><link id=\"colors\" href=\"maincss/style1.css\" rel=\"stylesheet\" /><link rel=\"stylesheet\" href=\"maincss/switcher.css\" /><link href=\"maincss/responsive.css\" rel=\"stylesheet\" />\n");
      out.write(" <script src=\"./js/angular.min.js\"></script>\n");
      out.write("   <script type=\"text/javascript\">\n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("<script>\n");
      out.write("        function getDoctorid(item){\n");
      out.write("            \n");
      out.write("            console.log(item);\n");
      out.write("            document.getElementById(\"updatableId\").value = item;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("  </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <!-- Header Starts -->\n");
      out.write("    <header id=\"header\" class=\"header\">\n");
      out.write("\t\t<!-- Header Top Bar Starts -->\n");
      out.write("\t\t\t<div class=\"top-bar\">\n");
      out.write("\t\t\t<!-- Container Starts -->\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<!-- Left Col Starts -->\n");
      out.write("\t\t\t\t\t<ul class=\"list-unstyled list-inline pull-left wow fadeInUp\" data-wow-delay=\"0.3s\" id=\"ll\">\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-earphone\"></span>\n");
      out.write("\t\t\t\t\t\t\t+91 - 9582990886\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-envelope\"></span>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"mailto:Kajgpt77@gmail.com\">RestoreHealth@gmail.com</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<!-- Left Col Ends -->\n");
      out.write("\t\t\t\t<!-- Right Col Starts -->\n");
      out.write("\t\t\t\t\t<ul class=\"list-unstyled list-inline pull-right wow fadeInDown\" data-wow-delay=\"0.5s\">\n");
      out.write("\t\t\t\t\t\t<li id=\"follow\">\n");
      out.write("\t\t\t\t\t\t\tFollow Us\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<a target=\"_blank\" title=\"find us on Facebook\" href=\"http://www.facebook.com\"><img alt=\"follow me on facebook\" src=\"//login.create.net/images/icons/user/facebook_40x40.png\" border=0></a>\n");
      out.write("\t\t\t\t\t<a target=\"_blank\" title=\"follow me on twitter\" href=\"http://www.twitter.com\"><img alt=\"follow me on twitter\" src=\"//login.create.net/images/icons/user/twitter-b_40x40.png\" border=0></a>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<!-- Right Col Ends -->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t<!-- Container Ends -->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t<!-- Header Top Bar Ends -->\n");
      out.write("\t\t<!-- Navbar Starts -->\n");
      out.write("\t\t\t<nav id=\"nav\" class=\"navbar navbar-default sticky-nav\" role=\"navigation\">\n");
      out.write("\t\t\t<!-- Container Starts -->\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<!-- Navbar Header Starts -->\n");
      out.write("\t\t\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("                                            <a href=\"#\" class=\"navbar-brand wow fadeInLeft\" data-wow-delay=\"0.7s\" id=\"dd\">\n");
      out.write("                                                     Restore Health \n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t<!-- Navbar Header Ends -->\n");
      out.write("\t\t\t\t<!-- Navbar Collapse Starts -->\n");
      out.write("\t\t\t\t\t<div class=\"navbar-collapse collapse wow fadeInRight\" data-wow-delay=\"0.9s\">\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t\t\t\t<li><a id=\"menu\" href=\"index.jsp\"><span class=\"glyphicon glyphicon-home\"></span> Home</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a id=\"menu\" href=\"aboutus.jsp\"><span class=\"glyphicon glyphicon-pencil\"></span> About Us</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a id=\"menu\" href=\"contact.jsp\"><span class=\"glyphicon glyphicon-earphone\"></span> Contact</a></li>\n");
      out.write("                                                        <li class=\"current\"><a id=\"menu\" href=\"alldoctor.jsp\"><span class=\"glyphicon glyphicon-th-list\"></span> Doctor's List</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a id=\"menu\" href=\"signin.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("                                                        <li><a id=\"menu\" href=\"rigester.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up </a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- Navbar Collapse Ends -->\n");
      out.write("\t\t\t\t</div></div>\n");
      out.write("\t\t\t<!-- Container Ends -->\n");
      out.write("\t\t\t</nav>\n");
      out.write("\t\t<!-- Navbar Ends -->\n");
      out.write("\t\t</header>\n");
      out.write("  \n");
      out.write("          \n");
      out.write("        <div class=\"container1\">\n");
      out.write("           <input type=\"text\" placeholder=\"Search\" ng-model=\"searchText\"><span id=\"searchicon\" class=\"glyphicon glyphicon-search\"></span></input>\n");
      out.write("\t\t         <br><br>\n");
      out.write("             <div class=\"main\">\n");
      out.write("         \n");
      out.write("\n");
      out.write("              ");

            
        DoctorDAOImpl pdao = new DoctorDAOImpl();
        List<Doctor> list = pdao.getDoctor();
        
        request.setAttribute("data", list);
        
      out.write("\n");
      out.write("             <table class=\"table table-hover\">\n");
      out.write("                <thead> \n");
      out.write("                    <tr>\n");
      out.write("                        <th>Doctor Id</th>\n");
      out.write("                        <th>Name</th>\n");
      out.write("                        <th>Age</th> \n");
      out.write("                        <th>Specialization</th>\n");
      out.write("                        <th>Contact Number</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("            <tbody>\n");
      out.write("               \n");
      out.write("        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            \n");
      out.write("        \n");
      out.write("      \n");
      out.write("    </tbody>\n");
      out.write("</table>\n");
      out.write("       </div>\n");
      out.write("                 </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("     </body>\n");
      out.write("     </html>");
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
          out.write("                   \n");
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
