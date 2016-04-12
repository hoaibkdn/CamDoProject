<%@page import="bean.ProductBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List</title>
<link type="text/css" href="css/header.css" rel="stylesheet"/>
<link type="text/css" href="css/boostrap.min.css" rel="stylesheet"/>
<link type="text/css" href="css/boostrap-theme.min.css" rel="stylesheet"/>
</head>
<body>
<%@include file="/Header.jsp"%>
<form action="<%= request.getContextPath() %>/ProductList">
<div class="container" style="margin-top: 300px; margin-right: 40px;">
	<div class="col-md-8 nav-main borderHomePage" style="padding-bottom: 50px;">
		<div class="row nav-title">Dien thoai</div>
		<%
			ArrayList<ProductBean> productTypeLst = new ArrayList();
		productTypeLst = (ArrayList<ProductBean>)request.getAttribute("productTypeLst");
		for(ProductBean product : productTypeLst){
			%>
			<div class="row post">
				<div class="col-md-4">
					<img class="img-responsive post-img" src="img/w1.jpg">
				</div>
				<div class="col-md-8 post-content">
					<a href="#"><%=product.getNameProduct() %></a>
					<p><%=product.getDescription() %></p>
					<p><%=product.getPrice() %></p>
					<a href="#">
						<button type="button" class="btn btn-primary">Chi tiet</button>
					</a>
					<a class="btn btn-primary" 
						href="<%= request.getContextPath() %>/BookProductController?idProduct=<%=product.getIdProduct()%>">Mua
					</a>
				<% }
				%>
				</div>
		</div>
	</div>
	
	<div class="col-md-3 borderHomePage" style="margin-left: 20px;">
			
			<!-- search -->
			<div class = "row">
				<div class = "col-md-8" style="margin-bottom: 30px;">
					<input class="form-control" type="text" name = "searchText" >
					
				</div>
				<div class = "col-md-3">
					<input class="btn-search" type="submit" value ="Tìm kiếm" name ="searchBtn">
				</div>
			</div>
			
			<!-- newest products -->
			<div class="row">
			<div class="col-sm-11 border-box" style="margin-bottom: 30px; margin-left: 12px;">
			
				<div class="title">
					<p>Sản phẩm mới nhất</p>
				</div>
				<div class="list" style="margin: 10px 10px 10px 10px; padding: 20px 20px 20px 20px;">
				<% ArrayList<ProductBean> productLst = new ArrayList<ProductBean>();
					if(request.getAttribute("productLst") != null){
					productLst = (ArrayList<ProductBean>)request.getAttribute("productLst");
					if(productLst.isEmpty()){
						%>
						<p class="btn-header" style="color: red;">Không có sản phẩm cần tìm</p>
						<%
					}
					else{
						for(int i = 0; i < productLst.size(); i++ ){
					%>
						<a class="btn-header" href="#"><%= productLst.get(i).getNameProduct()%></a>
						<br>
				  <%} 
					}
				  }%>
				</div>
			</div>
			</div> 
			
		</div>
</div>
</form>
</body>
</html>