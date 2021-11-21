<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/22/2021
  Time: 12:45 AM
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
    <form class="border border-primary mt-1 p-2 rounded" method="post">
        <div class="alert alert-primary " role="alert">
            <strong>Create Contract Detail</strong>
        </div>

        <div class="form-group">
            <label for="idContract">id contract</label>
            <select class="form-control" id="idContract" name="idContract">
                <option value="440" selected>440</option>
                <option value="441">441</option>
                <option value="442">442</option>
            </select>
        </div>
        <div class="form-group">
            <label for="idservice">id Service attach</label>
            <select class="form-control" id="idservice" name="idservice">
                <option value="330" selected>massage</option>
                <option value="331">karake</option>
                <option value="332">Food</option>
            </select>
        </div>

        <div class="form-group">
            <label for="quantity">Quantity</label>
            <input type="number" class="form-control" id="quantity" name="quantity">
        </div>

        <button type="submit" class="btn btn-primary"> Create </button>
    </form>
</div>
</body>
</html>
