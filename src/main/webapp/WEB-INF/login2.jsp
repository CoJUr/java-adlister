<%--
  Created by IntelliJ IDEA.
  User: cojur
  Date: 7/20/22
  Time: 10:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/SiteController" method="post">
Username: <input type="text" name="username" value=""><br/>
passsword: <input type="password" name="password">
<input type="submit" value="submit">
</form>
</body>
</html>
