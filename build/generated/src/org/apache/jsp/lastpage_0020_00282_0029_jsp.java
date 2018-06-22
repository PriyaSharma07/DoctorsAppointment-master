package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class lastpage_0020_00282_0029_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Appointment</title>\n");
      out.write("         <link href=\"css/lastpage(2).css\" rel=\"stylesheet\" />       \n");
      out.write("    <link href=\"http://fonts.googleapis.com/css?family=Roboto+Condensed:300italic,400italic,700italic,400,700,300\" rel=\"stylesheet\" type=\"text/css\" /><link href=\"http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Template CSS Files  -->\n");
      out.write("\t<link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" /><link href=\"maincss/animate.min.css\" rel=\"stylesheet\" /><link href=\"maincss/owl.carousel.css\" rel=\"stylesheet\" /><link href=\"maincss/style.css\" rel=\"stylesheet\" /><link id=\"colors\" href=\"maincss/style1.css\" rel=\"stylesheet\" /><link rel=\"stylesheet\" href=\"maincss/switcher.css\" /><link href=\"maincss/responsive.css\" rel=\"stylesheet\" /></head>\n");
      out.write("    <body>\n");
      out.write("        \n");
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
      out.write("                                                        <li><a id=\"menu\" href=\"alldoctor.jsp\"><span class=\"glyphicon glyphicon-th-list\"></span> Doctor's List</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a id=\"menu\" href=\"signin.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("                                                        <li><a id=\"menu\" href=\"rigester.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up </a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- Navbar Collapse Ends -->\n");
      out.write("\t\t\t\t</div></div>\n");
      out.write("\t\t\t<!-- Container Ends -->\n");
      out.write("\t\t\t</nav>\n");
      out.write("\t\t<!-- Navbar Ends -->\n");
      out.write("\t\t</header>\n");
      out.write("   \n");
      out.write("    \n");
      out.write("    <div id=\"details\">\n");
      out.write("        <p id=\"data\"> Name: </p>\n");
      out.write("        <p id=\"data\"> Id: </p>\n");
      out.write("        <p id=\"data\"> Doctor Name: </p>\n");
      out.write("        <p id=\"data\">Address:</p>\n");
      out.write("        <p id=\"data\">Email: </p>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div id=\"main\">\n");
      out.write("        <div id=\"box\">\n");
      out.write("            <p id=\"heading\">Appointment</p>\n");
      out.write("            <img id=\"img\" src=\"images/22.png\"></img>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"box\">\n");
      out.write("            <p id=\"heading\">Cancellation</p>\n");
      out.write("            <img id=\"img\" src=\"images/23.png\"></img>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"box1\">\n");
      out.write("            <p id=\"heading\">Doctor Schedule</p>\n");
      out.write("           <img id=\"img\" src=\"images/24.png\"></img>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
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
