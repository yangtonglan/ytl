<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人资料</title>
    <style>
			table{
				width: 500px;
				height: 250px;
				padding-left:220px;
				padding-top: 10px;
			}
			td{ 
				
			}
			h3{padding-left: 200px;}
			body{background:url(../images/ti2.jpg);}
		</style>
</head>
<body>
     <table>
			<h3><a href="../main/alterUser.jsp" >修改个人个人资料</a></h3>
			<h3><a href="${pageContext.request.contextPath}/pages/top/password.jsp" >修改密码</a></h3>
			<div width="30px" heigth="30px" ></div>
			 <tr>
			 	<td>用户名： </td>
			 	<td>${user.userName} </td>
			 </tr>
			 <tr>
			 	<td> 密码：</td>
			 	<td> ${user.userPassword}</td>
			 </tr>
			 <tr>
			 	<td> 电话：</td>
			 	<td> ${user.userPhone}</td>
			 </tr>
			 <tr>
			 	<td> 邮箱：</td>
			 	<td>${user.userEmail} </td>
			 </tr>
			 <tr>
			 	<td> 职位:</td>
			 	<td> ${user.userPosition}</td>
			 </tr>
		</table>
		
</body>
</html>