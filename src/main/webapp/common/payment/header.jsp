<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<div class="header">

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
	<div class="masthead">
		<div class="masthead__container">
			<div class="masthead__logo">
				<a href="<c:url value='/trang-chu'/>" class="masthead__logo-text">Book
					Store</a> <i class="fas fa-bars masthead__menu-toggle"></i>
			</div>
			<div class="checkout-step">
				<div class="checkout-step-one">
					<div class="checkout-step-name">Đăng nhập</div>
					<div class="checkout-step-icon icon-color">
						<p>1</p>
					</div>
				</div>
				<div class="checkout-step-two">
					<div class="checkout-step-name">Địa chỉ & Thanh toán</div>
					<div class="checkout-step-icon icon-color">
						<p>2</p>
					</div>
				</div>
				<div class="checkout-step-three">
					<div class="checkout-step-name">Đặt hàng thành công</div>
					<div class="checkout-step-icon ">
						<p>3</p>
					</div>
				</div>
			</div>
			<div class="hotline">
				
			</div>

		</div>
	</div>
</div>
