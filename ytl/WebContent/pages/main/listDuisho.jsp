<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>竞争对手详情</title>
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
			 <caption><h3>竞争对手详情</h3></caption>
       <thead>
         <tr>
	          <th>序号</th>
	          <th>公司名称</th>
	          <th>竞争产品</th>
	          <th>竞争状态</th>
	          <th>竞争描述</th>
	          <th colspan="2">操作</th>
         </tr>
       </thead>
       
          <tbody>
               <c:forEach items="${list}" var="duisho">
           <tr>
              <td>${duisho.id }</td>
	          <td>${duisho.companyName } </td>
	          <td>${duisho.product }</td>
	          <td>${duisho.state }</td>
	          <td>${duisho.describe }</td>
	          <td>修改</td>
	          <td>删除</td> 
           </tr>
               </c:forEach>
          </tbody>
      </table>
      <br>
     <input type="button" value="上一页">
     <input type="button" value="下一页">
</body>
</html>