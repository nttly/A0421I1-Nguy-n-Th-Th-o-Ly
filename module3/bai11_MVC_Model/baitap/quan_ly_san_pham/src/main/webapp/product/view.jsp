<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/5/2021
  Time: 2:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.css">
    <title>View</title>
</head>
<body>
<button class="btn btn-warning" type="button" onclick="window.location.href='/products'">Quay lại</button>
<form method="post">
    <fieldset>

        <table class="table table-striped table-inverse table-responsive">
            <tbody>
            <tr>
                <td>Name :
                </td>
                <td>${product.getNameProduct()} </td>

            </tr>
            <tr>
                <td>Description :
                </td>
                <td>${product.getDescription()} </td>

            </tr>
            <tr>
                <td>Price Product :
                </td>
                <td>${product.getPriceProduct()}</td>

            </tr>
            <tr>
                <td>Producer :
                </td>
                <td>${product.getProducer()} </td>

            </tr>
            </tbody>
        </table>
    </fieldset>
</form>
</body>
</html>
