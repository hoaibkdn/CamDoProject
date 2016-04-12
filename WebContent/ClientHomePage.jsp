<%@page import="bean.ProductBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" href="css/login.css" rel="stylesheet"/>
<title>Home page</title>

</head>
<body>
<%@include file="/Header.jsp"%>
<form action="<%= request.getContextPath() %>/ClientHomePage" method="post" name="trangChuClient">
<div class="container" style="margin-top: 300px; margin-right: 40px;">
		<div class="col-md-8 borderHomePage">
			<div><p style="color: black;"><%request.getAttribute("successText"); %></p></div>
			<div class="border-component img-background">
				<a href="<%= request.getContextPath() %>/ProductTypeLstController?idProductType=LSP1">
					<img class="img-responsive " src="imgHeader/2000px-Soccer_ball.svg.png">
				</a>
				<div class="center-align type-background">
					<h2><strong>Xe máy, ô tô</strong></h2>
				</div>
			</div>
			<div class="border-component img-background">
				<a href="<%= request.getContextPath() %>/ProductTypeLstController?idProductType=LSP2">
					<img class="img-responsive " src="imgHeader/2000px-Soccer_ball.svg.png">
				</a>
				<div class="center-align type-background">
					<h2><strong>Điện thoại</strong></h2>
				</div>
			</div>
			<div class="border-component img-background">
				<a href="<%= request.getContextPath() %>/ProductTypeLstController?idProductType=LSP3">
					<img class="img-responsive " src="imgHeader/2000px-Soccer_ball.svg.png">
				</a>
				<div class="center-align type-background">
					<h2><strong>Laptop</strong></h2>
				</div>
			</div>
			<div class="border-component img-background">
				<a href="<%= request.getContextPath() %>/ProductTypeLstController?idProductType=LSP4">
					<img class="img-responsive " src="imgHeader/2000px-Soccer_ball.svg.png">
				</a>
				<div class="center-align type-background">
					<h2><strong>Vàng</strong></h2>
				</div>
			</div>
			<div class="border-component img-background">
				<a href="<%= request.getContextPath() %>/ProductTypeLstController?idProductType=LSP5">
					<img class="img-responsive " src="imgHeader/2000px-Soccer_ball.svg.png">
				</a>
				<div class="center-align type-background">
					<h2><strong>Trang sức</strong></h2>
				</div>
			</div>
			<div class="border-component img-background">
				<a href="<%= request.getContextPath() %>/ProductTypeLstController?idProductType=LSP6">
					<img class="img-responsive " src="imgHeader/2000px-Soccer_ball.svg.png">
				</a>
				<div class="center-align type-background">
					<h2><strong>Khác</strong></h2>
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
<%@include file="/footer.jsp"%>
</body>
</html>