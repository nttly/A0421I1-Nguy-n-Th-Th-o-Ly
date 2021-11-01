<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 10/27/2021
  Time: 8:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="displayDiscountCalculator" method="post">
    <div class="form-group">
      <label >Product Description</label>
      <input type="text" class="form-control" name="description">

    </div>
    <div class="form-group">
      <label >List Price </label>
      <input type="text" class="form-control" name="listPrice">
    </div>
    <div class="form-group">
      <label >Discount Percent</label>
      <input type="text" class="form-control" name="Discount_Percent" >
    </div>

    <button type="submit" class="btn btn-primary">Calculate Discount </button>
  </form>
  </body>
</html>
