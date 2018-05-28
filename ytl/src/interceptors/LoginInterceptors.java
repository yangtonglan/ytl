package interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import Entity.User;

public class LoginInterceptors implements Interceptor{
    
	private static final long serialVersionUID = 1L;
	public LoginInterceptors() {
	}

	@Override
	public void destroy() {
		
	}

	@Override
	public void init() {
		
	}
     //未登录用户操作拦截
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("拦截器");
		HttpServletRequest request=ServletActionContext.getRequest();//获取请求
		HttpSession session=request.getSession();//获取Session会话
		User user=(User) session.getAttribute("user");//
		if (user!=null) {
			return invocation.invoke();
		}else {
			return "loginPage";
		}
	}


}
