<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 12/5/2021
  Time: 12:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${condiment}" var="con">
    <span>&nbsp;${con}</span>
</c:forEach>
</body>
</html>
