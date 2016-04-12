<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="bean.UserBean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" href="css/styles.css" rel="stylesheet"/>
<link type="text/css" href="css/bootstrap-theme.min.css" rel="stylesheet"/>
<link type="text/css" href="css/bootstrap.min.css" rel="stylesheet"/>
<link type="text/css" href="css/header.css" rel="stylesheet"/>
<link type="text/css" href="css/dropdown-menu.css" rel="stylesheet"/>
<script type="text/javascript" src="js/jquery/jquery.min.js"></script>
<script type="text/javascript" src="js/main.js"></script>
<script language="JavaScript">
function scroll(){

    // show hide subnav depending on scroll direction
    var position = $(window).scrollTop();
    $(window).scroll(function () {
        var scroll = $(window).scrollTop();
        idImg = document.getElementById("img-header");
        idTxt = document.getElementById("txt-header");
        classMenu = document.getElementsByClassName("header-menu");
        if (scroll > position) {
			idImg.style.width = '40%';
			idImg.style.height = '40%';
			idImg.style.marginTop = '0px';
			idImg.style.marginBottom = '0px';
			$("#txt-header").empty();
			$("#menu-bar").removeClass("header-menu");
			$("#menu-bar").addClass("header-menu-scroll");
			$("#sub-menu").removeClass("dropdown-content");
			$("#sub-menu").addClass("dropdown-content-scroll");
        }
        else{
        	idImg.style.marginTop = '20px';
        	idImg.style.marginBottom = '20px';
        	idImg.style.width = '70%';
			idImg.style.height = '70%';
			idTxt.innerText = 'CẦM ĐỒ UY TÍN IT';
			idTxt.style.fontSize = '60px';
			$("#menu-bar").removeClass("header-menu-scroll");
			$("#menu-bar").addClass("header-menu");
			$("#sub-menu").removeClass("dropdown-content-scroll");
			$("#sub-menu").addClass("dropdown-content");
        }
        position = scroll;
    });

};
</script>
<title>Home page</title>
</head>
<body onload="scroll();">
<form action="<%= request.getContextPath() %>/ClientHomePage" method="post" name="header">
	<div id="header">
		<div class="row">
			<div class="col-md-1 col-md-offset-1">
				<img id="img-header" src="imgHeader/2000px-Soccer_ball.svg.png" >
			</div>
			<div class = "col-md-10">
				<div class="row">
					<div  class="col-md-8 textCenter" style="margin-left: 50px;">
						<p id="txt-header">CẦM ĐỒ UY TÍN IT</p>
					</div>
				<%	UserBean userBean = (UserBean)session.getAttribute("SessionUser");
					if(userBean == null){
				%>
					<div class="col-md-2 link-login" style="margin-right: 30px;">
						<ul>
							<li><a  href="Login.jsp">Đăng nhập</a></li>
						</ul>
					</div>
					<%
					}
					else {
						%>
					<div class="col-md-3 link-login">
						<div class="col-md-6">
							<a class="btn-header" style="color:#9DDA96;" href="#"><%=userBean.getUsername()%></a>
						</div>
						<div class="col-md-6 "><a class="btn-header" style="color: #9DDA96;" href="<%=request.getContextPath() %>/LogoutController">Đăng xuất</a></div>
					</div>
					<%} %>
				</div>
				
				<%	
					if(userBean == null){
				%>
				<!-- Menu client -->
				<div id="menu-bar" class="row header-menu textCenter" style="margin-left: -200px;">
					<ul>
						<li><a class="btn btn-display btn-type btn-header" href="#" >Trang chủ</a>
						<li class="dropdown btn btn-display btn-type btn-header">
							<span>Rao bán</span>
							<ul id="sub-menu" class="dropdown-content" >
								<li><a href="#">Xe máy, ô tô</a></li>
								<li><a href="#">Điện thoại</a></li>
								<li><a href="#">Lap top</a></li>
								<li><a href="#">Vàng</a></li>
								<li><a href="#">Trang sức</a></li>
								<li><a href="#">Khác</a></li>
							</ul>
						</li>
						<li><a class="btn btn-display btn-type btn-header" href="#" >Quy định</a>
						<li><a class="btn btn-display btn-type btn-header" href="#" >Liên hệ</a>
					</ul>
				</div>
				<%	}
					else if(userBean.getDecentralization() == 1){
							%>
							
				
				<!-- Menu admin -->
				<div id="menu-bar" class="row header-menu textCenter" style="margin-left: -200px;">
					<ul>
						<li><a class="btn btn-display btn-type btn-header" href="#" >Trang chủ</a>
						<li class="dropdown btn btn-display btn-type btn-header">
							<span>Rao bán</span>
							<ul id="sub-menu" class="dropdown-content" >
								<li><a href="#">Xe máy, ô tô</a></li>
								<li><a href="#">Điện thoại</a></li>
								<li><a href="#">Lap top</a></li>
								<li><a href="#">Vàng</a></li>
								<li><a href="#">Trang sức</a></li>
								<li><a href="#">Khác</a></li>
							</ul>
						</li>
						<li class="dropdown btn btn-display btn-type btn-header">
							<span>Sản phẩm</span>
							<ul id="sub-menu" class="dropdown-content" >
								<li><a href="#">Phản hồi</a></li>
								<li><a href="#">Danh sách sản phẩm</a></li>
							</ul>
						</li>
						<li class="dropdown btn btn-display btn-type btn-header">
							<span>Người dùng</span>
							<ul id="sub-menu" class="dropdown-content" >
								<li><a href="#">Tạo tài khoản</a></li>
								<li><a href="#">Danh sách người dùng</a></li>
							</ul>
						</li>
						<li class="dropdown btn btn-display btn-type btn-header">
							<span>Hợp đồng</span>
							<ul id="sub-menu" class="dropdown-content" >
								<li><a href="#">Tạo tài khoản</a></li>
								<li><a href="#">Danh sách hợp đồng</a></li>
							</ul>
						</li>
						<li><a class="btn btn-display btn-type btn-header" href="#" >Đặt mua</a>
						<li><a class="btn btn-display btn-type btn-header" href="#" >Quy định</a>
						<li><a class="btn btn-display btn-type btn-header" href="#" >Liên hệ</a>
					</ul>
				</div>		
				<% 						
						}
						else if(userBean.getDecentralization() == 0){
						%>
				<!-- Menu user -->	
				<div id="menu-bar" class="row header-menu textCenter" style="margin-left: -50px;">
					<ul>
						<li><a class="btn btn-display btn-type btn-header" href="#" >Trang chủ</a>
						<li class="dropdown btn btn-display btn-type btn-header">
							<span>Rao bán</span>
							<ul id="sub-menu" class="dropdown-content" >
								<li><a href="#">Xe máy, ô tô</a></li>
								<li><a href="#">Điện thoại</a></li>
								<li><a href="#">Lap top</a></li>
								<li><a href="#">Vàng</a></li>
								<li><a href="#">Trang sức</a></li>
								<li><a href="#">Khác</a></li>
							</ul>
						</li>
						<li><a class="btn btn-display btn-type btn-header" href="#" >Quan ly san pham</a>
						<li><a class="btn btn-display btn-type btn-header" href="#" >Gia hạn</a>
						<li><a class="btn btn-display btn-type btn-header" href="#" >Hợp đồng</a>
						<li><a class="btn btn-display btn-type btn-header" href="#" >Phan hoi</a>
						<li><a class="btn btn-display btn-type btn-header" href="#" >Quy định</a>
						<li><a class="btn btn-display btn-type btn-header" href="#" >Liên hệ</a>
					</ul>
				</div>	
				<%
						}
				%>
				
			</div>
			
		</div>
	</div>
</form>
</body>
</html>