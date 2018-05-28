<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员信息</title>
  <style>
			body{background:url(images/ti2.jpg);}
			table{
			 border: 1px red solid;	
			 width: 1120px; height:440 ;
			 padding-left: 10px;
			 border-collapse: collapse;
			}
			td{ 
				border: 1px black solid;	
				
				border: 1px teal papayawhip;
			}
			th{
				border: 1px black solid;	
				background-color: #89E8F3;
				border: 1px teal papayawhip;
			}
		</style>
</head>

<body>
      <table >
			 <caption><h3>员工信息</h3></caption>
       <thead>
         <tr>
	          <th>序号</th>
	          <th>用户名</th>
	          <th>密码</th>
	          <th>电话</th>
	          <th>邮箱</th>
	          <th>职位</th>
         </tr>
       </thead>
       
          <tbody>
               <c:forEach items="${list}" var="user">
           <tr>
              <td>${user.id }</td>
	          <td>${user.userName } </td>
	          <td>${user.userPassword }</td>
	          <td>${user.userPhone }</td>
	          <td>${user.userEmail}</td>
	          <td>${user.userPosition }</td>
           </tr>
               </c:forEach>
          </tbody>
      </table>
      <br>
     <input type="button" value="上一页">
     <input type="button" value="下一页">
</body>
</html>