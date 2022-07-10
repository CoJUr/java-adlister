<%--
  Created by IntelliJ IDEA.
  User: cojur
  Date: 7/9/22
  Time: 11:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--need one more thing to use the tags...another JSP directive : --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--^creates a bunch of tags and combines them to the "c". lets us use the forEach--%>
<html>
<head>
    <title>Title</title>

</head>
<body>

<h1>Ads here</h1>
<%--displaying all the adds  --%>
<%--<h2>Value from the servlet: ${ads} </h2>--%>
<%--                            ^take this attribute, put in items="" --%>


<c:forEach items="${ads}" var ="ad">

    <div>
        <h3>${ad.name}</h3>
        <p>${ad.description}</p>
    </div>

</c:forEach>

</body>
</html>
