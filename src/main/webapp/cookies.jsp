<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: cojur
  Date: 7/13/22
  Time: 1:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <jsp:include page="partials/head.jsp">

        <jsp:param name="title" value="Cookies"/>

    </jsp:include>


</head>
<jsp:include page="partials/navbar.jsp" />
<body>

<c:if test="${not empty param.name}">
    <h2>Hi, ${param.name}</h2>
</c:if>
<form action="/Cookies" method="POST">
    <ul>
        <li>
            <label for="name">What is your name?</label>
            <input type="text" name="name" id="name">
            <br>
        </li>

        <li>
            <br>
            <label for="favorite">Whats your favorite cookie</label>
            <input type="text" name="favorite" id="favorite">
        </li>
        </ul>
    <button type="submit">Submit</button>
</form>
</body>
</html>
