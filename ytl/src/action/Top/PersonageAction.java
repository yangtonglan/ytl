package action.Top;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;

import com.opensymphony.xwork2.ActionSupport;

import Entity.User;
import service.UserService;

public class PersonageAction extends ActionSupport{
    private User user;
    private UserService userService;//调用
   
    //显示个人信息
    public String getUsers() {
    	HttpSession session = ServletActionContext.getRequest().getSession();
    	//从struts2的session里取出当前对象（在登录action里存入）
    	user = (User) session.getAttribute("user");
    	System.out.println(user.getId());
    		return "suc";
    	
    }
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
}
