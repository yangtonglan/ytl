<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="http://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js"></script>
<title>客户管理</title>
  <style>
			body{background:url(images/ti2.jpg);}
			table{
			 text:
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
			 <caption><h3>客户信息</h3></caption>
       <thead>
         <tr>
	          <th>序号</th>
	          <th>客户名称</th>
	          <th>客户电话</th>
	          <th>客户等级</th>
	          <th>客户负责人</th>
	          <th>所属行业</th>
	          <th>客户来源</th>
	          <th >操作</th>
         </tr>
       </thead>
       
          <tbody>
               <c:forEach items="${list}" var="kehu">
           <tr>
              <td class="cusId">${kehu.id }</td>
	          <td>${kehu.kehuName } </td>
	          <td>${kehu.kehuPhone }</td>
	          <td>${kehu.kehuGrade }</td>
	          <td>
	          <c:forEach items="${kehu.user}" var="user">
	          	${user.userName}
	          </c:forEach>
	          </td>
	          <td>${kehu.kehuTrade}</td>
	          <td>${kehu.kehusource}</td>
	          
	          <td><a href="javascript:void(0);"class="updateCus">修改</a></td>
           </tr>
               </c:forEach>	
          </tbody>
      </table>
      <br>
     <input type="button" value="上一页">
     <input type="button" value="下一页">
</body>
  <!-- 修改客户资料 -->
<script type="text/javascript">
$(document).ready(function(){
	$(".updateCus").click(function(){
		var i =$(".updateCus").index(this);
		var cusId=$(".cusId").eq(i).html();
		console.log("下标："+i+cusId);
		$.ajax({
			type:"POST",
			url:"xianshikehu",
			data:{
				kehuId:cusId
			},
			success:function(){
				window.location.href="main/add/alterKehu.jsp";
			}
		})
		
	})
})
</script>
</html>