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
<div class="container" style="margin-top: 300px;">
	<div class="row ">
		<div class="col-md-8 borderHomePage">
			<div class="border-component img-background">
				<img class="img-responsive " src="imgHeader/2000px-Soccer_ball.svg.png">
				<div class="center-align type-background">
					<h2><strong>Xe máy</strong></h2>
				</div>
			</div>
			<div class="border-component img-background">
				<img class="img-responsive " src="imgHeader/2000px-Soccer_ball.svg.png">
				<div class="center-align type-background">
					<h2><strong>Xe máy</strong></h2>
				</div>
			</div>
			<div class="border-component img-background">
				<img class="img-responsive " src="imgHeader/2000px-Soccer_ball.svg.png">
				<div class="center-align type-background">
					<h2><strong>Đồ điện tử</strong></h2>
				</div>
			</div>
			<div class="border-component img-background">
				<img class="img-responsive " src="imgHeader/2000px-Soccer_ball.svg.png">
				<div class="center-align type-background">
					<h2><strong>Vàng</strong></h2>
				</div>
			</div>
			<div class="border-component img-background">
				<img class="img-responsive " src="imgHeader/2000px-Soccer_ball.svg.png">
				<div class="center-align type-background">
					<h2><strong>Trang sức</strong></h2>
				</div>
			</div>
			<div class="border-component img-background">
				<img class="img-responsive " src="imgHeader/2000px-Soccer_ball.svg.png">
				<div class="center-align type-background">
					<h2><strong>Khác</strong></h2>
				</div>
			</div>
		</div>
		<div class="col-md-3 borderHomePage" style="margin-left: 20px;">
			<div class = "row">
				<div class = "col-md-8">
					<input class="form-control" id="inputdefault" type="text" >
				</div>
				<div class = "col-md-4">
					<input class="btn btn-display" 
						style="margin-right: 20px; color: white; margin-bottom: 30px;" 
						type="button" value ="Tìm kiếm" name ="submit">
				</div>
			</div>
			<div class="row border-box" style="margin-bottom: 30px;">
				<div class="title">
					<p>Sản phẩm mới nhất</p>
				</div>
				<div style="margin: 10px 10px 10px 10px;">
					aaaaaaaaaaa
				</div>
			</div>
		</div>
		
		
	</div>
</div>
	
</form>
</body>
</html>