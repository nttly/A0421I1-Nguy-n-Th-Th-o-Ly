<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 10/31/2021
  Time: 9:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh Sách</title>
</head>
<body>
<h1 style="text-align: center">Danh sách khách hàng</h1>
<table class="table table-hover">
    <tr >
        <th>Tên</th>
        <th>Ngày sinh</th>
        <th>Địa chỉ</th>
        <th>Hình ảnh</th>
    </tr>
    <c:forEach items="${list}" var="customer">
        <tr >
            <td>${customer.name}</td>
            <td>${customer.date}</td>
            <td>${customer.address}</td>
            <td><img src="${customer.img} "height="50px" width="50px"></td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
