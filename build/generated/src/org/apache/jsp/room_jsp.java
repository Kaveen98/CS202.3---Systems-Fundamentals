package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class room_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


		int roomNo;
		int bedNo;
		String status;

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/menu.jsp");
  }

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

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\tfunction confirmDelete()\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\treturn confirm(\"Do You Really Want to Delete Room?\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</head>\r\n");
      out.write("<!DOCTYPE html>\r\n");

	response.setHeader("cache-control","no-cache,no-store,must-revalidate");
	String emaill=(String)session.getAttribute("email");
	String namee=(String)session.getAttribute("name");
	if(emaill==null && namee==null)
		response.sendRedirect("index.jsp");
	else{

      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link href=\"images/logo.png\" rel=\"icon\"/>\r\n");
      out.write("        <title>Online Hospital Management System</title>\r\n");
      out.write("        <!-- Bootstrap -->\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("        <script src=\"js/jquery.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("                $(document).ready(function()\r\n");
      out.write("                {\r\n");
      out.write("\r\n");
      out.write("                        $('#doctorlist').show();\r\n");
      out.write("                        $('.doctor li:first-child a').addClass('active');\r\n");
      out.write("                        $('.doctor li a').click(function(e){\r\n");
      out.write("\r\n");
      out.write("                                var tabDiv=this.hash;\r\n");
      out.write("                                $('.doctor li a').removeClass('active');\r\n");
      out.write("                                $(this).addClass('.active');\r\n");
      out.write("                                $('.switchgroup').hide();\r\n");
      out.write("                                $(tabDiv).fadeIn();\r\n");
      out.write("                                e.preventDefault();\r\n");
      out.write("\r\n");
      out.write("                        });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                });\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            \r\n");
      out.write("        <!--- Header Start -------->\r\n");
      out.write("        <div class=\"row header\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-md-10\">\r\n");
      out.write("                    <h2 >Hospital Management System</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-md-2 \">\r\n");
      out.write("                <ul class=\"nav nav-pills \">\r\n");
      out.write("                    <li class=\"dropdown dmenu\">\r\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">");
      out.print(namee.toUpperCase());
      out.write(" <span class=\"caret\"></span></a>\r\n");
      out.write("                            <ul class=\"dropdown-menu \">\r\n");
      out.write("                                <li><a href=\"profile.jsp\">Change Profile</a></li>\r\n");
      out.write("                                <li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("                                 <li><a href=\"logout.jsp\">Logout</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                     </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("  <!--- Header Ends --------->\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");

	}

      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("       \r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("    \r\n");
      out.write("        <!----- Menu Area Start ------>\r\n");
      out.write("        <div class=\"col-md-2 menucontent\">\r\n");
      out.write("          \r\n");
      out.write("            <a href=\"#\"><h1>Dashboard</h1></a>\r\n");
      out.write("                \r\n");
      out.write("                <ul class=\"nav nav-pills nav-stacked\">\r\n");
      out.write("                  <li role=\"presentation\"><a href=\"department.jsp\">Department</a></li>\r\n");
      out.write("                  <li role=\"presentation\"><a href=\"doctor.jsp\">Doctors</a></li>\r\n");
      out.write("                  <li role=\"presentation\"><a href=\"patients.jsp\">Patients</a></li>\r\n");
      out.write("                  <li role=\"presentation\"><a href=\"nurse.jsp\">Nurse</a></li>\r\n");
      out.write("                  <li role=\"presentation\"><a href=\"room.jsp\">Room</a></li>\r\n");
      out.write("                  <li role=\"presentation\"><a href=\"pathology.jsp\">Pathology</a></li>\r\n");
      out.write("                  <li role=\"presentation\"><a href=\"donor.jsp\">Blood Donor</a></li>\r\n");
      out.write("                  <li role=\"presentation\"><a href=\"billing.jsp\">Billing</a></li>\r\n");
      out.write("                  <li role=\"presentation\"><a href=\"search.jsp\">Search</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!---- Menu Ares Ends  -------->");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("<!-------   Content Area start  --------->\r\n");
      out.write("<div class=\"col-md-10 maincontent\" >\r\n");
      out.write("\r\n");
      out.write("    <!-----------  Content Menu Tab Start   ------------>\r\n");
      out.write("    <div class=\"panel panel-default contentinside\">\r\n");
      out.write("        <div class=\"panel-heading\">Manage Room</div>\r\n");
      out.write("\r\n");
      out.write("        <!----------------   Panel Body Start   --------------->\r\n");
      out.write("        <div class=\"panel-body\">\r\n");
      out.write("            <ul class=\"nav nav-tabs doctor\">\r\n");
      out.write("                    <li role=\"presentation\"><a href=\"#doctorlist\">Room List</a></li>\r\n");
      out.write("                    <li role=\"presentation\"><a href=\"#adddoctor\">Add Room</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            <!----------------   Display Room Data List start   --------------->\r\n");
      out.write("           \r\n");
      out.write("               <div id=\"doctorlist\" class=\"switchgroup\">\r\n");
      out.write("                   <table class=\"table table-bordered table-hover\">\r\n");
      out.write("                   <tr class=\"active\">\r\n");
      out.write("                           <td>Room Number</td>\r\n");
      out.write("                           <td>Bed No</td>\r\n");
      out.write("                           <td>Availability Status</td>\r\n");
      out.write("                           <td>Options</td>\r\n");
      out.write("                   </tr>\r\n");
      out.write('\r');
      out.write('\n');

	Connection c=(Connection)application.getAttribute("connection");
	PreparedStatement ps=c.prepareStatement("select * from room_info order by room_no,bed_no asc",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	ResultSet rs=ps.executeQuery();
	while(rs.next())
	{
		roomNo=rs.getInt(1);
		bedNo=rs.getInt(2);
		status=rs.getString(3);
		

      out.write("\r\n");
      out.write("                   <tr>\r\n");
      out.write("                           <td>");
      out.print(roomNo);
      out.write("</td>\r\n");
      out.write("                           <td>");
      out.print(bedNo);
      out.write("</td>\r\n");
      out.write("                           <td>");
      out.print(status);
      out.write("</td>\r\n");
      out.write("                           <td>\r\n");
      out.write("\t\t\t\t\t\t    <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#myModal");
      out.print(roomNo);
      out.print(bedNo);
      out.write("\"><span class=\"glyphicon glyphicon-wrench\" aria-hidden=\"true\"></span></button>\r\n");
      out.write("                            <a href=\"delete_room_validation.jsp?roomNo=");
      out.print(roomNo);
      out.write("&bedNo=");
      out.print(bedNo);
      out.write("\" class=\"btn btn-danger\" onclick=\"return confirmDelete()\"><span class=\"glyphicon glyphicon-trash\" aria-hidden=\"true\"></span></a>\r\n");
      out.write("                           \r\n");
      out.write("\t\t\t\t\t\t   </td>\r\n");
      out.write("                   </tr>\r\n");

	}
	rs.first();
	rs.previous();

      out.write("\r\n");
      out.write("           \r\n");
      out.write("                  </table>\r\n");
      out.write("               </div>  \r\n");
      out.write("              <!----------------   Display Room Data List ends   --------------->\r\n");
      out.write("              \r\n");
      out.write("              <!------ Edit Room Modal Start ---------->\r\n");
      out.write("                            \r\n");

	while(rs.next())
	{
		roomNo=rs.getInt(1);
		bedNo=rs.getInt(2);
		status=rs.getString(3);
		

      out.write("   \r\n");
      out.write("              <div class=\"modal fade\" id=\"myModal");
      out.print(roomNo);
      out.print(bedNo);
      out.write("\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\r\n");
      out.write("            \r\n");
      out.write("                <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("                    <div class=\"modal-content\">\r\n");
      out.write("                       \r\n");
      out.write("                    \r\n");
      out.write("                        <div class=\"modal-header\">\r\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("                        <h4 class=\"modal-title\" id=\"myModalLabel\">Edit Room Information</h4>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"modal-body\">\r\n");
      out.write("                        <div class=\"panel panel-default\">\r\n");
      out.write("                            <div class=\"panel-body\">\r\n");
      out.write("                             <form class=\"form-horizontal\" action=\"edit_room_validation.jsp\">\r\n");
      out.write("                                    \r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label  class=\"col-sm-4 control-label\">Room No</label>\r\n");
      out.write("                                    <div class=\"col-sm-4\">\r\n");
      out.write("                                        <input type=\"number\" class=\"form-control\" name=\"roomNo\" value=\"");
      out.print(roomNo);
      out.write("\" readonly=\"readonly\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                    \r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label  class=\"col-sm-4 control-label\">Bed No</label>\r\n");
      out.write("                                    <div class=\"col-sm-4\">\r\n");
      out.write("                                      <input type=\"text\" class=\"form-control\" name=\"bedNo\" value=\"");
      out.print(bedNo);
      out.write("\" readonly>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                 </div>\r\n");
      out.write("\r\n");
      out.write("                                 <div class=\"form-group\">\r\n");
      out.write("                                       <label class=\"col-sm-4 control-label\">Status</label>\r\n");
      out.write("                                       <div class=\"col-sm-4\">\r\n");
      out.write("                                         <input type=\"text\" class=\"form-control\" name=\"status\" value=\"");
      out.print(status);
      out.write("\">\r\n");
      out.write("                                       </div>\r\n");
      out.write("                                 </div>\r\n");
      out.write("                               \r\n");
      out.write("                                 <div class=\"modal-footer\">\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("                                    <input type=\"submit\" class=\"btn btn-primary\" value=\"Update\"></button>\r\n");
      out.write("                                 </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("      </div>\r\n");
      out.write("                         </div>\r\n");
      out.write("                         </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                 </div>\r\n");
      out.write("               </div>\r\n");

	}
	ps.close();
	rs.close();

      out.write("\r\n");
      out.write("<!----------------   Modal ends here  --------------->\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("              \r\n");
      out.write("              \r\n");
      out.write("              <!----------------   Add Room Start   --------------->\r\n");
      out.write("               <div id=\"adddoctor\" class=\"switchgroup\">\r\n");
      out.write("                   <div class=\"panel panel-default\">\r\n");
      out.write("                       <div class=\"panel-body\">\r\n");
      out.write("                           <form class=\"form-horizontal\" action=\"add_room_validation.jsp\">\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label  class=\"col-sm-4 control-label\">Room No</label>\r\n");
      out.write("                                <div class=\"col-sm-4\">\r\n");
      out.write("                                  <input type=\"number\" class=\"form-control\" name=\"roomNo\" placeholder=\"Room Number\" required>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label  class=\"col-sm-4 control-label\">Bed No</label>\r\n");
      out.write("                                <div class=\"col-sm-4\">\r\n");
      out.write("                                  <input type=\"text\" class=\"form-control\" name=\"bedNo\" placeholder=\"Bed No\" required>\r\n");
      out.write("                                </div>\r\n");
      out.write("                             </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label class=\"col-sm-4 control-label\">Availability Status</label>\r\n");
      out.write("                                <div class=\"col-sm-4\">\r\n");
      out.write("                                   <input type=\"text\" class=\"form-control\" name=\"status\" placeholder=\"Available\" value=\"available\" required readonly>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <div class=\"col-sm-offset-4 col-sm-10\">\r\n");
      out.write("                                  <button type=\"submit\" class=\"btn btn-primary\">Add Room Now</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                   <!----------------   Add Room Ends   --------------->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!----------------   Panel Body Ends   --------------->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-----------  Content Menu Tab Ends   ------------>\r\n");
      out.write("</div>\r\n");
      out.write("<!-------   Content Area Ends  --------->\r\n");
      out.write("        </div>\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
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
