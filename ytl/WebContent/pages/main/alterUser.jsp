<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改个人资料</title>
<style>
			*{font-family: "微软雅黑";}
			.error{
				color: red;
				font-weight: bold;
				display: none;
			}
			body{
                background:url(../images/ti2.jpg);
				background-size: 100%;
				background-repeat: no-repeat;
			}
			.form1{
				margin-left: 256px;
				margin-top: 40px;
			}
			.form1 p input{
				margin-right: 15px;
			}
			
		</style>
			
</head>
<body>
     <div class="div2" style="margin-left: 250px;margin-top: 140px"><h3>请输入你修改的信息！</h3></div>
	  <div class="div1">
		<form class="form1" action="alter" method="post" target="_parent"> <!-- 在父窗口打开 -->
			 
			<p>  
				<input type="text" id="username" name="user.userName" class="auth" value="${user.userName }">  用户名</>
			    <span class="error">用户名至少两位！</span>                                <!-- 显示用户名 -->
			 </p>
		     
		    <p style="display: none;">
		    	 <input type="password" id="password" name="user.userPassword" class="auth"  value="${user.userPassword }">密码</>
		         <span class="error">密码至少六位！</span>
		    </p>
			
	         <p>
		    	 <input type="text" id="职位" name="user.userPosition" class="auth" value="${user.userPosition }">职位</>
		    </p>
			
	
		    <p>
		    	<input type="text" id="email" name="user.userEmail" class="auth" value="${user.userEmail }">邮箱</>
		         <span class="error">邮箱格式不正确！</span>
		    </p>
			
			
		    <p>
		    	<input type="text" id="phone" name="user.userPhone" class="auth" maxlength="11" value="${user.userPhone }">手机号</>
		         <span class="error">  手机号不正确！</span>
		    </p>
			
			<p><input type="submit" value="提交"  style="margin-left:120px ;margin-top: 20px;" onclick="save();" /></p>
		
		</form>
		
		
		</div>
		
		<script type="text/javascript" src="${pageContext.request.contextPath}/pages/js/jquery-3.2.1.js" ></script>
		<script>
			$(".auth").data({'s':0});
		    $("input[id=username]").blur(function(){
		    	val=this.value;
		    	
		    	if(val.length<2){
		    		$(this).data({"s":1});
		    		$(this).next().show();
		    	}else{
		    			$(this).data({"s":0});
		    		$(this).next().hide();
		    	}
		    });
		    
		    $("input[id=password]").blur(function(){
		    	val=this.value;
		    	if(val.length<6){
		    			$(this).data({"s":1});
		    		$(this).next().show();
		    	}else{
		    			$(this).data({"s":0});
		    		$(this).next().hide();
		    	}
		    });
		    
		    $("input[id=email]").blur(function(){
		    	val=this.value;
		    	if(!val.match(/^\w+@\w+\.\w+$/i)){
		    			$(this).data({"s":1});
		    		$(this).next().show();
		    	}else{
		    			$(this).data({"s":0});
		    		$(this).next().hide();
		    	}
		    });
		    
		    $("input[id=phone]").blur(function(){
		    	val=this.value;
		    	if(!val.match(/^1\d{10}$/)){
		    			$(this).data({"s":1});
		    		$(this).next().show();
		    	}else{
		    			$(this).data({"s":0});
		    		$(this).next().hide();
		    	}
		    });
		    
		   $("form").submit(function(){
		    	$(".auth").blur();
		    	sum=0;
		    	$(".auth").each(function(){
		    		sum+=$(this).data("s");
		    	});
		    	if(sum!=0){
		    		return false;
		    	}
		    	else{
		    		alert("修改个人资料成功！");
		    	}

		    });   
		   
		    
		</script>
</body>
</html>