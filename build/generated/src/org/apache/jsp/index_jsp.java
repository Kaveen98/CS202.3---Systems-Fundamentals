package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");

	response.setHeader("cache-control","no-cache,no-store,must-revalidate");
	String emaill=(String)session.getAttribute("email");
	String role=(String)session.getAttribute("role");
	if(emaill!=null && role!=null & role.equals("admin"))
		response.sendRedirect("admin.jsp");
	else if(emaill!=null && role!=null & role.equals("patient"))
		response.sendRedirect("pateint_page.jsp");

      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <title>Online Hospital Management System</title>\r\n");
      out.write("        <!-- Bootstrap -->\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t <script src=\"js/jquery.js\"></script>\r\n");
      out.write("\t\t\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t<!--- Header --------------------------->\r\n");
      out.write("\t\t<div class=\"row navbar-fixed-top\">\r\n");
      out.write("\t\t\t<nav class=\"navbar navbar-default header\">\r\n");
      out.write("\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t  <a class=\"navbar-brand logo\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t<img alt=\"Brand\" src=\"images/logo.png\">\r\n");
      out.write("\t\t\t\t  </a>\r\n");
      out.write("\t\t\t\t  <div class=\"navbar-text title\"><p>Hospital Management System<p></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--- Header Ends Here --------------------------->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"row \">\r\n");
      out.write("\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t<div class=\"panel panel-default login\">\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-heading logintitle\">Login</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("                                            <form class=\"form-horizontal center-block\" role=\"form\" action=\"login_validation.jsp\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group input-group-lg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t  <span class=\"input-group-addon\" id=\"sizing-addon1\"><span class=\"glyphicon glyphicon-user\" aria-hidden=\"true\"></span></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<select class=\"form-control\" name=\"userrole\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option selected=\"selected\">Select User</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t \t\t <option value=\"admin\">Admin</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t  <option value=\"patient\">Patient</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<br/>\r\n");
      out.write("                                                                <div>\r\n");
      out.write("                                                                    \r\n");
      out.write("                                                                </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group input-group-lg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t  <span class=\"input-group-addon\" id=\"sizing-addon1\"><span class=\"glyphicon glyphicon-envelope\" aria-hidden=\"true\"></span></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t  <input type=\"email\" class=\"form-control\" name=\"email\" placeholder=\"example@gmail.com\" required aria-describedby=\"sizing-addon1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group input-group-lg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t  <span class=\"input-group-addon\" id=\"sizing-addon1\"><span class=\"glyphicon glyphicon-lock\" aria-hidden=\"true\"></span></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t  <input type=\"password\" name=\"password\" class=\"form-control\" placeholder=\"Password\" required aria-describedby=\"sizing-addon1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-7 col-sm-offset-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t  <button type=\"submit\" class=\"btn btn-primary btn-block btn-lg\">Login</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t<a href=\"register_patient.jsp\" style=\"text-align:Center;font-weight:bold;font-size:120%;padding: 0 2%\">Register As Patient</a>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\t\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t<div class=\"row footer navbar-fixed-bottom\">\r\n");
      out.write("\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t<div>Designed and Developed By :- </div>\r\n");
      out.write("\t\t\t\t<p>Copyrights © Hospital Management System 2017-18. All rights reserved. </p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t<!--- Footer ---------------------------\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"row marginreset\">\r\n");
      out.write("\t\t\t<div class=\"col-md-12 footer\" >\r\n");
      out.write("\t\t\t\t<p class=\"developer\">Designed and Developed By # #</p>\r\n");
      out.write("\t\t\t\t<p>Copyrights © Hospital Management System 2017-18. All rights reserved. </p>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!--- Footer Ends Here --------------------------->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t \r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
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
