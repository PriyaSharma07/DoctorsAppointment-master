
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="profiles.Profiles"%>
<%@page import="profiles.ProfilesDAOImpl"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin</title>
         <link href="css/admin.css" rel="stylesheet" />
<link href="http://fonts.googleapis.com/css?family=Roboto+Condensed:300italic,400italic,700italic,400,700,300" rel="stylesheet" type="text/css" /><link href="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" /><link href="maincss/animate.min.css" rel="stylesheet" /><link href="maincss/owl.carousel.css" rel="stylesheet" /><link href="maincss/style.css" rel="stylesheet" /><link id="colors" href="maincss/style1.css" rel="stylesheet" /><link rel="stylesheet" href="maincss/switcher.css" /><link href="maincss/responsive.css" rel="stylesheet" />


    </head>
   
    <body>
        <h1>Admin Panel</h1>
        
           <div id="structure">
<div id="main">  
            <p id="heading"> ADD USER </p>
            <form action="EditRecord" method="post">
                
            <p id="data1"> Name: <input type="text" name="fullname" /></p>
            
            <p id="data1"> Password: <input type="text" name="password"  /></p>
          
            <p id="data1"> Phone: <input type="text" name="phonenumber" /></p>
           
            <p id="data1"> Email: <input type="text" name="email" /></p>
            
            <p id="data1"> Address: <input type="text" name="address"  /></p>
            
            <p id="data1"> Pincode: <input type="text" name="pincode"  /></p>
            
            <p id="data1"> Country: <input type="text" name="country"  /></p>
            
            <p id="data1"> Gender: <input type="text" name="gender"  /></p>
            
                      <input type="Submit" value="Add User"></input>
    </form>
        </div>
           </div>
        
            
            
        <%
            
        ProfilesDAOImpl pdao = new ProfilesDAOImpl();
        List<Profiles> list = pdao.getProfiles();
        
        request.setAttribute("data", list);
        %>
        
        <table>
            <thead> 
                    <tr>
                        <th>Patient ID</th>
                        <th>Full Name</th>
                        <th>Password</th>
                        <th>Phone</th>
                        <th>Email</th>
                        <th>Address</th>
                        <th>Pincode</th>
                        <th>Country</th>
                        <th>Gender</th>
                        <th colspan=2>Action</th>
                    </tr>
                </thead>
                
                <tbody>
                    <c:forEach items="${data}" var="x">
                    <tr>
        
        
            <td>   ${x.getId()} </td>
            <td> ${x.getFullname()} </td>
            <td> ${x.getPassword()} </td>
            <td> ${x.getPhone()} </td>
            <td> ${x.getEmail()} </td>
            <td> ${x.getAddress()} </td>
            <td> ${x.getpincode()} </td>
            <td> ${x.getcountry()} </td>
            <td> ${x.getgender()} </td>
            <td><button type="button" id="heading1" data-toggle="modal" data-target="#myModal">Update</button>
           </td>
                <td><a href="DeleteRecord?id=${x.getId()}">delete</a></td>
                    
                            </tr> 
                    </c:forEach>
                            
                </tbody>
           </table>
        
  
   <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog modal-lg">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 id="header1" class="modal-title">Update</h4>
        </div>
        <div class="modal-body">
                    <form id="main" action="UpdateServlet" method="post" name="myform">

             <p id="data1"> <input type="hidden" name="id" value='${id}'/><br></p>
        <p id="data1"> NAME <input type="text" name="fullname" placeholder="Enter Name" value='${name}'></p>
          <p id="data1"> PASSWORD <input type="text" name="password" placeholder="Enter Password" value='${password}'></p>
          <p id="data1"> PHONE <input type="text" name="phone" placeholder="Enter Phone" value='${phone}'></p>
           <p id="data1"> EMAIL <input type="text" name="email" placeholder="Enter Email" value='${email}'></p>
          <p id="data1"> ADDRESS <input type="text" name="address" placeholder="Enter Address" value='${address}'></p>
          <p id="data1"> PINCODE <input type="text" name="pincode" placeholder="Enter Pincode" value='${pin}'></p>
           <p id="data1"> COUNTRY <input type="text" name="country" placeholder="Enter Country" value='${country}'></p>
          <p id="data1"> GENDER <input type="text" name="gender" placeholder="Enter Gender" value='${gender}'></p>
         
                    
        
        </div>
        <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal"><b>Close</b></button>
         
          <input type="Submit" class="btn btn-default" value="Update"></input>
          </form>
        </div>
      </div>
    </div>
  </div>
    </body>
</html>

