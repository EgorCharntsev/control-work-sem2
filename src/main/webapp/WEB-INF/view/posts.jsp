<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${posts}" var="post">
<h1><c:out value="${post.title}" /></h1>
<p><c:out value="${post.text}" /></p>
<p><c:out value="${post.price}" /></p>
</c:forEach>
</body>
</html>
