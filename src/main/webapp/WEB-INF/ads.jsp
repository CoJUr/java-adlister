<%@ page import="static java.lang.System.out" %><%--
  Created by IntelliJ IDEA.
  User: cojur
  Date: 7/16/22
  Time: 3:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><html>
<head>

    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Ads"/>

    </jsp:include>
</head>
<body>

<H1>
    test
</H1>
<jsp:include page="/WEB-INF/partials/navbar.jsp"/>
<c:forEach var="ad" items="${ads}">
    <h2>
            ${ad.title}


    </h2>
</c:forEach>
<a href="<%= request.getContextPath() %> /ads/create">Create Ads</a>
<a href="<%= request.getContextPath() %> /User">View Users</a>

<%--<jsp:include page="/WEB-INF/ads/create.jsp" />--%>


</body>
</html>
