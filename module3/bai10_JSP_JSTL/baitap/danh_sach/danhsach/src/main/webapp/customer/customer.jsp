<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 10/31/2021
  Time: 10:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table class="table">
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>BirthDay</th>
        <th>Address</th>
        <th>Image</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="customer" items="${customerList}">
        <tr>
            <td >${customer.id}</td>
            <td >${customer.name}</td>
            <td >${customer.birthday}</td>
            <td >${customer.address}</td>
            <td ><img src="${customer.image}" width="80px" height="80px"></td>
        </tr>
    </c:forEach>

    </tbody>
</table>
</body>
</html>
