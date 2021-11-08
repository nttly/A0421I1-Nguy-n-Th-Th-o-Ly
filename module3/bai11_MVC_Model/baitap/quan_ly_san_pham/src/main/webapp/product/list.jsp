<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/5/2021
  Time: 2:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.css">
    <title>List</title>
</head>
<body>

<header>
    <nav class="navbar navbar-expand-md navbar-dark"
         style="background-color: green">
        <div>
            <a href="#" class="navbar-brand">
                Management Application </a>
        </div>

        <ul class="navbar-nav">
            <li><a href="<%=request.getContextPath()%>/products"
                   class="nav-link">Products</a></li>
        </ul>
    </nav>
</header>
<br>
<div class="container ">

    <div class="row">
        <div class="col-lg-1 ">
            <button type="button" class="btn btn-success mb-2" onclick="window.location.href='/products?action=create'" >Create</button>
        </div>

        <div class="col-lg-10  ">
            <form method="get">

                <div class="input-group mb-3">
                    <input type="text" class="form-control" placeholder="Recipient's username" aria-label="Recipient's username" value="${namesearch}"  aria-describedby="basic-addon2" name="search" id="search">
                    <div class="input-group-append">
                        <button class="btn btn-outline-secondary" onclick="window.location.href='/products?action=search&namesearch='+document.getElementById('search').value" type="button">Button</button>
                    </div>
                </div>
            </form>
        </div>
        </form>
    </div>
    <c:if test="${message != null}">

        <!-- Modal -->
        <div class="modal fade" id="myModal" role="dialog" >
            <div class="modal-dialog">

                <!-- Modal content-->
                <div class="modal-content">
                    <div class="modal-header"> <h4 class="modal-title">Thông báo</h4>
                        <button type="button" class="close" data-dismiss="modal">&times;</button>

                    </div>
                    <div class="modal-body">
                        <p>Không tìm thấy sản phẩm</p>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Oke nhé</button>
                    </div>
                </div>

            </div>
        </div>

    </c:if>
    <c:if test="${message == null}">
        <table class="table text-center">

            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Description</th>
                <th>Price</th>
                <th>Producer</th>
                <th>Operation</th>
            </tr>

            <tbody>



            <c:forEach items="${products}" var="product">
                <tr>
                    <td >${product.getIdProduct()}</td>
                    <td>${product.getNameProduct()}</td>
                    <td>${product.getDescription()}</td>
                    <td>${product.getPriceProduct()}</td>
                    <td>${product.getProducer()}</td>
                    <td >
                        <button type="button" onclick="window.location.href='/products?action=update&id=${product.getIdProduct()}'" class="btn btn-info">Edit</button>
                        <!-- Button trigger modal -->
                        <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#exampleModal">
                            Delete
                        </button>

                        <!-- Modal -->
                        <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                            <div class="modal-dialog" role="document">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h5 class="modal-title" id="exampleModalLabel">Xác Nhận </h5>
                                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                            <span aria-hidden="true">&times;</span>
                                        </button>
                                    </div>
                                    <div class="modal-body">
                                        <h4>Bạn chắc có muốn xoá sản phẩm "${product.getNameProduct()}"</h4>
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Không</button>
                                        <button type="button" class="btn btn-primary" onclick="window.location.href='/products?action=delete&id=${product.getIdProduct()}'" >Có</button>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <button type="button" onclick="window.location.href='/products?action=view&id=${product.getIdProduct()}'" class="btn btn-warning">View</button>

                </tr>
            </c:forEach>
            <div class="paging">
                <c:forEach begin="1" end="${endPage}" var="i">
                    <a href="/products?action=search&namesearch=${namesearch}">${i}</a>
                </c:forEach>
            </div>

            </tbody>
        </table>
    </c:if>
</div>


<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="/static/jquery/jquery-3.5.1.min.js"></script>
<script src="/static/jquery/popper.min.js"></script>
<script src="/static/Bootstrap4/js/bootstrap.js"></script>
<script type="text/javascript">
    $(document).ready(function(){
        $("#myModal").modal('show');
    });
</script>
</body>
</html>
