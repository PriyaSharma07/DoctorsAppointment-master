

<!DOCTYPE>

<html>
<head><title>
	Sign In
</title><!-- Bootstrap -->
    
    <link href="css/signin.css" rel="stylesheet" />
    	<!-- Google Web Fonts -->
	<link href="http://fonts.googleapis.com/css?family=Roboto+Condensed:300italic,400italic,700italic,400,700,300" rel="stylesheet" type="text/css" /><link href="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800" rel="stylesheet" type="text/css" />

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

	<!-- Template CSS Files  -->
	<link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" /><link href="maincss/animate.min.css" rel="stylesheet" /><link href="maincss/owl.carousel.css" rel="stylesheet" /><link href="maincss/style.css" rel="stylesheet" /><link id="colors" href="maincss/style1.css" rel="stylesheet" /><link rel="stylesheet" href="maincss/switcher.css" /><link href="maincss/responsive.css" rel="stylesheet" /></head>
<body>
    
<div id="back">
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
							<li class="current"><a id="menu" href="aboutus.jsp"><span class="glyphicon glyphicon-pencil"></span> About Us</a></li>
							<li><a id="menu" href="contact.jsp"><span class="glyphicon glyphicon-earphone"></span> Contact</a></li>
                                                        <li><a id="menu" href="alldoctor.jsp"><span class="glyphicon glyphicon-th-list"></span> Doctor's List</a></li>
							<li><a id="menu" href="signin.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                                                        <li><a id="menu" href="rigester.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up </a></li>
						</ul>
					</div>
				<!-- Navbar Collapse Ends -->
				</div></div>
			<!-- Container Ends -->
			</nav>
		<!-- Navbar Ends -->
		</header>
   
    
    <div id="structure">
<div id="main">
    <h2 id="login">Login</h2>
    ${msg}
    <br>
    <form name="frm1" action="LoginServlet" method="post">
            <label>Email Id: </label><br>
            <input type="text" placeholder="Enter Email" name="email" required><br>
                <label>Password:</label><br>
                <input type="password" placeholder="Enter Password" name="password" required>
            <br>
              <input type="submit" value="Login"/><br><br>
         
        </form>
    
    
</div></div></div>
    
</body></html>