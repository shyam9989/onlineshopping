
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span> <span
                    class="icon-bar"></span> <span class="icon-bar"></span> <span
                    class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="${contextRoot }/home">Online
                Shopping</a>
        </div>
        <div class="collapse navbar-collapse"
             id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li id="about"><a href="${contextRoot }/about">About</a></li>

                <li id="contact"><a href="${contextRoot }/contact">Contact</a></li>

                <li id="listProducts"><a
                        href="${contextRoot }/show/all/products">View Product</a></li>
               
                    <li id="manageProducts"><a
                            href="${contextRoot }/manage/products">Manage Products</a></li>
               
            </ul>
            <ul class="nav navbar-nav navbar-right">
              
                        <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                            <security:authorize access="hasAuthority('USER')">
                                <li id="cart"><a href="${contextRoot}/cart/show"> <span
                                        class="glyphicon glyphicon-shopping-cart"></span>&#160;<span
                                        class="badge">${userModel.cart.cartLines }</span> - &#8377;
                                        ${userModel.cart.grandTotal }
                                </a></li>

                                <li role="separator" class="divider"></li>
                            </security:authorize>
                            <li id="logout"><a href="${contextRoot}/logout">Logout</a></li>
                        </ul>
                
            </ul>
        </div>
    </div>
</nav>


<script type="text/javascript">

    window.userRole = '${userModel.role }';

</script>






