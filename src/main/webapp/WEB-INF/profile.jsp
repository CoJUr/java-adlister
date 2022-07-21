<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <jsp:include page="/WEB-INF/partials/navbar.jsp" />

    <div class="container">
        <h1>Welcome, ${sessionScope.user.username}!</h1>
    </div>

<%
    String username=null, sessionID=null;
//    create an array of cookies
    Cookie[] cookies = request.getCookies();

    if (cookies != null) {
        for (Cookie cookie: cookies) {
//            check for the cookies with the right username(username) and session ID (JSessionID)
            if (cookie.getName().equals("username")) {
//                if the cookie is named user name, put it in a var
                username = cookie.getValue();
            }
            if (cookie.getName().equals("JSESSIONID")) {
//                put it in the sessionID var
                sessionID = cookie.getValue();
            }
        }
    }
//    make it so only the logged in user can visit the page
    if (sessionID == null || username == null) {
        response.sendRedirect("/login");
    }

%>

<%--use expression element to print the cookies--%>
    Username:
<%=username %> <br/>
    Current session:
<%=sessionID %>

<%--log out the user--%>
    <form action="<%= request.getContextPath()%>/profile" method="get">
        <input type="hidden" name="action" value="destroy">
        <input type="submit" value="Logout">
    </form>

</body>
</html>
