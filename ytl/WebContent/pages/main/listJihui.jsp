<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>销售概率查看</title>
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
			 <caption><h3>销售概率查看</h3></caption>
       <thead>
         <tr>
	          <th>序号</th>
	          <th>产品名称</th>
	          <th>销售概率</th>
	          <th>销售负责人</th>
	          
	          <th colspan="2">操作</th>
         </tr>
       </thead>
       
          <tbody>
               <c:forEach items="${list}" var="jihui">
           <tr>
              <td>${jihui.id }</td>
              <td>${jihui.name }</td>
	          <td>${jihui.gailv } </td>
	          
	          <td> <c:forEach items="${jihui.user }" var="user">
	              ${user.userName}
	          </c:forEach>
	          </td>
	          
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