<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" href="css/bootstrap.min.css" rel="stylesheet"/>
<script type="text/javascript" src="js/bootstrap.mins.js"></script>
<link type="text/css" href="css/header.css" rel="stylesheet"/>
<link type="text/css" href="css/login.css" rel="stylesheet"/>
<title>Dang nhap</title>
<script type="text/javascript">
	function login() {
		idcardtext = document.Login.idCardTxt.value;
		passtext = document.Login.passwordTxt.value;
		if(idcardtext == "" || passtext == ""){
			alert("số chứng minh nhân dân hoặc mật khẩu không được để trống");
			return false;
		}
		else return true;
	}
</script>
</head>
<body class="body-login">
<form action="<%=request.getContextPath() %>/Login"  method ="post" name = "Login" onsubmit="return login()">
<div id="login" >
	<div class="col-md-4 col-md-offset-4">
		<div class="form-login" >
			<div style="margin-left: 15px;margin-top: 60px;">
				<p>
					<label style="color: black;">Số CMND:
						<br>
						<input class="form-control" type="text" name = "idCardTxt" >
					</label>
				</p>
				<p>
					<label style="color: black;">Mật khẩu:
						<br>
						<input class="form-control" type="text" name = "passwordTxt">
					</label>
				</p>
				<p class="textCenter"><input class="btn-login" type="submit" value ="Dang nhap" name ="submit"> </p>
			</div>
		</div>
	</div>
</div> 
</form>
</body>
</html>