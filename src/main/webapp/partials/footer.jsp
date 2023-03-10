<%--
  Created by IntelliJ IDEA.
  User: reginaldgraham
  Date: 3/9/23
  Time: 4:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
<style>
    .footer {
        position: fixed;
        left: 0;
        bottom: 0;
        width: 100%;
        background-color: whitesmoke;
        color: white;
        text-align: center;
    }
</style>
</head>
<body>

<div class="footer">
    <p>Footer</p>
    <ul>
        <li><a href="${pageContext.request.contextPath}/login.jsp">login.jsp</a></li>
        <li><a href="/first.jsp">first.jsp</a></li>
        <li><a href="/profile.jsp">profile.jsp</a></li>
        <li><a href="/products.jsp">products.jsp</a></li>
    </ul>
</div>
</body>
</html>
