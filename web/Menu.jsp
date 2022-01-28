<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse " id="navbarSupportedContent" >
        <ul class="navbar-nav mr-auto">
             <li class="nav-item active">
                 <h3>MYPHONE</h3>
            </li>
            <li class="nav-item active" style="margin-left: 20px">
                <a class="nav-link" href="home">Home</a>
            </li>
            <li class="nav-item active" style="margin-left: 20px">
                <a class="nav-link" href="Cart.jsp">Cart</a>
            </li>
             <c:if test="${sessionScope.acc.account_role == 1}">
             <li class="nav-item active" style="margin-left: 20px">
                <a class="nav-link" href="manager">Admin Manager</a>
            </li>
           </c:if>
            <c:if test="${sessionScope.acc == null}">
             <li class="nav-item active" style="margin-left: 20px">
                <a class="nav-link" href="login.jsp">Log in</a>
            </li>
           </c:if>
           <c:if test="${sessionScope.acc != null}">
              <li class="nav-item active" style="margin-left: 20px">
                <a class="nav-link" href="#">${sessionScope.acc.user_name}</a>
            </li>
             <li class="nav-item active" style="margin-left: 20px">
                <a class="nav-link" href="logout">Log out</a>
            </li>
           </c:if>
            <li class="nav-item active" style="margin-left: 20px">
                <a class="nav-link" href="home">About Us</a>
            </li>
            <li class="nav-item">
            </li>
            <li class="nav-item dropdown">
                
            </li>
            <li class="nav-item">
            </li>
        </ul>
        <form class="form-inline my-2 my-lg-0" action="search?index=1" method="post">
            <input class="form-control mr-sm-2" type="search" name="txt" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
    </div>
</nav>