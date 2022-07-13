<%--
  Created by IntelliJ IDEA.
  User: cojur
  Date: 7/13/22
  Time: 9:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<c:forEach var="ad" items="${ads}">

    <h2>${ad.name}
    ${ad.price}</h2>

</c:forEach>

</body>
</html>
