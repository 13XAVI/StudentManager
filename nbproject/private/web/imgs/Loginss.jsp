<%-- 
    Document   : Login
    Created on : Mar 9, 2023, 9:59:38 AM
    Author     : t
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link rel="stylesheet" href="../css/Login.css"/>
    </head>
    <body>
        <div class="container">
            <form action="../pagesHandler/Login.jsp" onsubmit="return validate()" method="POST" >

      <div class="input-group">
        <label>Email Id</label>
        <input type="text" placeholder="Enter Email" id="emails" name="email" >
      </div>   
       <div class="input-group">
        <label>Password</label>
        <input type="password" placeholder="Enter Password" id="passwords" name="password">
       </div> <br>

      <label class="check" >
      <input type="checkbox" checked="checked" name="remember" id="checkbox-box"> Remember me
        </label>

    <button  value="Login"  onClick="login()">Submit</button>
        <div >
            <span class="psw">Forgot <a href="SignupForm.html">Password?</a></span>
         </div>
  </form>
  </div>
    </body>
</html>
