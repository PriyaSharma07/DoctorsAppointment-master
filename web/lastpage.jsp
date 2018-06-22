<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="Appointment.appoint"%>
<%@page import="java.util.List"%>
<%@page import="Appointment.AppointDAOImpl"%>
<html>
    <head>
        <title>Appointment</title>
         <link href="css/lastpage.css" rel="stylesheet" />       
    <link href="http://fonts.googleapis.com/css?family=Roboto+Condensed:300italic,400italic,700italic,400,700,300" rel="stylesheet" type="text/css" /><link href="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800" rel="stylesheet" type="text/css" />

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

	<!-- Template CSS Files  -->
	<link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" /><link href="maincss/animate.min.css" rel="stylesheet" /><link href="maincss/owl.carousel.css" rel="stylesheet" /><link href="maincss/style.css" rel="stylesheet" /><link id="colors" href="maincss/style1.css" rel="stylesheet" /><link rel="stylesheet" href="maincss/switcher.css" /><link href="maincss/responsive.css" rel="stylesheet" /></head>
        
    <%
            
        AppointDAOImpl pdao = new AppointDAOImpl();
        List<appoint> list = pdao.getappoint();
        
        request.setAttribute("dataa", list);
        System.out.println(list);
        %>

    <body>
        
    <!-- Header Starts -->
    <header id="header" class="header">
		<!-- Header Top Bar Starts -->
			<div class="top-bar">
			<!-- Container Starts -->
				<div class="container">
				<!-- Left Col Starts -->
					<ul class="list-unstyled list-inline pull-left wow fadeInUp" data-wow-delay="0.3s" id="ll">
						<li>
							<span class="glyphicon glyphicon-earphone"></span>
							+91 - 9582990886
						</li>
						<li>
							<span class="glyphicon glyphicon-envelope"></span>
							<a href="mailto:Kajgpt77@gmail.com">RestoreHealth@gmail.com</a>
						</li>
					</ul>
				<!-- Left Col Ends -->
				<!-- Right Col Starts -->
					<ul class="list-unstyled list-inline pull-right wow fadeInDown" data-wow-delay="0.5s">
						<li id="follow">
							Follow Us
						</li>
						<a target="_blank" title="find us on Facebook" href="http://www.facebook.com"><img alt="follow me on facebook" src="//login.create.net/images/icons/user/facebook_40x40.png" border=0></a>
					<a target="_blank" title="follow me on twitter" href="http://www.twitter.com"><img alt="follow me on twitter" src="//login.create.net/images/icons/user/twitter-b_40x40.png" border=0></a>
					</ul>
				<!-- Right Col Ends -->
				</div>
			<!-- Container Ends -->
			</div>
		<!-- Header Top Bar Ends -->
		<!-- Navbar Starts -->
			<nav id="nav" class="navbar navbar-default sticky-nav" role="navigation">
			<!-- Container Starts -->
				<div class="container">
				<!-- Navbar Header Starts -->
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
							<span class="sr-only">Toggle navigation</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
                                            <a href="#" class="navbar-brand wow fadeInLeft" data-wow-delay="0.7s" id="dd">
                                                     Restore Health 
						</a>
					
				<!-- Navbar Header Ends -->
				<!-- Navbar Collapse Starts -->
					<div class="navbar-collapse collapse wow fadeInRight" data-wow-delay="0.9s">
						<ul class="nav navbar-nav navbar-right">
							<li><a id="menu" href="index.jsp"><span class="glyphicon glyphicon-home"></span> Home</a></li>
							<li><a id="menu" href="aboutus.jsp"><span class="glyphicon glyphicon-pencil"></span> About Us</a></li>
							<li><a id="menu" href="contact.jsp"><span class="glyphicon glyphicon-earphone"></span> Contact</a></li>
                                                        <li><a id="menu" href="alldoctor.jsp"><span class="glyphicon glyphicon-th-list"></span> Doctor's List</a></li>
						 <li><a id="menu" href="UpdateProfile.jsp" id=${id}><span class="glyphicon glyphicon-wrench"></span>Update</a></li> 
                                                        <li><a id="menu" href="logout.jsp" ><span class="glyphicon glyphicon-log-out"></span>Logout</a></li>
	</ul>
					</div>
				<!-- Navbar Collapse Ends -->
				</div></div>
			<!-- Container Ends -->
			</nav>
		<!-- Navbar Ends -->
		</header>
   
    
 <div id="details">
        <p id="data">ID: ${id}</p>
        <p id="data"> NAME: ${name}</p>
        <p id="data">ADDRESS: ${address}</p>
        <p id="data">EMAIL: ${email}</p>
        
    </div>    
        ${msg}
        
        
        
    <div id="main">
        <div id="box">
            <a id="heading1" data-toggle="modal" data-target="#myModal">Appointment</a><br>
            <img id="img" src="images/22.png"></img>
        </div>
        <div id="box">
            <a id="heading1" data-toggle="modal" data-target="#myModal1">Cancellation</a><br>
         <img id="img" src="images/23.png"></img>
        </div>
        <div id="box1">
            <a id="heading1" data-toggle="modal" data-target="#myModal2">Your Appointment</a><br>
              <img id="img" src="images/24.png"></img>
        </div>
    </div>
    
       //
   <div class="container">
  
   <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog modal-lg">
      <div class="modal-content">
        <div class="modal-header">
            <form action="FixAppoint" method="post">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 id="header1" class="modal-title">Fix Appointment</h4>
        </div>
        <div class="modal-body">
            
            <p id="data1"> PATIENT NAME: <input type="text" name="name"  value=""><br></p>
          <p id="data1"> PHONE: <input type="text" name="phone"  value=""><br></p>
          <p id="data1"> EMAIL ID: <input type="email" name="email"  value=""><br></p>
            <p id="data1"> SPECIALIZATION: <input type="text" name="special" value=""><br></p>
         
        
        
        </div>
        <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal"><b>Close</b></button>
          <input type="submit" value="Submit" class="btn btn-default" ><b></b></input>
        </div>
      </div>
    </div>
  </div>
</div>
        </form>
<div class="container">
  
  
    
    
    
    <!-- Modal -->
    <div class="modal fade" id="myModal1" role="dialog">
    <div class="modal-dialog modal-lg">
      <div class="modal-content">
        <div class="modal-header">
            
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 id="header1" class="modal-title">Cancel Appointment</h4>
        </div>
        <div class="modal-body">
    
    
            <table><thead>
                <tr>
                    <th>Patient id</th>
                    <th>Patient Name</th>
                     <th>Phone</th>
                      <th>Email</th>
                      <th>Doctor Specialization</th>
                      <th>Action</th>
                       
                </tr>
                </thead>
                <tbody> 
                <c:forEach items="${dataa}" var="y">
                   
                    <tr>
        
        
            <td>   ${y.getAppointID()} </td>
            <td> ${y.getAppointName()} </td>
            <td> ${y.getAppointPhone()} </td>
            <td> ${y.getAppointEmail()} </td>
            <td> ${y.getAppointSpecial()} </td>
            <td><a href="DeleteAppointment?id=${y.getAppointID()}">delete</a></td>
                    
                            </tr> 
                    </c:forEach>
                            
                </tbody>
            </table>        
       
          
        </div>
        <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal"><b>Close</b></button>
        </div>
      </div>
    </div>
  </div>
</div>
       
  
          
          
          
          
          
          <!-- Modal -->
<div class="modal fade" id="myModal2" role="dialog">
    <div class="modal-dialog modal-lg">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 id="header1" class="modal-title">Your Appointment</h4>
        </div>
        <div class="modal-body">
         
    
    

            <table><thead>
                <tr>
                    <th>Patient id</th>
                    <th>Patient Name</th>
                     <th>Phone</th>
                      <th>Email</th>
                      <th>Doctor Specialization</th>
                      
                       
                </tr>
                </thead>
                <tbody> 
                <c:forEach items="${dataa}" var="y">
                   
                    <tr>
        
        
            <td>   ${y.getAppointID()} </td>
            <td> ${y.getAppointName()} </td>
            <td> ${y.getAppointPhone()} </td>
            <td> ${y.getAppointEmail()} </td>
            <td> ${y.getAppointSpecial()} </td>
                    
                            </tr> 
                    </c:forEach>
                            
                </tbody>
            </table>    
        
        
        </div>
        <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal"><b>Close</b></button>
         
        </div>
      </div>
    </div>
  </div>
</div>
  
    </body>
    
    
    
</html>
