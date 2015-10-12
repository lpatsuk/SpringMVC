<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>eshop7_leanid Home</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link rel="stylesheet" href="/eshop_spring_mvc/styles/eshop.css"/> 

</head>

<body id="homePageBody"> 
	
	<div class="container">
		<%@include file="Header.jsp" %>
	
		<h2 id="mainHeading">Welcome to eShop</h2>
		
			<table id="allProducts" class="table"> 
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Type</th>
					<th>Price</th>
					<th></th>
				</tr>
				<c:forEach items="${AllProducts}" var="product">
					<tr>
						<td>${product.id}</td>
						<td>${product.name}</td>
						<td>${product.type}</td>
						<td>${product.price}</td>
						
						
						<td><a href="<c:url value='/cart?productId=${product.id}'/>"><img src="<c:url value='/images/cart.png'/>" id="cart">Add to cart</a></td>
					</tr>	
				</c:forEach>
			</table>
			
			<div class="row"></div>
				<div class="col-xs-4">
					<h2 class="text-center">Current Deals</h2>
					<ul>
						<li>Diet coke for $.50</li>
						<li>iPad for $299.00</li>
					</ul>
				</div>
				<div class="col-xs-5" >
					<h2 class="text-center">Contact us</h2>
				</div>
				<div class="col-xs-3">
					<h2 class="text-center">Coupons</h2>
				</div>
			</div>
	</div>
	
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>	
</body>
</html>