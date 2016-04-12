<%@page import="bean.ProductBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" href="css/login.css" rel="stylesheet"/>
<title>Dat mua</title>

</head>
<body>
<%@include file="/Header.jsp"%>
<%
	ProductBean objProduct = (ProductBean)request.getAttribute("objProduct");
%>
<div class="container" style="margin-top: 300px; margin-right: 40px;">
	<div class="col-md-8">
		<div class="panel panel-info">
			<div class="panel-heading" style="text-align:center;">Dat mua</div>
			<div class="panel-body">
				<form class="form-horizontal" action="" name="bookProduct" method="get">
					<p class="red-title">1. Thong tin khach hang:</p>
					<div class="form-group">
						<label class="col-sm-3 control-label" name="hoten">Ho va ten</label>
							<div class="col-sm-9">
								<input type="text" class="form-control" name = "nameClientTxt">
							</div>
					</div>
					<div class="form-group">
						<label class="col-sm-3 control-label" name="address">Dia chi</label>
							<div class="col-sm-9">
								<input type="text" class="form-control" name = "addressTxt">
							</div>
					</div>
					<div class="form-group">
						<label class="col-sm-3 control-label" name="sdt">So dien thoai</label>
							<div class="col-sm-9">
								<input type="text" class="form-control" name = "phoneNumberTxt">
							</div>
					</div>
					<div class="form-group">
						<label class="col-sm-3 control-label" name="email">Email</label>
							<div class="col-sm-9">
								<input type="text" class="form-control">
							</div>
					</div>
					<p class="red-title">2. Thong tin san pham:</p>
					<div class="form-group">
						<label class="col-sm-3 control-label" name="tensp">Ten san pham</label>
							<div class="col-sm-9">
								<input type="text" class="form-control" name = "nameProductTxt"
									value="<%=objProduct.getNameProduct()%>" disabled="disabled">
							</div>
					</div>

					<div class="form-group">
						<label class="col-sm-3 control-label" name="comment">Y kien khach hang</label>
							<div class="col-sm-9">
								<textarea class="form-control" rows="5" id="comment" name="ideaClient"></textarea>
							</div>
					</div>
					<input class="btn btn-display" type="submit" value ="Gui" name="submit">
	
					<div><p style="color: black;"><%request.getAttribute("successText"); %></p></div>

				</form>
			</div>
		</div>
	</div>
</div>
</body>
</html>