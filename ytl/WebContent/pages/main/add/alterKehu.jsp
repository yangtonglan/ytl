<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改客户！</title>
     <style>
			*{font-family: "微软雅黑";}
			.error{
				color: red;
				font-weight: bold;
				display: none;
			}
			body{
                background:url(../../images/ti2.jpg);
				background-size: 100%;
				background-repeat: no-repeat;
			}
			.form{
				margin-left: 256px;
				margin-top: 40px;
			}
			.form p input{
				margin-right: 15px;
			}
			
		</style>
</head>
<body>
     <div class="div2" style="margin-left: 250px;margin-top: 140px"><h3>请输入修改注册信息！</h3></div>
	  <div class="div1">
		<form class="form" action="alterkehu" method="post"  target="_parent">
			 <input type="hidden" value="${kehu1.id}" name="kehu.id">
			  <p>
			    <span >客户名称:</span>
				<input type="text" name="kehu.kehuName" value="${kehu1.kehuName }" /> 
			  </p>
		     
		      <p>
		        <span >客户电话:</span>
		       <input type="text" name="kehu.kehuPhone" value="${kehu1.kehuPhone }"/>
		      </p>
			
	          <p>
	           <span >所属行业:</span>
		    	 <input type="text"  name="kehu.kehuTrade" value="${kehu1.kehuTrade }"/>	 
		      </p>
		      
		      <p>
		        <span >客户来源:</span>
		    	<input type="text"  name="kehu.kehusource" value="${kehu1.kehusource }"/>
		       </p>

		      <p>
		       <span >客户等级:</span>
		    	<input type="text"  name="kehu.kehuGrade" value="${kehu1.kehuGrade }"/>  
		       </p>
			
			  <p>
			    <input type="submit" value="提交" onclick="save()"  style="margin-left:120px;margin-top: 20px;"/>
			  </p>
		
		</form>
		</div>
		
		   <script src="http://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js"></script>
    <script>
        $(document).ready(function(){
	        $("form").submit(function(){
            alert("修改成功！");
            });
         });
      </script>
</body>
</html>