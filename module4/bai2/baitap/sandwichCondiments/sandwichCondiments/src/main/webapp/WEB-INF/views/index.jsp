<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 12/5/2021
  Time: 12:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Sandwich Condiments</h2>
<form action="/save" method="get">
    <table>

        <c:forEach items="${list}" var="listi">
            <tr>
                <td>${listi}</td>
                <td><input name="condiment" value="${listi}" type="checkbox"></td>
            </tr>

        </c:forEach>
        <hr>

    </table>
    <button type="submit">Create</button>
</form>
</body>
</html>
