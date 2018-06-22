
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="Doctor.Doctor"%>
<%@page import="Doctor.DoctorDAOImpl"%>
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
    </head>
    
    
    <script>
        function getDoctorid(item){
            
            console.log(item);
            document.getElementById("updatableId").value = item;
            
        }
        
  </script>
   
    <body>
        <h1>Admin Panel</h1>
        
        <div id="structure">
<div id="main">    
            <p id="heading"> ADD DOCTOR </p>
            <form action="EditDoctor" method="post">
                
            <p id="data1"> Doctor Name: <input type="text" name="name"  /></p>
            
            <p id="data1"> Age <input type="text" name="age"  /></p>
          
            <p id="data1"> Specialization <input type="text" name="specialization"  /></p>
           
            <p id="data1"> Phone <input type="text" name="phone"  /></p>
            
            <p id="data1"> Address: <input type="text" name="address"  /></p>
            
            <p id="data1"> Pincode: <input type="text" name="pincode"  /></p>
            
            <p id="data1"> Email: <input type="text" name="email" /></p>
            
            
                      <input type="Submit" value="Add"></input>
    </form>
</div></div>
            
            
         <%
            
        DoctorDAOImpl pdao = new DoctorDAOImpl();
        List<Doctor> list = pdao.getDoctor();
        
        System.out.println(list);
        
        request.setAttribute("data", list);
        %>
        
        <table>
            <thead> 
                    <tr>
                        <th>Doctor ID</th>
                        <th>Doctor Name</th>
                        <th>Age</th>
                        <th>Specialization</th>
                        <th>Phone</th>
                        <th>Address</th>
                        <th>Pincode</th>
                        <th>Email</th>
                        <th colspan=2>Action</th>
                    </tr>
                </thead>
                
                <tbody>
                    <c:forEach items="${data}" var="x">
                    <tr>
        
        
           <td>   ${x.getDoctorid()} </td>
            <td> ${x.getDoctorName()} </td>
            <td> ${x.getAge()} </td>
            <td> ${x.getSpecialization()} </td>
            <td> ${x.getPhone()} </td>
           <td> ${x.getAddress()} </td>
            <td> ${x.getPincode()} </td>
            <td> ${x.getEmail()} </td>
           <td><a href="ProfilesDAOImpl?id=${x.getDoctorid()}"/>Update</a></td>
                <td><a href="ProfilesDAOImpl?id=${x.getDoctorid()}">delete</a></td>
                    
                            </tr> 
                    </c:forEach>
                            
                </tbody>
           </table>
              
        
      


    </body>
</html>

