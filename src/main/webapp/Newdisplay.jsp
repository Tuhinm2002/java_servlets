<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page isELIgnored="false" %>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--  <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %> --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<c:forEach items="${student}" var="s">
${s }<br/>
</c:forEach> 


<br/>
<br/>

<c:out value="${student}" />

<%-- <sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/jdbc_demo"
user="root" password="root" /> --%> 

<%-- <sql:query var="rs" dataSource="${db}"> select * from students </sql:query> --%> 

</body>
</html>