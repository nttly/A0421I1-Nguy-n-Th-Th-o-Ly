<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/22/2021
  Time: 12:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/static/css/bootstrap.css">
</head>
<body>

<div class="container">

    <h3>Quản lí Hợp đồng</h3>
    <div class="row">
        <button class="btn btn-success mb-3" onclick="window.location.href='/contractDetail?action=add'">Create</button>

    </div>

    <table class="table table-striped table-inverse table-responsive">
        <thead class="thead-inverse">
        <tr>
            <th>id contract detail</th>
            <th> id contract</th>
            <th> attach service id</th>
            <th> quantity</th>

        </tr>
        </thead>

        <tbody>
        <c:forEach items="${contracts}" var="contract">
            <tr>
                <td >${contract.idDetail}</td>
                <td >${contract.contractId}</td>
                <td >${contract.serviceid}</td>
                <td >${contract.quantity}</td>
            </tr>
        </c:forEach>

        </tbody>
    </table>
</div>
</body>
</html>
