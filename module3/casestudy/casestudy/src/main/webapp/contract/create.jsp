<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/17/2021
  Time: 6:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="/static/css/bootstrap.css">

    <title>Title</title>
</head>
<body><div class="container">
    <form class="border border-primary mt-1 p-2 rounded" method="post">
        <div class="alert alert-primary " role="alert">
            <strong>Create Contract</strong>
        </div>
        <div class="form-group">
            <label for="dateStart">Date Start </label>
            <input type="date" class="form-control" id="dateStart" placeholder="mm/dd/yyyy" name="dateStart">
        </div>
        <div class="form-group">
            <label for="dateEnd">Date End</label>
            <input type="date" class="form-control" id="dateEnd" placeholder="mm/dd/yyyy" name="dateEnd">
        </div>
        <div class="form-group">
            <label for="deposit">Deposit </label>
            <input type="number" class="form-control" id="deposit" name="deposit" >
        </div>
        <div class="form-group">
            <label for="total">Total</label>
            <input type="number" class="form-control" id="total" name="total">
        </div>

        <div class="form-group">
            <label for="id_employee">id employee</label>
            <select class="form-control" id="id_employee" name="idemployee">
                <option value="1" selected>Thang</option>
                <option value="2">Chinh</option>
                <option value="3">Hang</option>
            </select>
        </div>
        <div class="form-group">
            <label for="idcustomer">id customer</label>
            <select class="form-control" id="idcustomer" name="idcustomer">
                <option value="113" selected>nguyen thi tao ly</option>
                <option value="114">pham ho minh thuan</option>
                <option value="115">nguyen thi thuy linh</option>
            </select>
        </div>
        <div class="form-group">
            <label for="idservice">id customer</label>
            <select class="form-control" id="idservice" name="idservice">
                <option value="1" selected> vollu</option>
                <option value="100">room</option>
                <option value="101">service</option>
            </select>
        </div>

        <button type="submit" class="btn btn-primary"> Create </button>
    </form>
</div>
</body>
</html>
