<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="bean.NguoiDungBean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" href="css/styles.css" rel="stylesheet"/>
<link type="text/css" href="css/bootstrap-theme.min.css" rel="stylesheet"/>
<link type="text/css" href="css/bootstrap.min.css" rel="stylesheet"/>
<link type="text/css" href="css/header.css" rel="stylesheet"/>
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
			idImg.style.width = '20%';
			idImg.style.height = '20%';
			idImg.style.marginTop = '0px';
			idImg.style.marginBottom = '0px';
			$("#txt-header").empty();
			$("#menu-bar").removeClass("header-menu");
			$("#menu-bar").addClass("header-menu-scroll");
        }
        else{
        	idImg.style.width = '70%';
			idImg.style.height = '70%';
			idTxt.innerText = 'CẦM ĐỒ UY TÍN IT';
			idTxt.style.fontSize = '60px';
			$("#menu-bar").addClass("header-menu");
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
			<div class = "col-md-9">
				<div class="row">
					<div  class="col-md-10 textCenter">
						<p id="txt-header">CẦM ĐỒ UY TÍN IT</p>
					</div>
				<%	NguoiDungBean userBean = (NguoiDungBean)session.getAttribute("SessionUser");
					if(userBean == null){
				%>
					<div class="col-md-2 link-login">
						<ul>
							<li><a href="Login.jsp">Đăng nhập</a></li>
						</ul>
					</div>
				</div>
				
				<!-- Menu client -->
				<div id="menu-bar" class="row header-menu textCenter">
					<ul>
						<li><a class="btn btn-display btn-type btn-header" href="#" >Trang chủ</a>
						<li>
							<span class="dropdown btn btn-display btn-type btn-header" >Rao bán</span>
							<ul class="sub-menu">
								<li>Xe máy</li>
								<li>Xe máy</li>
							</ul>
						</li>
						<li><a class="btn btn-display btn-type btn-header" href="#" >Quy định</a>
						<li><a class="btn btn-display btn-type btn-header" href="#" >Liên hệ</a>
					</ul>
				</div>
				<%	}
					else if(userBean.getPhanQuyen() == 1){
							%>
							
				
				<!-- Menu admin -->
				<div class="col-md-2 link-login">
						<ul>
							<li><a href="#">Đăng xuất</a></li>
						</ul>
				</div>
				<div id="menu-bar" class="row header-menu textCenter">
					<ul>
						<li><a class="btn btn-display btn-type btn-header" href="#" >Trang chủ</a>
						<li><a class="btn btn-display btn-type btn-header" href="#" >Rao bán</a>
						<li><a class="btn btn-display btn-type btn-header" href="#" >Quan ly san pham</a>
						<li><a class="btn btn-display btn-type btn-header" href="#" >Quan ly hop dong</a>
						<li><a class="btn btn-display btn-type btn-header" href="#" >Phan hoi</a>
						<li><a class="btn btn-display btn-type btn-header" href="#" >Quy định</a>
						<li><a class="btn btn-display btn-type btn-header" href="#" >Liên hệ</a>
					</ul>
				</div>		
				<% 						
						}
						else if(userBean.getPhanQuyen() == 0){
						%>
				<!-- Menu user -->	
				<div id="menu-bar" class="row header-menu textCenter">
					<ul>
						<li><a class="btn btn-display btn-type btn-header" href="#" >Trang chủ</a>
						<li><a class="btn btn-display btn-type btn-header" href="#" >Rao bán</a>
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