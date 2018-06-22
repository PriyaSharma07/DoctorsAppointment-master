<html lang="en">
<head>
    
    <title>Register</title>
<!-- Include CSS File Here -->

<link rel="stylesheet" href="css/rigester.css" 
type="text/css">
<link href="http://fonts.googleapis.com/css?family=Roboto+Condensed:300italic,400italic,700italic,400,700,300" rel="stylesheet" type="text/css" /><link href="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800" rel="stylesheet" type="text/css" />

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

	<!-- Template CSS Files  -->
	<link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" /><link href="maincss/animate.min.css" rel="stylesheet" /><link href="maincss/owl.carousel.css" rel="stylesheet" /><link href="maincss/style.css" rel="stylesheet" /><link id="colors" href="maincss/style1.css" rel="stylesheet" /><link rel="stylesheet" href="maincss/switcher.css" /><link href="maincss/responsive.css" rel="stylesheet" /></head>

<script src="./js/angular.min.js"></script>



<style>
    input.ng-invalid.ng-dirty{border:1px solid red;}
    
</style>
</head>

<script type="text/javascript">
    
    var myApp = angular.module("myApp",[]);
    
    myApp.controller("myCtrl",function($scope){
        
        $scope.passwordmismatch = false;
        
        $scope.ValidatePassword =function(){
            $scope.passwordmismatch = !( $scope.user.password == $scope.user.confirm );
        };
        
    });
    
</script>

  <body ng-app="myApp" ng-controller="myCtrl" >

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
    
 <div id="back">  
<div id="container1">
<div class="main">
    <label id="register">Register</label>
<form id="form_id" action="RegisterServlets" method="post" name="myform">
 
<label>Full Name</label>
     <div class="row">
     <div class="col-lg-12">
       
<input type="text" placeholder="Enter Name" name="name" class="form-control" ng-model="user.name"  required/>
<span id="error" ng-show="myform.name.$dirty && myform.name.$error.required">Required!</span>
</div></div>


<label>Password</label>
<input type="password" placeholder="Enter Password" name="password" ng-model="user.password" ng-change="ValidatePassword()" required ng-minlength="3" ng-maxlength="9" maxlength="10"/>
<span id="error" ng-show="myform.password.$dirty && myform.password.$error.required">Required!</span>
<span id="error" ng-show="myform.password.$dirty && myform.password.$error.minlength">To Short.!</span>
<span id="error" ng-show="myform.password.$dirty && myform.password.$error.maxlength">Strong.!</span>
<br>


<label>Confirm Password</label>
<input type="password" placeholder="Confirm Password" name="confirm" ng-model="user.confirm" ng-change="ValidatePassword()" required />
<span id="error" class="text text-danger" ng-show="passwordmismatch">Passwords do not match</span>
<br>

<label>Contact Number</label>
<input type="number" placeholder="Enter Number" name="phone" ng-model="user.number" required ng-minlength="10" maxlength="10"/>
<span id="error" ng-show="myform.number.$dirty && myform.number.$error.required">Required!</span>
<span id="error" ng-show="myform.number.$dirty && myform.number.$error.minlength">Invalid Number.!</span>
<br>


<label>Email Address</label>
<input type="email" placeholder="Enter Email" name="email" ng-model="user.email"  required/>
<span id="error" ng-show="myform.email.$dirty && myform.email.$error.required">Required!</span>
<span id="error" ng-show="myform.email.$dirty && myform.email.$error.email">Not an email.!</span>
<br>

<label>Address</label>
<input type="text" placeholder="Enter Address" name="address" ng-model="user.address"  required/>
<span id="error" ng-show="myform.address.$dirty && myform.address.$error.required">Required!</span>
<br>

<label>Pin Code</label>
<input type="number" placeholder="Enter Pincode" name="pin" ng-model="user.pincode" required ng-minlength="6" maxlength="6"/>
<span id="error" ng-show="myform.pincode.$dirty && myform.pincode.$error.required">Required!</span>
<span id="error" ng-show="myform.pincode.$dirty && myform.pincode.$error.minlength">Not a valid pincode.!</span>
<br>


<select name="country">
    <option name="country"><h1> <b>Country</b></option>
  <option name="country">India</option>
  <option name="country">USA</option>
  <option name="country">UK</option>
  <option name="country">Russia</option>
  <option name="country">Dubai</option>
</select><br><br>
<Label name="gender"> Gender:</label><br>

  <input type="radio" name="gender" value="male"> Male
  <input type="radio" name="gender" value="female"> Female
  <input type="radio" name="gender" value="other"> Other
  
  <br><br>
            <div class="row">
                
                <div class="col-lg-12" style="text-align: center;">
                
                    <input type="submit" value="Register" />
                
                </div>
                
            </div>
            
</form>
</div>
</div>
</body>

</html>