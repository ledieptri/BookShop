<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<%= request.getContextPath() + "/template/web/css/style.css"%>
<!DOCTYPE html>
<html lang="en">
<head>

<meta charset="UTF-8">
<title>Book Store</title>
</head>
<body>
	<!-- ------------------------------------------------------------------------------------Body-->
	
			<!-- ------------------------------------------Sale----------------------------------- -->
			
			<!-- ------------------------------------------Top_Sell_Book----------------------------------- -->
			<div class="list_product">
				<div class="list_product-info">
					<div class="list_product-info-title">
						<span>SẢN PHẨM</span>
						<form class="sort" action="<c:url value='/home-list'/>"
							method="get" id="sortForm">
							<select name="sortType" id="sortType">
								<option value="desprice">Giá tiền: giảm dần</option>
								<option value="insprice">Giá tiền: tăng dần</option>
							</select>
							<button type="submit">Sắp xếp</button>
						</form>
						<a href="">Xem tất cả</a>
					</div>
					<div class="list_product-info-group">
						<div class="list_product-info-list">
							<c:forEach var="item" items="${listProduct}">
								<a
									href='<c:url value="/product-detail?productId=${item.productId}"></c:url>'
									class="list_product-info-item"> <img
									src='<c:url value="${item.imageId.imageSmall}"/>' alt="Hinh">
									<p class="list_product-info-item-name">${item.productName}</p>

									<p class="list_product-info-item-price">
										<c:set var="p" value="${item.price}" />
										<fmt:setLocale value="vi_VN" />
										<fmt:formatNumber value="${p}" type="currency"
											maxFractionDigits="0" />
									</p>
								</a>
							</c:forEach>
						</div>
					</div>
				</div>
			</div>
			<!--------------------------------------------Top_New_info----------------------------------- -->


		</div>
	</div>
	<script src="<c:url value='/template/web/js/cataloghome.js'/>"></script>
</body>
</html>