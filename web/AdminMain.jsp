<%-- 
    Document   : AdminMain
    Created on : Sep 28, 2024, 7:15:07 PM
    Author     : Sandinu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.sql.*" %>
    <html lang="en">

    <head>
        <script>
            function confirmDelete() {
                return confirm("Do You Really Want to Delete Department?");
            }
        </script>
    </head>
    <%@include file="header.jsp" %>

        <body>


            <div class="row">

                <%@include file="menu.jsp" %>
                </div>
            <script src="js/bootstrap.min.js"></script>
        </body>

    </html>

