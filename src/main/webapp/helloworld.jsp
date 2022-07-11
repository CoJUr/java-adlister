<%--
  Created by IntelliJ IDEA.
  User: cojur
  Date: 7/10/22
  Time: 6:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>Hello World of java</h3>

the time on the server is <%= new java.util.Date()%>
<%--                        ^JSP expression--%>

<%--JSP Expressions:    <% some java expression %>  gets .tostringed to make html    --%>
<%=new String("Hello World!").toUpperCase() %>

<br/><br/>

<%= 25*4 %>

<br/> <br/>

<%= 75 < 69 %>

<br/> <br/>

<%--JSP Scriptlet--%>
<% some java code: 1 or many lines of java code %>

<%
    for (int i = 0; i <= 5; i++) {
        out.println("<br/>I love luv2code " + i);
    }
%>

<%--JSP declaration --%>
<%! variable or method declaration %>

<%!
    String makeItLower(String data) {
        return data.toLowerCase();
    }

%>

<%=makeItLower("Hello World") %>

Student confirmed: ${param.firstName} ${param.lastName}
//
request.getParameter

</body>
</html>
