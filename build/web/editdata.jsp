
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit</title>
    </head>
    <body>
        <form action="UpdateData" Method="post">
        <table border="1px" width="80%">
            
                <%ResultSet res = (ResultSet) request.getAttribute("EditData");%>
                <%if(res.next()){
                    %>
                    <tr>
                    <td>ID:</td>
                    <td><input type ="text" name="id" value="<%=res.getString("id")%>"</td></tr>
                     
                    <tr>
                    <td>FullName</td>
                    <td><input type ="text" name="FullName" value="<%=res.getString("fullname")%>"</td></tr>
                    
                    <tr>
                    <td>Password</td>
                    <td><input type ="text" name="Password" value="<%=res.getString("password")%>"</td></tr>
                               
                    <tr>
                    <td>Phone</td>
                    <td><input type ="text" name="Phone" value="<%=res.getString("phone")%>"</td></tr>
                    
                    <tr>
                    <td>Email</td>
                    <td><input type ="text" name="Email" value="<%=res.getString("email")%>"</td></tr>
                               
                    <tr>
                    <td>Address</td>
                    <td><input type ="text" name="address" value="<%=res.getString("address")%>"</td></tr>
                    
                    
                    <tr>
                    <td>Pincode</td>
                    <td><input type ="text" name="pin" value="<%=res.getString("pin")%>"</td></tr>
                             
                    <tr>
                    <td>Country</td>
                    <td><input type ="text" name="country" value="<%=res.getString("country")%>"</td></tr>
                               
                    <tr>
                    <td>Gender</td>
                    <td><input type ="text" name="gender" value="<%=res.getString("gender")%>"</td></tr>
                    <tr
                    <td><input type="submit" value="Update" name="update"></td>
                     </tr>
                <%}%>
            
        </table>
        </form>
    </body>
</html>
 