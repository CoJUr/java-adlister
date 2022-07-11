<%--
  Created by IntelliJ IDEA.
  User: cojur
  Date: 7/11/22
  Time: 9:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>City form</h1>
<form action="/favCity">
  <label for="favorite-city" method="POST">Favorite City</label>
  <input id="favorite-city" type="text" name="favorite city" placeholder="enter city">
  <button>Submit</button>
</form>

</body>
</html>
