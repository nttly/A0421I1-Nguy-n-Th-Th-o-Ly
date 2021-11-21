<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/22/2021
  Time: 12:50 AM
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

    <form class="border border-primary mt-1 p-2 rounded" method="post">
        <div class="alert alert-primary " role="alert">
            <strong>Create Employee</strong>
        </div>
        <div class="form-group">
            <label for="nameEmployee">Name Employee</label>
            <input type="text" class="form-control" id="nameEmployee" placeholder="Enter Name Employee" name="nameEmployee">
        </div>
        <div class="form-group">
            <label for="birthDay">BirthDay</label>
            <input type="date" class="form-control" id="birthDay" placeholder="dd/mm/yyyy" name="birthDay">
        </div>
        <div class="form-group">
            <label for="idcard">Id Card</label>
            <input type="number" class="form-control" id="idcard" placeholder="Enter number Id Card" name="idCard">
        </div>
        <div class="form-group">
            <label for="salary">Salary</label>
            <input type="number" class="form-control" id="salary" placeholder="Enter Number Salary" name="salary">
        </div>

        <div class="form-group">
            <label for="phone">Phone</label>
            <input type="number" class="form-control" id="phone" name="phone" >
        </div>
        <div class="form-group">
            <label for="email">Email</label>
            <input type="text" class="form-control" id="email" name="email">
        </div>
        <div class="form-group">
            <label for="address">Address</label>
            <input type="text" class="form-control" id="address" placeholder="Enter address" name="address">
        </div>
        <div class="form-group">
            <label for="position">Position</label>
            <select class="form-control" id="position" name="positionId">
                <option value="1" selected>Lễ tân</option>
                <option value="2">Phục vụ</option>
                <option value="3">Chuyên viên</option>
                <option value="4">Giám sát</option>
                <option value="5">Quản lí</option>
                <option value="6">Giám đốc</option>
            </select>
        </div>
        <div class="form-group">
            <label for="educationId">Education degree</label>
            <select class="form-control" id="educationId" name="educationId">
                <option value="1" selected>Trung cấp</option>
                <option value="2">Cao Đẳng</option>
                <option value="3">Đại Học</option>
                <option value="4">Sau Đại Học</option>
            </select>
        </div>
        <div class="form-group">
            <label for="division">Division</label>
            <select class="form-control" id="division" name="division">
                <option value="1" selected>Sale-Marketin</option>
                <option value="2">Hành chính</option>
                <option value="3">Phục vụ</option>
                <option value="4">Quản lí</option>
            </select>
        </div>
        <button type="submit" class="btn btn-primary">Đăng kí</button>
    </form>
</div>
</body>
</html>
