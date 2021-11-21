<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/22/2021
  Time: 12:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="/static/css/bootstrap.css">
    <title>Title</title>
</head>
<body>
<div class="container">

    <h3>Quản lí Hợp đồng</h3>
    <div class="row">
        <button class="btn btn-success mb-3" onclick="window.location.href='/contract?action=add'">Create</button>

    </div>

    <table class="table table-striped table-inverse table-responsive">
        <thead class="thead-inverse">
        <tr>
            <th>id contract</th>
            <th> Start Date</th>
            <th> End Date</th>
            <th> Deposit</th>
            <th> Total</th>
            <th> Employee id</th>
            <th> customer id</th>
            <th> service id</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${contracts}" var="contract">
            <tr>
                <td >${contract.contacId}</td>
                <td >${contract.dateStart}</td>
                <td >${contract.dateEnd}</td>
                <td >${contract.deposit}</td>
                <td >${contract.contractTotal}</td>
                <td >${contract.employeeId}</td>
                <td >${contract.customerId}</td>
                <td >${contract.serviceId}</td>
            </tr>
        </c:forEach>

        </tbody>
    </table>
</div>
</body>
</html>
