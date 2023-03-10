<%--
  Created by IntelliJ IDEA.
  User: reginaldgraham
  Date: 3/9/23
  Time: 3:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--TODO get method and saying if it equals post allows you to make it to the screen without the inputs runnig the code prematurly. when a web page is being requested that is a GET when information is being submitted that is a POST. this version only allows the code to run when it  is a POST.--%>
<%
    String method = request.getMethod();
    if(method.equals("POST")){
    String user = request.getParameter("username");
    String pass = request.getParameter("password");
//    if(user != null && pass != null && user.equals("admin") && pass.equals("password")) {
    if( user.equals("admin") && pass.equals("password")) {
response.sendRedirect("/profile.jsp");
  }
//  else if(user != null && pass != null && !user.equals("admin") && !pass.equals("password")) {
   else if(!user.equals("admin") && !pass.equals("password")) {
        response.sendRedirect("/login.jsp");
    }
  }
%>
<html>
<head>
    <title>Login screen</title>
</head>
<body>
<form method="post" action="login.jsp">
    <h1>Login</h1>
    <label for="username">Username</label>
    <input placeholder="username" type="text"  id="username" name="username">
    <label for="password">Password</label>
    <input placeholder="password" type="text" id="password" name="password">
<button>submit</button>
</form>
</body>
</html>
