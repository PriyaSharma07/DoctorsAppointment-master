<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Contact</title>
            <link href="css/contact.css" rel="stylesheet" />

	<!-- Google Web Fonts -->
	<link href="http://fonts.googleapis.com/css?family=Roboto+Condensed:300italic,400italic,700italic,400,700,300" rel="stylesheet" type="text/css" /><link href="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800" rel="stylesheet" type="text/css" />

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

	<!-- Template CSS Files  -->
	<link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" /><link href="maincss/animate.min.css" rel="stylesheet" /><link href="maincss/owl.carousel.css" rel="stylesheet" /><link href="maincss/style.css" rel="stylesheet" /><link id="colors" href="maincss/style1.css" rel="stylesheet" /><link rel="stylesheet" href="maincss/switcher.css" /><link href="maincss/responsive.css" rel="stylesheet" />
<script src="./js/angular.min.js"></script>
</head>
    
    <script type="text/javascript">
var app = angular.module("app",[]);
    app.controller('reviewController',function($scope){
$scope.reviews=[];

$scope.addReview=function(){
    $scope.reviews.push({
        name:$scope.username,
        email:$scope.email,
        star:$scope.star,
        message:$scope.message

    });

};
});
</script>
    <body ng-app="app" ng-controller="reviewController">
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
                <div id="box1">
                    <h1 id="heading">Call</h1><br>
                    <img id="img" src="images/18.png"/> 
                    <p id="details"><b> +91 8130201448</p>
                    <p id="details"><b>   011 25435451</p>
                    
                </div>
                <div id="box1">
                    <h1 id="heading">Email</h1><br>
                 <img id="img"  src="images/19.png"/> 
                 <p id="details"> RestoreHealth@gmail.com</p>
                    <p id="details"> RestoreHealth@twitter.com</p>
                    
                </div>
                <div id="box1">
                    <h1 id="heading">Address</h1><br>
                <img id="img" src="images/20.png"/> 
                <p id="details">D37 Restore Health South Block Delhi 110045</p>
                    
                    
                </div>
                </div>

        <div id="main">
                <div class="row">
                    <div ng-controller="reviewController">
                    <h1 id="heading">Review</h1><hr>
                    <div id="details" ng-if="reviews.length == 0">
                        No reviews yet, be the first to review this Product!
                    </div><br>
                    <div ng-repeat="review in reviews" >
                    <blockquote id="review" class="row">
                        <h3>{{review.username}}</h3>
                        <h3>{{review.star}}</h3>
                        <h5><small><i>{{review.email}}</i></small></h5>
                        <p>{{review.message}}</p>
                    </blockquote>
                    </div>
                    <form class="form-inline form-group" ng-submit="addReview()">
                        <div>
                            <label>Name</label><br>
                            <input type="text" ng-model="username"></input><br>

                            <label>E-mail</label><br>
                            <input type="email" ng-model="email"></input><br>

                            <label>Star</label><br>
                            <select ng-model="star">
                                <option name="oneStar" value="&#9733;">&#9733;</option>
                                <option name="twoStar" value="&#9733;&#9733;">&#9733;&#9733;</option>
                                <option name="threeStar" value="&#9733;&#9733;&#9733;">&#9733;&#9733;&#9733;</option>
                                <option name="fourStar" value="&#9733;&#9733;&#9733;&#9733;">&#9733;&#9733;&#9733;&#9733;</option>
                                <option name="fiveStar" value="&#9733;&#9733;&#9733;&#9733;&#9733;">&#9733;&#9733;&#9733;&#9733;&#9733;</option>
                            </select><br><br>
                        
                            <textarea rows="5" ng-model="message"></textarea><br><br>
                        <input type="submit" value="Submit"></input>
</div>
                        </form>

                    </div>
                    </div>
                </div>
            
    </body>
</html>
