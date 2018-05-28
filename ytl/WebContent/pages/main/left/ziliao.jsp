<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>上传资料</title>
       <style type="text/css">
		  body{background:url(../../images/ti2.jpg);}
		legend{padding-top: 100px;}
		input{color: red;}
		</style>
</head>
<body>
        
     <fieldset> 
        <h2>上传文件命名格式，文件名加负责人名</h2> 
		<legend>文件上传</legend>  
		<form action="ziliao" enctype="multipart/form-data" method="post" target="_parent">  
		<input type="file" name="UpImg">  
		<input type="submit" value="上传" >  
		</form>  
      </fieldset>      
      <script src="http://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js"></script>
    <script>
        $(document).ready(function(){
	        $("form").submit(function(){
            alert("上传成功！");
            });
         });
      </script>
</body>
</html>