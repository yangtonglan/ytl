<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加商品！</title>
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
			.d1 input{
			border:1px solid red;
			margin-left: 180px;
			}
		</style>
</head>
<body>
       <div class="div2" style="margin-left: 250px;margin-top: 140px"><h3>请输入修改注册信息！</h3></div>
	  <div class="div1">
		<form class="form" action="addshangpin" method="post"  target="_parent">
			 
			  <p>
			    <span >商品名称:</span>
				<input type="text" name="shangpin.name" class="auth" /> 
			  </p>
		     
		      <p>
		        <span >商品价格:</span>
		       <input type="text" name="shangpin.price" class="auth" />
		      </p>
			
	          <p>
	           <span >商品数量:</span>
		    	 <input type="text"  name="shangpin.count" class="auth" />	 
		      </p>
		      
		      <p>
		        <span >商品总计:</span>
		    	<input type="text"  name="shangpin.total" class="auth"/>
		       </p>
	          <div class="d1">
			    <input  type="submit" value="提交" />
			  </div>
		
		</form>
		</div>
		
		   <script src="http://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js"></script>
    <script>
        $(document).ready(function(){
	        $("form").submit(function(){
            alert("添加成功！");
            });
         });
      </script>
	     	
</body>
</html>