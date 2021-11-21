<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/15/2021
  Time: 5:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="/static/css/bootstrap.css">

    <title>Title</title>
</head>
<body><div class="container">
    <button class="btn btn-success mb-3" onclick="window.location.href='/service?action=addService'">Create</button>
    <table class="table table-striped table-inverse table-responsive">
        <thead class="thead-inverse">
        <tr>
            <th>id service</th>
            <th> Service Name</th>
            <th>dien tich</th>
            <th>so nguoi o</th>
            <th>kieu thue</th>
            <th>loai service</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${services}" var="service">
            <tr>
                <td >${service.service_id}</td>
                <td >${service.service_name}</td>
                <td >${service.service_area}</td>
                <td >${service.rent_id}</td>
                <td >${service.service_people}</td>
                <td >${service.service_type_id}</td>
            </tr>


        </c:forEach>

        </tbody>
    </table>
</div>
</body>
</html>
