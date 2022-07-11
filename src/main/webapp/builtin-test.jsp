<%--
  Created by IntelliJ IDEA.
  User: cojur
  Date: 7/10/22
  Time: 9:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3> JSP built in objects</h3>

Request user agent: <%=request.getHeader("User-Agent") %>

<br/><br/>

Request language: <%=request.getLocale() %>
</body>
</html>
