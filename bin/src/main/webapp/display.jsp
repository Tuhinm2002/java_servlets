<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<%
String name = request.getAttribute("label").toString();
out.println(name);
%>
</body>
</html>