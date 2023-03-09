<%--
  Created by IntelliJ IDEA.
  User: reginaldgraham
  Date: 3/9/23
  Time: 3:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login screen</title>
</head>
<body>
<form >
    <h1>Login</h1>
    <input placeholder="username" type="text"  name="username">
    <input placeholder="password" type="text" name="password">
<button>submit</button>
</form>
<%
    String user = request.getParameter("username");
    String pass = request.getParameter("password");
//    request.setAttribute();
    if(user != null && pass != null && user.equals("admin") && pass.equals("password")) {
response.sendRedirect("/profile.jsp");
  }
  else if(user != null && pass != null && !user.equals("admin") && !pass.equals("password")) {
      response.sendRedirect("/login.jsp");
  }
%>
</body>
</html>
