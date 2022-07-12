<%--
  Created by IntelliJ IDEA.
  User: cojur
  Date: 7/11/22
  Time: 3:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Order form</title>
</head>

<body>
<form method="POST" action="/pizza-order">

    <label for="crust">Crust</label>
    <select name="pizza-crust" id="crust">
        <option value="Thin">Thin crust</option>
        <option value="Stuffed">Stuffed crust</option>
    </select>
    <br> <br>
    <label for="sauce">Sauce</label>
    <select name="pizza-sauce" id="sauce">
        <option value="regular">Regular</option>
        <option value="extra">Extra</option>
        <option value="none">No sauce</option>
    </select>
    <br> <br>
    <label for="Size">Size: </label>
    <select name="pizza-size" id="size">
        <option value="small">Small</option>
        <option value="medium">Medium</option>
        <option value="large">Large</option>
    </select>
    <br><br>



        <fieldset>
            <legend>Choose your toppings</legend>
        <input type="checkbox" id="toppingmeat" name="toppingmeat" value="meat">
        <label for="toppingmeat"> Meat </label><br>
        <input type="checkbox" id="toppingcheese" name="toppingcheese" value="cheese">
        <label for="toppingcheese"> Cheese </label><br>
        <input type="checkbox" id="toppingveggies" name="toppingveggies" value="veggies">
        <label for="toppingveggies"> Veggies </label><br><br>
        </fieldset>
    <br><br>
            <label for="address">Delivery address:</label>
        <input id="address" type="text" name="address" placeholder="Enter your address">



    <br><br>
    <button>Submit</button>

</form>

<h3>Delivery address chosen: ${address}</h3>

<c:forEach items="${choices}" var="choice">

        <h3>
            ${choice}
        </h3>

</c:forEach>

</body>
</html>
