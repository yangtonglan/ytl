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
		<form class="form" action="addproject" method="post"  target="_parent">
			 
			  <p>
			    <span >项目名称:</span>
				<input type="text" name="project.name" class="auth" /> 
			  </p>
		     
		      <p>
		        <span >项目进度:</span>
		       <input type="text" name="project.jingdu" class="auth" />
		      </p>
			
	          <p>
	           <span >项目评估:</span>
		    	 <input type="text"  name="project.evaluate" class="auth" />	 
		      </p>
		 
			  <p>
			    <input type="submit" value="提交" onclick="save();" 
			    style="margin-left:120px ;margin-top: 20px;"/>
			  </p>
		
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