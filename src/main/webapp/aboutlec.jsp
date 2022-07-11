<%--
  Created by IntelliJ IDEA.
  User: cojur
  Date: 7/11/22
  Time: 11:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
  <%@include file="partials/styles.html"%>
    <link rel="stylesheet" href="">
    <link rel="stylesheet" href="">
    <link rel="stylesheet" href="">
</head>
<body>

<h1>About page</h1>

<%--using jsp action syntax to pass params to included files--%>
<jsp:include page="partials/param-example.jsp">
    <jsp:param name="message" value="Hello Param Value"/>
</jsp:include>

<%--can include other jsps--%>
<%@ include file="partials/footer.jsp"%>

<%@ include file="partials/script.jsp"%>

</body>
</html>
