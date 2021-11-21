<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/22/2021
  Time: 12:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/static/css/bootstrap.css">

</head>
<body>
<form class="border border-primary mt-1 p-2 rounded" method="post">
    <div class="alert alert-primary " role="alert">
        <strong>Đăng kí thành viên</strong>
    </div>
    <div class="form-group">
        <label for="namecustomer">Họ và Tên </label>
        <input type="text" class="form-control" id="namecustomer" placeholder="Họ và Tên khách hàng" name="nameCustomer">
    </div>
    <div class="form-group">
        <label for="birthay">Ngày sinh</label>
        <input type="date" class="form-control" id="birthay" placeholder="mm/dd/yyyy" name="birthdayCus">
    </div>
    <div class="form-group">
        <label for="gender">Giới tính</label>
        <select class="form-control" id="gender" name="gender">
            <option value="1">Nam</option>
            <option value="0">Nữ</option>
        </select>
    </div>
    <div class="form-group">
        <label for="card_id">mã thẻ căn cước </label>
        <input type="number" class="form-control" id="card_id" name="idCard" >
    </div>
    <div class="form-group">
        <label for="phone">Số điện thoại</label>
        <input type="number" class="form-control" id="phone" name="phoneCus">
    </div>
    <div class="form-group">
        <label for="email">Email</label>
        <input type="email" class="form-control" id="email" name="emailCus" >
    </div>
    <div class="form-group">
        <label for="address">Địa chỉ</label>
        <input type="text" class="form-control" id="address" name="emailCus">
    </div>
    <div class="form-group">
        <label for="id_type_customer">Loại khách hàng</label>
        <select class="form-control" id="id_type_customer" name="serviceCus">
            <c:forEach items="${customerTypes}" var="customerType">
                <option value="${customerType.customertypeId}">${customerType.customerTypeName}</option>
            </c:forEach>
        </select>
    </div>
    <button type="submit" class="btn btn-primary">Đăng kí</button>
</form>
</div>
</body>
</html>
