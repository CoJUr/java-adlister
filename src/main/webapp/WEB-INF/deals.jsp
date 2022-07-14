<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--
  Created by IntelliJ IDEA.
  User: cojur
  Date: 7/13/22
  Time: 3:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="partials/navbar.jsp" ></jsp:include>
<c:if test="${not empty name}">
  <c:choose>
    <c:when test="${not empty favorite}">
      <h2> ${}
      &nbsp; </h2>
    </c:when>
  </c:choose>


</jsp:include>
</body>
</html>
