<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <script src="http://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js"></script>
<title>商品管理</title>
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
			 <caption><h3>商品库存</h3></caption>
       <thead>
         <tr>
	          <th>序号</th>
	          <th>商品名称</th>
	          <th>商品单价</th>
	          <th>商品存货</th>
	          <th>商品小计</th>
	          <th >操作</th>
         </tr>
       </thead>
       
          <tbody>
               <c:forEach items="${list}" var="shangpin">
           <tr>
              <td class="ShangpinId">${shangpin.id }</td>
	          <td>${shangpin.name } </td>
	          <td>${shangpin.price}</td>
	          <td>${shangpin.count }</td>
	          <td>${shangpin.total }</td>
	          
	          <td><a href="javascript:void(0);"class="updateShangpin">修改</a></td>
           </tr>
               </c:forEach>
          </tbody>
      </table>
      <br>
     <input type="button" value="上一页">
     <input type="button" value="下一页">
     <!-- 修改商品信息 -->
<script type="text/javascript">
$(document).ready(function(){
	$(".updateShangpin").click(function(){
		var i =$(".updateShangpin").index(this);
		var ShangpinId=$(".ShangpinId").eq(i).html();
		console.log("下标："+i+"id为："+ShangpinId);
		$.ajax({
			type:"POST",
			url:"xianshishangpin",
			data:{
				shangpinId:ShangpinId
			},
			success:function(){
				window.location.href="main/add/altershangpin.jsp";
			}
		})
		
	})
})
</script>
</body>
</html>