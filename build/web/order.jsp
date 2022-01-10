<%-- 
    Document   : order
    Created on : Nov 21, 2021, 8:54:47 PM
    Author     : Hoang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/login.css">
    </head>
    <body>
        <form action="checkout" class="signup" method="post">
            <div class="field">
                <input type="text" placeholder="Name" required name="name">
            </div>
            <div class="field">
                <input type="text" placeholder="PhoneNumber" required name="phone">
            </div>
            <div class="field">
                <input type="text" placeholder="Address" required name="address">
            </div>
              <div class="field">
                <input type="text" placeholder="Discount" required name="discount">
            </div>
 
            <div class="field btn">
              <div class="btn-layer"></div>
              <input type="submit" value="Signup" name="checkout">
            </div>
          </form>
        <script type="text/javascript" src="js/login.js"></script>
    </body>
</html>
