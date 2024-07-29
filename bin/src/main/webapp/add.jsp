<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<%@page import = "java.util.Date"%>


<%!
int j = 0;
%>


<%
            int num1 = Integer.parseInt(request.getParameter("num1"));
            int num2 = Integer.parseInt(request.getParameter("num2"));

            int num3 = num1 * num2;

            out.println("Result is " + num3);
%>
<br/>
My favourite number is
<%= j %>

</body>
</html>