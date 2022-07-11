<%--
  Created by IntelliJ IDEA.
  User: cojur
  Date: 7/8/22
  Time: 4:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Fill out this login form!</h1>

<form action="/login" method="POST">
    <label for="username" method="">Username</label>
    <input id="username" type="text" name="username" placeholder="enter username">
    <label for="password" method="">Pssword</label>
    <input id="password" type="text" name="password" placeholder="enter password">
    <button>Submit</button>

    <%@include file="partials/navbar.jsp" %>
</form>
</body>
</html>
