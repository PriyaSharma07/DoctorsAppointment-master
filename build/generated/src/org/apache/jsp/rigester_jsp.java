package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class rigester_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    \n");
      out.write("    <title>Register</title>\n");
      out.write("<!-- Include CSS File Here -->\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"css/rigester.css\" \n");
      out.write("type=\"text/css\">\n");
      out.write("<link href=\"http://fonts.googleapis.com/css?family=Roboto+Condensed:300italic,400italic,700italic,400,700,300\" rel=\"stylesheet\" type=\"text/css\" /><link href=\"http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Template CSS Files  -->\n");
      out.write("\t<link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" /><link href=\"maincss/animate.min.css\" rel=\"stylesheet\" /><link href=\"maincss/owl.carousel.css\" rel=\"stylesheet\" /><link href=\"maincss/style.css\" rel=\"stylesheet\" /><link id=\"colors\" href=\"maincss/style1.css\" rel=\"stylesheet\" /><link rel=\"stylesheet\" href=\"maincss/switcher.css\" /><link href=\"maincss/responsive.css\" rel=\"stylesheet\" /></head>\n");
      out.write("\n");
      out.write("<script src=\"./js/angular.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    input.ng-invalid.ng-dirty{border:1px solid red;}\n");
      out.write("    \n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    \n");
      out.write("    var myApp = angular.module(\"myApp\",[]);\n");
      out.write("    \n");
      out.write("    myApp.controller(\"myCtrl\",function($scope){\n");
      out.write("        \n");
      out.write("        $scope.passwordmismatch = false;\n");
      out.write("        \n");
      out.write("        $scope.ValidatePassword =function(){\n");
      out.write("            $scope.passwordmismatch = !( $scope.user.password == $scope.user.confirm );\n");
      out.write("        };\n");
      out.write("        \n");
      out.write("    });\n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("\n");
      out.write("  <body ng-app=\"myApp\" ng-controller=\"myCtrl\" >\n");
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
      out.write("\t\t\t\t\t\t\t<li class=\"current\"><a id=\"menu\" href=\"aboutus.jsp\"><span class=\"glyphicon glyphicon-pencil\"></span> About Us</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a id=\"menu\" href=\"contact.jsp\"><span class=\"glyphicon glyphicon-earphone\"></span> Contact</a></li>\n");
      out.write("                                                        <li><a id=\"menu\" href=\"alldoctor.jsp\"><span class=\"glyphicon glyphicon-th-list\"></span> Doctor's List</a></li>\n");
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
      out.write("    \n");
      out.write(" <div id=\"back\">  \n");
      out.write("<div id=\"container1\">\n");
      out.write("<div class=\"main\">\n");
      out.write("    <label id=\"register\">Register</label>\n");
      out.write("<form id=\"form_id\" action=\"RegisterServlets\" method=\"post\" name=\"myform\">\n");
      out.write(" \n");
      out.write("<label>Full Name</label>\n");
      out.write("     <div class=\"row\">\n");
      out.write("     <div class=\"col-lg-12\">\n");
      out.write("       \n");
      out.write("<input type=\"text\" placeholder=\"Enter Name\" name=\"name\" class=\"form-control\" ng-model=\"user.name\"  required/>\n");
      out.write("<span id=\"error\" ng-show=\"myform.name.$dirty && myform.name.$error.required\">Required!</span>\n");
      out.write("</div></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<label>Password</label>\n");
      out.write("<input type=\"password\" placeholder=\"Enter Password\" name=\"password\" ng-model=\"user.password\" ng-change=\"ValidatePassword()\" required ng-minlength=\"3\" ng-maxlength=\"9\" maxlength=\"10\"/>\n");
      out.write("<span id=\"error\" ng-show=\"myform.password.$dirty && myform.password.$error.required\">Required!</span>\n");
      out.write("<span id=\"error\" ng-show=\"myform.password.$dirty && myform.password.$error.minlength\">To Short.!</span>\n");
      out.write("<span id=\"error\" ng-show=\"myform.password.$dirty && myform.password.$error.maxlength\">Strong.!</span>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("\n");
      out.write("<label>Confirm Password</label>\n");
      out.write("<input type=\"password\" placeholder=\"Confirm Password\" name=\"confirm\" ng-model=\"user.confirm\" ng-change=\"ValidatePassword()\" required />\n");
      out.write("<span id=\"error\" class=\"text text-danger\" ng-show=\"passwordmismatch\">Passwords do not match</span>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<label>Contact Number</label>\n");
      out.write("<input type=\"number\" placeholder=\"Enter Number\" name=\"phone\" ng-model=\"user.number\" required ng-minlength=\"10\" maxlength=\"10\"/>\n");
      out.write("<span id=\"error\" ng-show=\"myform.number.$dirty && myform.number.$error.required\">Required!</span>\n");
      out.write("<span id=\"error\" ng-show=\"myform.number.$dirty && myform.number.$error.minlength\">Invalid Number.!</span>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("\n");
      out.write("<label>Email Address</label>\n");
      out.write("<input type=\"email\" placeholder=\"Enter Email\" name=\"email\" ng-model=\"user.email\"  required/>\n");
      out.write("<span id=\"error\" ng-show=\"myform.email.$dirty && myform.email.$error.required\">Required!</span>\n");
      out.write("<span id=\"error\" ng-show=\"myform.email.$dirty && myform.email.$error.email\">Not an email.!</span>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<label>Address</label>\n");
      out.write("<input type=\"text\" placeholder=\"Enter Address\" name=\"address\" ng-model=\"user.address\"  required/>\n");
      out.write("<span id=\"error\" ng-show=\"myform.address.$dirty && myform.address.$error.required\">Required!</span>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<label>Pin Code</label>\n");
      out.write("<input type=\"number\" placeholder=\"Enter Pincode\" name=\"pin\" ng-model=\"user.pincode\" required ng-minlength=\"6\" maxlength=\"6\"/>\n");
      out.write("<span id=\"error\" ng-show=\"myform.pincode.$dirty && myform.pincode.$error.required\">Required!</span>\n");
      out.write("<span id=\"error\" ng-show=\"myform.pincode.$dirty && myform.pincode.$error.minlength\">Not a valid pincode.!</span>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("\n");
      out.write("<select name=\"country\">\n");
      out.write("    <option name=\"country\"><h1> <b>Country</b></option>\n");
      out.write("  <option name=\"country\">India</option>\n");
      out.write("  <option name=\"country\">USA</option>\n");
      out.write("  <option name=\"country\">UK</option>\n");
      out.write("  <option name=\"country\">Russia</option>\n");
      out.write("  <option name=\"country\">Dubai</option>\n");
      out.write("</select><br><br>\n");
      out.write("<Label name=\"gender\"> Gender:</label><br>\n");
      out.write("\n");
      out.write("  <input type=\"radio\" name=\"gender\" value=\"male\"> Male\n");
      out.write("  <input type=\"radio\" name=\"gender\" value=\"female\"> Female\n");
      out.write("  <input type=\"radio\" name=\"gender\" value=\"other\"> Other\n");
      out.write("  \n");
      out.write("  <br><br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                \n");
      out.write("                <div class=\"col-lg-12\" style=\"text-align: center;\">\n");
      out.write("                \n");
      out.write("                    <input type=\"submit\" value=\"Register\" />\n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
