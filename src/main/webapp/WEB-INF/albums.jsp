<%--
  Created by IntelliJ IDEA.
  User: cojur
  Date: 7/15/22
  Time: 10:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

  <jsp:include page="/WEB-INF/partials/head.jsp">
    <jsp:param name="title" value="Your Profile" />
  </jsp:include>

</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />

<c:forEach var="album" items="${albums}">
  <div>
    <p>${album.street}</p>
  </div>
</c:forEach>

</body>
</html>
