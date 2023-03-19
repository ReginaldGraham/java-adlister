<%--
  Created by IntelliJ IDEA.
  User: reginaldgraham
  Date: 3/18/23
  Time: 9:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register for the Adlister</title>
</head>
<body>
<h1> Register</h1>
<form method="post" action="/register">
    <div>
        <label for="username">username</label>
        <input name="username" id="username" placeholder="enter username">
    </div>
    <div>
        <label for="email">email</label>
        <input name="email" id="email" placeholder="enter email">
    </div>
    <div>
         <label for="password">password</label>
         <input name="password" id="password" placeholder="enter password">
    </div>
    <button>Register</button>
</form>
</body>
</html>
