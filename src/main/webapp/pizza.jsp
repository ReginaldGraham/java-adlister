<%--
  Created by IntelliJ IDEA.
  User: reginaldgraham
  Date: 3/10/23
  Time: 4:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="pizza" method="post" >
    <label for="crust">Select Crust &nbsp;</label>
    <label for="sauce">Select Sauce &nbsp;</label>
    <label for="size"> Select Size</label>
    <br>
    <select id="crust" name="crust">
        <option>original</option>
        <option>thin</option>
        <option>pan</option>
    </select>&nbsp;&nbsp;&nbsp;&nbsp;
    <select id="sauce" name="sauce">
        <option>marinara</option>
        <option>alfredo</option>
        <option>bbq</option>
    </select>&nbsp;&nbsp;&nbsp;&nbsp;
    <select id="size" name="size">
        <option>small</option>
        <option>medium</option>
        <option>large</option>
    </select>
    <br>
    <input type="checkbox" id="topping1" name="topping1" >
    <label for="topping1"> pepperoni</label>
    <input type="checkbox" id="topping2" name="topping2">
    <label for="topping2"> pineapple</label>
    <input type="checkbox" id="topping3" name="topping3">
    <label for="topping3"> ham</label>
    <input type="checkbox" id="topping4" name="topping4">
    <label for="topping4"> sausage</label>
    <br>
    <label for="address">delivery address</label>
    <input type="text" placeholder="address" id="address" name="address">
    <button>Submit</button>
</form>
</body>
</html>
