<%--
  Created by IntelliJ IDEA.
  User: cojur
  Date: 7/16/22
  Time: 3:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>

    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Users" />

    </jsp:include>
</head>
<body>
<h1>Welcome</h1>
    <jsp:include page="/WEB-INF/partials/navbar.jsp" />

<c:forEach var="user" items="${users}">
        <h2>
            ${user.username}
        </h2>
</c:forEach>
</body>
</html>
