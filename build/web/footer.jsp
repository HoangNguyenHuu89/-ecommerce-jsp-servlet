<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.10.2/css/all.css" />
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" />
        <!-- Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <style>
            footer {
    background: #3a3a3a;
    color: #fff;
    font-size: 14px;
}
footer .footer-top {
    background: #4e4e4e;
    padding: 50px 0px 20px;
}
footer .address p {
    font-size: 16px;
    color: #ddd;
    font-style: italic;
}
footer .social-links a {
    font-size: 17px;
    display: inline-block;
    background: #28251f;
    color: #fff;
    line-height: 1;
    padding: 9px 0;
    margin-right: 5px;
    border-radius: 100%;
    text-align: center;
    width: 36px;
    height: 36px;
    transition: 0.4s;
}
footer .social-links a:hover {
    background: #8bc34a;
}
footer h4 {
    font-size: 18px;
    color: #cddc39;
    padding-bottom: 12px;
}
footer .footer-menus {
    margin-bottom: 30px;
}
footer .footer-menus ul {
    list-style: none;
    padding: 0;
    margin: 0;
}
footer .footer-menus ul li {
    margin-bottom: 10px;
}
footer .footer-menus ul i {
    color: #ffffff;
    font-size: 12px;
    margin-right: 3px;
}
footer .footer-menus ul a {
    color: #fff;
    text-decoration: none;
}
footer .footer-menus ul a:hover {
    color: #cddc39;
}
footer .newsletter form {
    margin-top: 30px;
    background: #3a3a3a;
    padding: 6px 10px;
    position: relative;
    border-radius: 50px;
    border: 1px solid #3a3a3a;
}
footer .newsletter form input[type="email"] {
    border: 0;
    padding: 5px;
    background: #3a3a3a;
    color: #fff;
}
footer .newsletter form input[type="email"]:focus {
    outline: none;
}
footer .newsletter form input[type="submit"] {
    position: absolute;
    top: -1px;
    right: -1px;
    bottom: -1px;
    border: 0;
    font-size: 16px;
    background: #cddc39;
    color: #000;
    border-bottom-right-radius: 50px;
    border-top-right-radius: 50px;
}
footer .newsletter form input[type="submit"]:hover {
    background: #d5e440;
}
.footer-bottom {
    padding: 20px 0px;
}
footer .footer-bottom a {
    color: #cddc39;
    text-decoration: none;
}
        </style>
    </head>
    <body>
        <footer>
            <div class="footer-top">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-3 col-sm-6">
                            <div class="address">
                                <h3>MyPhone</h3>
                                <p class="mb-4 mt-4">Ha Noi, Viet Nam</p>
                                <p><strong>Phone:</strong> +91 8558020904</p>
                                <p><strong>Email:</strong> myphone@gmail.com</p>
                            </div>
                        </div>

                        <div class="col-lg-2 col-sm-6 footer-menus">
                            <h4>Useful Links</h4>
                            <ul>
                                <li><i class="fas fa-check"></i> <a href="#">Home</a></li>
                                <li><i class="fas fa-check"></i> <a href="#">About us</a></li>
                                <li><i class="fas fa-check"></i> <a href="#">Services</a></li>
                                <li><i class="fas fa-check"></i> <a href="#">Terms of service</a></li>
                                <li><i class="fas fa-check"></i> <a href="#">Privacy policy</a></li>
                            </ul>
                        </div>

                        <div class="col-lg-3 col-sm-6 footer-menus">
                            <h4>Our Products</h4>
                            <ul>
                                <li><i class="fas fa-check"></i> <a href="#">Iphone</a></li>
                                <li><i class="fas fa-check"></i> <a href="#">Samsung</a></li>
                                <li><i class="fas fa-check"></i> <a href="#">Oppo</a></li>
                                <li><i class="fas fa-check"></i> <a href="#">Xiaomi</a></li>
                                <li><i class="fas fa-check"></i> <a href="#">LG</a></li>
                            </ul>
                        </div>

                        <div class="col-lg-4 col-sm-6 newsletter">
                            <h4>Our Newsletter</h4>
                            <p>Iphone 14 has been launched in Vietnam</p>
                            <form action="" method="post"><input type="email" name="email" /><input type="submit" value="Subscribe" /></form>

                            <div class="social-links mt-3">
                                <a href="#"><i class="fab fa-facebook-f"></i></a>
                                <a href="#"><i class="fab fa-twitter"></i></a>
                                <a href="#"><i class="fab fa-linkedin-in"></i></a>
                                <a href="#"><i class="fab fa-instagram"></i></a>
                                <a href="#"><i class="fab fa-pinterest-p"></i></a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="footer-bottom">
                <div class="container">
                    <div class="row">
                        <div class="col-12">
                            <p class="text-center mb-2">&copy; Copyright <strong>myphone</strong>. All Rights Reserved</p>
                            <p class="text-center mb-0">Created by <a href="#">myphone</a></p>
                        </div>
                    </div>
                </div>
            </div>
        </footer>
    </body>
</html>