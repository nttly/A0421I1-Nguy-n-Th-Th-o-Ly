<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/15/2021
  Time: 5:57 PM
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
            <strong>Create Service</strong>
        </div>
        <div class="form-group">
            <label for="nameservice">Name Service</label>
            <input type="text" class="form-control" id="nameservice" placeholder="Enter Name Service" name="nameService">
        </div>
        <div class="form-group">
            <label for="serviceArea">Service Area</label>
            <input type="number" class="form-control" id="serviceArea" placeholder="Enter Service Area" name="serviceArea">
        </div>
        <div class="form-group">
            <label for="serviceCost">Service Cost</label>
            <input type="number" class="form-control" id="serviceCost" placeholder="Enter Service Cost" name="serviceCost">
        </div>
        <div class="form-group">
            <label for="maxPeople">Max People</label>
            <input type="number" class="form-control" id="maxPeople" placeholder="Enter Max People" name="serviceMaxPeo">
        </div>


        <div class="form-group">
            <label for="rentType">Rent Type </label>
            <select class="form-control" id="rentType" name="serviceRentTypeId">
                <c:forEach items="${b}" var="serviceRentType">
                    <option value="${serviceRentType.getRentTypeId()}">${serviceRentType.getRentName()}</option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group">
            <label for="serviceType">Service Type </label>
            <select class="form-control" id="serviceType" name="serviceTypeId">
                <c:forEach items="${a}" var="serviceType">
                    <option value="${serviceType.getServiceTypeId()}">${serviceType.getServiceTypeName()}</option>
                </c:forEach>
            </select>
        </div>

        <div class="form-group">
            <label for="standRoom">Standard Room</label>
            <input type="text" class="form-control" id="standRoom" name="standRoom" >
        </div>
        <div class="form-group">
            <label for="description">Description Other</label>
            <input type="text" class="form-control" id="description" name="description">
        </div>
        <div class="form-group">
            <label for="poolArea">Pool Area</label>
            <input type="number" class="form-control" id="poolArea" placeholder="Enter Pool" name="pool">
        </div>
        <div class="form-group">
            <label for="numberfloors">Number of floors</label>
            <input type="number" class="form-control" id="numberfloors" placeholder="Enter Number" name="number">
        </div>

        <button type="submit" class="btn btn-primary">Đăng kí</button>
    </form>
</div>
</body>
</html>
