<%@ page import="java.util.Date" %>
<%@ page import="javax.print.MultiDocPrintService" %><%--
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

    <%!
        public void setMultiDocPrintService(Object multiDocPrintService) {
            MultiDocPrintService = multiDocPrintService;
        }

        private Object MultiDocPrintService;
    %>


    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Users" />

    </jsp:include>
</head>
<body>
<h1>Welcome</h1>
<%= new Date() %>
<br/>
    <jsp:include page="/WEB-INF/partials/navbar.jsp" />



<c:forEach var="user" items="${users}">
<%--    <% MultiDocPrintService.toString(); %>--%>
        <h2>
            ${user.username}
        </h2>

</c:forEach>


<a href="<%= request.getContextPath() %> /ads/create">Create Ads</a>
<br/>
<a href="<%= request.getContextPath() %> /ads">View ads</a>
<%--<%--%>
<%--    response.sendRedirect("ads");--%>
<%--%>--%>
</body>
</html>
