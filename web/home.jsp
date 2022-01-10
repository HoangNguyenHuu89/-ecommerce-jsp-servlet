<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <meta name="viewport" content="width=device-width, initial-scale=1.0">
         <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300&display=swap" rel="stylesheet">
        <link href="newcss.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        </head>
        <body>
        <jsp:include page="Menu.jsp"></jsp:include>
            <div class="container">
                <div class="row">
                  <p style="color: red">${error}</p>
                  <c:forEach items="${listP}" var="o">
                    <div class="card col-md-3">
                        <img class="card-img-top" src="${o.product_img_source}" alt="Card image cap">
                        <div class="card-body" style="text-align: center">
                            <a class="card-title" href="info?action=click&pid=${o.product_id}"><h5>${o.product_name}</h5></a>
                            <a href="cart?action=add&id=${o.product_id}" class="btn btn-primary">Buy</a>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
          
            <c:forEach begin="1" end="${pageEnd}" var="i">
<!--                <a href="home?index=${i}" class="${tag==i?"active":""}">${i}</a> -->
             </c:forEach>
  <div class="btn-toolbar" role="toolbar" aria-label="Toolbar with button groups">
  <div class="btn-group mr-2" role="group" aria-label="First group">
    <c:forEach begin="1" end="${pageEnd}" var="i">
    <button type="button" class="btn btn-secondary"><a href="home?index=${i}" class="${tag==i?"active":""}">${i}</a></button>
     </c:forEach>
  </div>
</div>
        <jsp:include page="footer.jsp"></jsp:include>     
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
    </body>
</html>
