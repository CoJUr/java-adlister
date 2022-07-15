<%--
  Created by IntelliJ IDEA.
  User: cojur
  Date: 7/15/22
  Time: 2:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Title</title>
  <jsp:include page="/WEB-INF/partials/head.jsp" >
    <jsp:param name="title" value="Authors"/>
  </jsp:include></head>
<body>

<jsp:include page="/WEB-INF/partials/navbar.jsp" />

<c:forEach var="author" items="${quotes}">
  <div>
    <p>${quote.author.last_name}</p>
  </div>
</c:forEach>


</body>
</html>
