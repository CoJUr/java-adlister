<%--
  Created by IntelliJ IDEA.
  User: cojur
  Date: 7/10/22
  Time: 11:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>


<html>
<head>
    <title>Student confirmation</title>
</head>
<body>

    The student is confirmed: ${param.firstName} ${param.lastName}

<br/><br/>

    Favorite Programming Languages: <br/>
<%--list the user's selected languages--%>
<ul>
    <%

        String[] langs = request.getParameterValues("favoriteLanguage");
//dealing with possible null pointer exception if user doesn't select a checkbox
        if (langs != null) {

            for (String tempLang : langs) {
                out.println("<li>" + tempLang + "<li>");
            }

        }

    %>
</ul>


</body>
</html>
