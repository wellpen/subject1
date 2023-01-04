<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset="UTF-8" />
<meta name="description" content="Ogani Template" />
<meta name="keywords" content="Ogani, unica, creative, html" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="ie=edge" />
<title>LETITGO</title>

<!-- Google Font -->
<link
	href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap"
	rel="stylesheet" />
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css"
	rel="stylesheet" />
<!--自然改-->
<!-- Css Styles -->
<link rel="stylesheet" href="memberupdatehtml/css/bootstrap.min.css"
	type="text/css" />
<link rel="stylesheet" href="memberupdatehtml/css/font-awesome.min.css"
	type="text/css" />
<link rel="stylesheet" href="memberupdatehtml/css/elegant-icons.css"
	type="text/css" />
<link rel="stylesheet" href="memberupdatehtml/css/nice-select.css"
	type="text/css" />
<link rel="stylesheet" href="memberupdatehtml/css/jquery-ui.min.css"
	type="text/css" />
<link rel="stylesheet" href="memberupdatehtml/css/owl.carousel.min.css"
	type="text/css" />
<link rel="stylesheet" href="memberupdatehtml/css/slicknav.min.css"
	type="text/css" />
<link rel="stylesheet" href="memberupdatehtml/css/style.css"
	type="text/css" />

<style>
table#table-1 {
	background-color: #CCCCFF;
	border: 2px solid black;
	text-align: center;
}

table#table-1 h4 {
	color: red;
	display: block;
	margin-bottom: 1px;
}

h4 {
	color: blue;
	display: inline;
}

table {
	width: 800px;
	background-color: white;
	margin-top: 5px;
	margin-bottom: 5px;
}

table, th, td {
	border: 1px solid rgb(185, 185, 185);
}

th, td {
	padding: 5px;
	text-align: center;
}
</style>




<!-- Page Preloder -->
<div id="preloder">
	<div class="loader"></div>
</div>

<header class="header">
	<!-- Humberger Begin -->
	<div class="humberger__menu__overlay"></div>
	<div class="humberger__menu__wrapper">
		<div class="humberger__menu__logo">
			<a href="select_page.jsp"><img
				src="/memberupdatehtml/img/Frame6.svg" alt="" /></a>
			<!--自然改-->
		</div>
		<div class="humberger__menu__cart">
			<ul>
				<li><a href="#"><i class="fa fa-heart"></i> </a></li>
				<!--自然改-->
				<li><a href="select_page.jsp"><i class="fa-solid fa-house"></i>
				</a></li>
				<!--自然改-->
				<!--這個圖示用來做回首頁-->
				<li><a href="./shoping-cart.html"><i
						class="fa-solid fa-cart-shopping"></i> </a></li>
				<!--自然改-->
				<!--這個圖示用來做購物車-->
				<li><a href="#"><i class="fa-solid fa-ticket"></i></a></li>
				<!--自然改-->
				<!--這個圖示用來做我的票券-->
				<li><a href="#"><i class="fa-solid fa-person"></i></a></li>
				<!--自然改-->
				<!--這個圖示用來做登入-->
			</ul>
			<!-- <div class="header__cart__price">item: <span>$150.00</span></div> -->
		</div>
		<div class="humberger__menu__widget"></div>
		<nav class="humberger__menu__nav mobile-menu">
			<ul>
				<li class="active"><a href="select_page.jsp">Home</a></li>
				<li><a href="./shop-grid.html">Shop</a></li>
				<li><a href="#">會員中心</a>
					<ul class="header__menu__dropdown">
						-->
						<li><a href="#">帳戶管理</a></li>
						<!--自然改-->
						<li><a href="#">訂單查詢</a></li>
						<!--自然改-->
						<li><a href="#">我的錢包</a></li>
						<li><a href="#">我的票夾</a></li>
						<!--自然改-->
						<li><a href="#">我的最愛</a></li>
						<!--自然改-->
						<li><a href="#">會員權益</a></li>
						<!--自然改-->
						<li><a href="./contact.html">聯繫客服</a></li>
						<!--自然改-->
						<li><a href="#">買家FAQ</a></li>
						<!--自然改-->
					</ul></li>
				<li><a href="#">賣家中心</a>
					<ul class="header__menu__dropdown">
						<li><a href="#">訂單管理</a></li>
						<!--自然改-->
						<li><a href="#">商品管理</a></li>
						<!--自然改-->
						<li><a href="#">財務管理</a></li>
						<!--自然改-->
						<li><a href="#">帳戶管理</a></li>
						<!--自然改-->
						<li><a href="#">我的報表</a></li>
						<!--自然改-->
						<li><a href="#">賣家FAQ</a></li>
						<!--自然改-->
					</ul></li>
			</ul>
		</nav>
		<div id="mobile-menu-wrap"></div>

	</div>

	<div class="container">
		<div class="row">
			<div class="col-lg-3">
				<div class="header__logo">
					<a href="select_page.jsp"><img
						src="memberupdatehtml/img/Frame6.svg" alt="" /></a>
					<!--自然改-->
				</div>
			</div>
			<div class="col-lg-6">
				<nav class="header__menu">
					<ul>
						<li>
							<!-- <a href="#">會員中心</a> -->
							<ul class="header__menu__dropdown">

							</ul>
						</li>
						<li><a href="#">賣家中心</a>
							<ul class="header__menu__dropdown">
								<li><a href="#">訂單管理</a></li>
								<!--自然改-->
								<li><a href="#">商品管理</a></li>
								<!--自然改-->
								<li><a href="#">財務管理</a></li>
								<!--自然改-->
								<li><a href="#">帳戶管理</a></li>
								<!--自然改-->
								<li><a href="#">我的報表</a></li>
								<!--自然改-->
								<li><a href="#">賣家FAQ</a></li>
								<!--自然改-->
							</ul></li>
					</ul>
				</nav>
			</div>
			<div class="col-lg-3">
				<div class="header__cart">
					<ul>
						<li><a href="#"><i class="fa fa-heart"></i> </a></li>
						<!--自然改-->
						<li><a href="/select_page.jsp"><i
								class="fa-solid fa-house"></i> </a></li>
						<!--自然改-->
						<!--這個圖示用來做回首頁-->
						<li><a href="./shoping-cart.html"><i
								class="fa-solid fa-cart-shopping"></i> </a></li>
						<!--自然改-->
						<!--這個圖示用來做購物車-->
						<li><a href="#"><i class="fa-solid fa-ticket"></i></a></li>
						<!--自然改-->
						<!--這個圖示用來做我的票券-->
						<li><a href="#"><i class="fa-solid fa-person"></i></a></li>
						<!--自然改-->
						<!--這個圖示用來做登入-->
					</ul>
					<!-- <div class="header__cart__price">item: <span>$150.00</span></div> -->
				</div>
			</div>
		</div>
		<div class="humberger__open">
			<i class="fa fa-bars"></i>
		</div>
	</div>
</header>
<!-- Header Section End -->
<!-- Hero Section Begin -->
<section class="hero">
	<div class="container">
		<div class="row">
			<div class="col-lg-3">
				<div class="hero__categories">
					<div class="hero__categories__all">
						<i class="fa fa-bars"></i> <span>會員中心</span>
						<!--韋爾改-->
					</div>
					<ul>
						<li><a href="listAllMemberupdate.jsp">帳戶管理</a></li>
						<!--韋爾改-->
						<li><a href="order.html">訂單查詢</a></li>
						<!--韋爾改-->
						<li><a href="../walletrecord/listAllWalletrecord.jsp">我的錢包</a></li>
						<!--韋爾改-->
						<li><a href="../ticket/listAllTicket.jsp">我的票夾</a></li>
						<li><a href="#">我的最愛</a></li>
						<!--韋爾改-->
						<li><a href="../MemberBenefits.html">會員權益</a></li>
						<!--韋爾改-->
						<li><a href="../CustomerService.html">聯繫客服</a></li>
						<!--韋爾改-->
						<li><a href="../FAQ.html">買家FAQ</a></li>
						<!--韋爾改-->

					</ul>
				</div>
			</div>
			<div class="col-lg-9">
				<hr>
				<div class="tab-content" id="nav-tabContent">
					<div class="tab-pane fade show active" id="nav-home"
						role="tabpanel" aria-labelledby="nav-home-tab">
						<table>
							<c:if test="${not empty errorMsgs}">
								<font style="color: red">請修正以下錯誤:</font>
								<ul>
									<c:forEach var="message" items="${errorMsgs}">
										<li style="color: red">${message}</li>
									</c:forEach>
								</ul>
							</c:if>


							<input type="button" value="瀏覽全部會員"
								onclick="location.href='listAllMember.jsp'">
							<br>
							<br>
							<br>

							<input type="button" value="新增會員"
								onclick="location.href='addMember.jsp'">

							<br>
							<br>
							<br>
							<FORM METHOD="post" ACTION="member.do">
								<b>輸入會員編號 :</b> <input type="text" name="memberserialnumber">
								<input type="hidden" name="action" value="getOne_For_Display">
								<input type="submit" value="送出">
							</FORM>

							<br>

						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>

<!-- Footer Section Begin -->
<footer class="footer spad">
	<div class="container">
		<div class="row">
			<div class="col-lg-3 col-md-6 col-sm-6">
				<div class="footer__about">
					<div class="footer__about__logo">
						<a href="select_page.jsp"><img
							src="memberupdatehtml/img/Frame6.svg" alt="" /></a>
					</div>
					<ul>
						<li>地址：100 台北市中正區濟南路一段321號</li>
						<!--自然改-->
						<li>電話：02-12345678</li>
						<!--自然改-->
						<li>Email: caldonic@gmail.com</li>
						<!--自然改-->
					</ul>
				</div>
			</div>
			<div class="col-lg-4 col-md-6 col-sm-6 offset-lg-1">
				<div class="footer__widget">
					<h6>相關連結</h6>
					<ul class="header__menu__dropdown">
						<li><a href="#">帳戶管理</a></li>
						<!--自然改-->
						<li><a href="#">訂單查詢</a></li>
						<!--自然改-->
						<li><a href="#">我的錢包</a></li>
						<!--自然改-->
						<li><a href="#">我的最愛</a></li>
						<!--自然改-->
						<li><a href="#">會員權益</a></li>
						<!--自然改-->
						<li><a href="./contact.html">聯繫客服</a></li>
						<!--自然改-->
						<li><a href="#">買家FAQ</a></li>
						<!--自然改-->
					</ul>
					<ul class="header__menu__dropdown">
						<li><a href="#">訂單管理</a></li>
						<!--自然改-->
						<li><a href="#">商品管理</a></li>
						<!--自然改-->
						<li><a href="#">財務管理</a></li>
						<!--自然改-->
						<li><a href="#">帳戶管理</a></li>
						<!--自然改-->
						<li><a href="#">我的報表</a></li>
						<!--自然改-->
						<li><a href="#">賣家FAQ</a></li>
						<!--自然改-->
					</ul>
				</div>
			</div>
			<div class="col-lg-4 col-md-12">
				<div class="footer__widget">
					<!-- <h6>Join Our Newsletter Now</h6>
                        <p>Get E-mail updates about our latest shop and special offers.</p>
                        <form action="#">
                            <input type="text" placeholder="Enter your mail">
                            <button type="submit" class="site-btn">Subscribe</button>
                        </form> -->
					<div class="footer__widget__social">
						<a href="#"><i class="fa fa-facebook"></i></a> <a href="#"><i
							class="fa fa-instagram"></i></a> <a href="#"><i
							class="fa-solid fa-envelope"></i></a>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12">
				<div class="footer__copyright">
					<div class="footer__copyright__text">
						<p>
							<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
							Copyright &copy;
							<script>
								document.write(new Date().getFullYear());
							</script>
							版權所有 copyright © 2022 TEAM LETITGO All Rights Reserved.
							<!--自然改-->
							<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
						</p>
					</div>
					<!-- <div class="footer__copyright__payment"><img src="img/payment-item.png" alt=""></div> -->
				</div>
			</div>
		</div>
	</div>
</footer>
<!-- Footer Section End -->

<!-- Js Plugins -->
<script src="memberupdatehtml/js/jquery-3.3.1.min.js"></script>
<script src="memberupdatehtml/js/bootstrap.min.js"></script>
<script src="memberupdatehtml/js/jquery.nice-select.min.js"></script>
<script src="memberupdatehtml/js/jquery-ui.min.js"></script>
<script src="memberupdatehtml/js/jquery.slicknav.js"></script>
<script src="memberupdatehtml/js/mixitup.min.js"></script>
<script src="memberupdatehtml/js/owl.carousel.min.js"></script>
<script src="memberupdatehtml/js/main.js"></script>
</body>
</html>