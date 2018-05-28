<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>密码修改</title>
		<link rel="stylesheet" href="../css/style-core.css" />
		<link rel="stylesheet" href="../css/style-login.css" />
</head>
<body>
    <script>
	 
		function save(){ 
		document.form2.action="pas";
		document.form2.submit();
		alert("确定修改！");
		}
		
	</script>
     
		<div class="box">
			<form class="log-for" name="form2" method="post" target="_parent">
				<select>
					<option value="1">经理</option>
					<option value="1">主管</option>
					<option value="1">组长</option>
					<option value="1">员工</option>
					
				</select>
				  <!-- 获得登录用户的id -->
				<input type="text" name="id" style="display: none;" value="${user.id }"/>
				<input type="text" id="password1" name="userName" placeholder="请输入要修改的六位数密码"/>
				<input type="text" id="password2" name="password" placeholder="请再次确认密码"/>
				<input type="button" value="修改密码" onclick="save();"/>
			</form>
		</div>
	</body>
	
	<script>
		
	</script>
</html>