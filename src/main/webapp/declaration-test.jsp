<html>

<body>

<%!
    String makeItLower(String data) {
        return data.toLowerCase();
    }
%>

Lowercased "Hello World": <% makeItLower("Hello World"); %>
</body>
</html>