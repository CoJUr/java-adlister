<%--
  Created by IntelliJ IDEA.
  User: cojur
  Date: 7/12/22
  Time: 11:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess</title>
</head>
<body>

<form action="/guess" method="POST">
    <h1>Guess 1-3</h1>
    <input type="number" name="guess"/>

    <button type="submit">Submit guess</button>
</form>


</body>
</html>
