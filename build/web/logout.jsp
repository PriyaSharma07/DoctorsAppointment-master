<%-- 
    Document   : logout
    Created on : Jul 10, 2017, 11:06:27 PM
    Author     : audvik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    
    session.invalidate();
    session = request.getSession();
    response.sendRedirect("signin.jsp");


%>