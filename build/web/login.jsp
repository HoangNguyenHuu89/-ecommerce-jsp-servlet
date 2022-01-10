<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <title>Insert title here</title>
        <link rel="stylesheet" href="css/login.css">
    </head>
    <body>

        <div class="wrapper">
            <div class="title-text">
                <div class="title login">Login Form</div>
                <div class="title signup">Signup Form</div>
            </div>
            <div class="form-container">
                <div class="slide-controls">
                    <input type="radio" name="slide" id="login" checked>
                    <input type="radio" name="slide" id="signup">
                    <label for="login" class="slide login">Login</label>
                    <label for="signup" class="slide signup">Signup</label>
                    <div class="slider-tab"></div>
                </div>
                <div class="form-inner">
                    <form action="login" class="login" method="post">
                        <div class="field">
                            <p class="error">${error}</p>
                            <input type="text" placeholder="Email Address" required name ="username">
                        </div>
                        <div class="field">
                            <input type="password" placeholder="Password" required name="password">
                        </div>
                        <div class="pass-link"><a href="#">Forgot password?</a></div>
                        <div class="field btn">
                            <div class="btn-layer"></div>
                            <input type="submit" value="Login" name="action">
                        </div>
                        <div class="signup-link">Not a member? <a href="">Signup now</a></div>
                    </form>
                    <form action="sign" class="signup">
                        <div class="field">
                            <p class="error">${errorconfirm}</p>
                            <p class="error">${error1}</p>
                            <input type="text" placeholder="Email Address" required name="user">
                        </div>
                        <div class="field">
                            <input type="password" placeholder="Password" required name="pass">
                        </div>
                        <div class="field">
                            <input type="password" placeholder="Confirm password" required name="pass1">
                        </div>
                        <div class="field">
                            <input type="text" placeholder="Name" required name="name">
                        </div>
                        <div class="field">
                            <input type="text" placeholder="Address" required name="address">
                        </div>
                        <div class="field">
                            <input type="text" placeholder="Phone" required name="phone">
                        </div>
                        <div class="field btn">
                            <div class="btn-layer"></div>
                            <input type="submit" value="Signup">
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <script type="text/javascript" src="js/login.js"></script>
    </body>
</html>