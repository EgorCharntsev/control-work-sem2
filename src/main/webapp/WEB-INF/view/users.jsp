<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${users}" var="user">
<c:out value="${user.name}" />
<c:out value="${user.lastname}" />
<hr>
</c:forEach>
</body>
</html>
