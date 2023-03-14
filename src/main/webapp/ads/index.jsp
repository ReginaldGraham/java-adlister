<%--
  Created by IntelliJ IDEA.
  User: reginaldgraham
  Date: 3/14/23
  Time: 9:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="dao.ListAdsDao" %>
<%@ page import="java.util.List" %>
<%@page import="models.Ad" %>

<html>
<head>
    <title></title>
</head>
<body>

<h1>Ads Index view</h1>
<ul>
<c:forEach items="${ads}" var="ad">
    <li>${ad.title}</li>
</c:forEach>
</ul>
</body>
</html>