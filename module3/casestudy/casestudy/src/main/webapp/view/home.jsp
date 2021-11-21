<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/17/2021
  Time: 7:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/static/css/bootstrap-grid.css">
    <style>
        #nav1{
            margin-top: 20px;
            margin-left:400px;
            margin-bottom: 20px;

        }
        .row-2{
            border: 1px solid  #d2839e ;
        }
        header{
            border: 1px solid  #d2839e ;
        }
        #div1{
            border: 1px solid #17a2b8;
        }
        #div2{
            border: 1px solid #17a2b8;
        }

    </style>
</head>
<body>
<header>
<div class="row">
    <div class="col-9">
        <img src="/static/img/logo.jpg" width="100px"height="100px">
        <h3>Khu nghĩ dưỡng FURAMA</h3>
    </div>
    <div class="col-3">
        <h2>Nguyễn Thị Thảo Ly</h2>
    </div>
</div>
</header>
<div class="row-2">
    <nav class="row" id="nav1">
        <a class="col-1">Home</a>
        <a class="col-1">Employee</a>
        <a class="col-1">Customer</a>
        <a class="col-1">Service</a>
        <a class="col-4">Contract</a>
        <a class="col-1"><input type="search" placeholder="search"></a>

    </nav>
</div>
<div class="row">
    <div class="col-3" id="div1">
        <ul>
            <li><a>Item One</a></li>
            <li><a>Item Two</a></li>
            <li><a>Item Three</a></li>
        </ul>
    </div>
    <div class="col-9" id="div2">
        <h1>Hello</h1>

    </div>
</div>
</body>
</html>
