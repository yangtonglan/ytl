<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单管理</title>
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
			 <caption><h3>订单管理</h3></caption>
       <thead>
         <tr>
	          <th>序号</th>
	          <th>产品名称</th>
	          <th>产品类型</th>
	          <th>数量</th>
	          <th>单价</th>
	          <th>小计</th>
	          <th >操作</th>
         </tr>
       </thead>
       
          <tbody>
               <c:forEach items="${list}" var="dingdan">
           <tr>
              <td>${dingdan.id }</td>
	          <td>${dingdan.name } </td>
	          <td>${dingdan.type}</td>
	           <td>${dingdan.count}</td>
	          <td>${dingdan.price }</td>
	          <td>${dingdan.total }</td>
	          <td>修改</td>
           </tr>
               </c:forEach>
          </tbody>
      </table>
      <br>
     <input type="button" value="上一页">
     <input type="button" value="下一页">
</body>
</html>