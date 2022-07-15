<%--
  Created by IntelliJ IDEA.
  User: cojur
  Date: 7/15/22
  Time: 12:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <jsp:include page="/WEB-INF/partials/head.jsp" >
        <jsp:param name="title" value="Quotes"/>
    </jsp:include>
</head>
<body>

<h2>Add and author to the database: </h2>
<form action="authors" method="post">
    <label for="last_name">Author name:</label>
    <input type="text" name="last_name" id="last_name">
    <input type="submit" value="submit">
</form>

<jsp:include page="/WEB-INF/partials/navbar.jsp" />

<c:forEach var="quote" items="${quotes}">
    <div>
        <p>${quote.author.last_name} said: ${quote.content}</p>
    </div>
</c:forEach>

</body>
</html>
