<%@ page import="model.Product" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %><%--
  Created by IntelliJ IDEA.
  User: reginaldgraham
  Date: 3/10/23
  Time: 10:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
  Product pro1=new Product("bread",5.00);
  Product pro2=new Product("chips", 4.00);
  Product pro3=new Product("water", 1.00);
  Product pro4=new Product("beef", 6.00);

  List<Product> products=new ArrayList<>(Arrays.asList(
          pro1,
          pro2,
          pro3,
          pro4
  ));
  request.setAttribute("products", products);

 String productSelection= request.getParameter("productsChoice");
 request.setAttribute("productsChoice", productSelection);
  System.out.println(productSelection);

%>
<html>
<head>
    <title>Title</title>
  <style>
    select{
      height: 30px;
      width: 120px;
    }
    label{
      font-size: 25px;
    }
  </style>
</head>
<body>
<h1>Store</h1>
<c:choose>
  <c:when test="${products.isEmpty()}">
    <h2>We are out of stock</h2>
  </c:when>
  <c:otherwise>
    <c:forEach var="product" items="${products}">
<%--  <c:when test="${requestScope.productSelection == product.name}">--%>
<%--    <h2>Product: </h2>--%>
<%--    <h3>${product.name}</h3>--%>
<%--    <h3>$ ${product.costInCents}0</h3>--%>
<%--    <hr>--%>
<%--  </c:when>--%>
      <h2>Product: </h2>
      <h3>${product.name}</h3>
      <h3>$ ${product.costInCents}0</h3>
      <hr>
    </c:forEach>
  </c:otherwise>
</c:choose>
  <label for="filter">select an item</label>
<form id="filter"  method="get">
  <select name="productsChoice">
    <option>bread</option>
    <option>chips</option>
    <option>water</option>
    <option>beef</option>
  </select>
  <button>submit</button>
</form>

</body>
</html>
