

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update</title>
    </head>
     <link href="css/Update.css" rel="stylesheet" />
    <body  id="structure">
        <form id="main" action="UpdateServlet" method="post" name="myform">
<input type="hidden" name="id" value='${id}'/>
<br><br>
 
<label id="txt">Full Name</label>
<input type="text" placeholder="Enter Name" name="name" value='${name}'/>
<br><br>

<label id="txt">Password</label>
<input type="text" placeholder="Enter Password" name="password" value='${password}' />
<br><br>


<label id="txt">Contact Number</label>
<input type="text" placeholder="Enter Number" name="phonenumber" value='${phone}' />
<br><br>


<label id="data1">Email Address</label>
<input type="text" placeholder="Enter Email" name="email" value='${email}' />
<br><br>

<label id="data1">Address</label>
<input type="text" placeholder="Enter Address" name="address" value='${address}'/>
<br><br>

<label id="data1">Pin Code</label>
<input type="text" placeholder="Enter Pincode" name="pincode" value='${pin}'/>
<br><br>

<label id="data1">Country</label>
<input type="text" placeholder="Enter Country" name="country" value='${country}'/>
<br><br>

<label id="data1">Gender</label>
<input type="text" placeholder="Enter Gender" name="gender" value='${gender}'/>
<br><br>
                    <input type="submit" value="Update" />
                
                </div>
                
                
        <br>
        ${msg}
        <br>
   
            </div>
            
</form>

    </body>
</html>
