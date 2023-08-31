<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!-- ----------------------------------------------------------------------------------Header -->
<link href="../../template/web/css/style.css" rel="stylesheet"
	type="text/css" />
<!-- ----------------------------------------------------------------------------Header-Banner-->
<div class="header">
	<!-- --------------------------------------------------------------------------Header-Top-Bar-->
	<div class="top-bar">
		<div class="top-bar__container">
			<div class="top-bar__container-wrap">
				<a
					href='<c:url value="/all-product-by-category?categoryId=1"></c:url>'
					class="top-bar__container-wrap-link"> <span>Hành động</span>
				</a> <a
					href='<c:url value="/all-product-by-category?categoryId=2"></c:url>'
					class="top-bar__container-wrap-link"> <span>Tiểu thuyết</span>
				</a> <a
					href='<c:url value="/all-product-by-category?categoryId=3"></c:url>'
					class="top-bar__container-wrap-link"> <span>Tình cảm</span>
				</a>
			</div>

		</div>
	</div>




	<!-- -------------------------------------------------------------------------Header-Masthead-->
	<div class="masthead">
		<div class="masthead__container">
			<div class="masthead__logo">
				<a href="<c:url value='/trang-chu'/>" class="masthead__logo-text">Book
					Store</a> <i class="fas fa-bars masthead__menu-toggle"></i>
			</div>
			<form class="masthead__find"
				action='<c:url value="/all-product-by-brand"></c:url>' method="get">
				<input type="hidden" name="search" value="true"> <input
					type="text" name="keyWord" class="masthead__find-input"
					placeholder="Nhập tên sách... cần tìm">
				<button type="submit" class="masthead__find-btn">
					<i class="fa fa-search"></i> <span>Tìm kiếm</span> <span></span>
				</button>
			</form>
			<div class="masthead__icon">
				<c:if test="${not empty USERMODEL}">
					<a href="<c:url value='/profile'/>" class="masthead__login"> <i
						class="fa fa-user"></i>
						<p class="masthead__login-item">${USERMODEL.fullName}</p></a>
				</c:if>
				<c:if test="${empty USERMODEL}">
					<a href="<c:url value='/dang-nhap?action=login'/>"
						class="masthead__login"> <i class="fa fa-user"></i>
						<p class="masthead__login-item">Đăng nhập</p>
					</a>
				</c:if>
				<a href='<c:url value="/cart"></c:url>' class="masthead__cart">
					<c:if test="${empty sumQuantity}">
						<div class="number">0</div>
					</c:if> <c:if test="${not empty sumQuantity}">
						<div class="number">${sumQuantity}</div>
					</c:if> <i class="fa fa-shopping-cart"></i>
					<p class="masthead__cart-item">Cart</p>
				</a>

			</div>
		</div>
	</div>
</div>