package action.Top;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import Entity.User;
import service.UserService;

public class passwordAction extends ActionSupport{
	    private User user;
	    private UserService userService;//调用
        private String userName;//修改密码
        private String password;//确认密码
        //修改密码
        public String alter() {
        	if(password.equals(userName)) {
        		HttpSession session = ServletActionContext.getRequest().getSession();
            	//从struts2的session里取出当前对象（在登录action里存入）
            	user = (User) session.getAttribute("user");
                user.setUserPassword(password);
        		userService.update(user);
        		return "suc";
        	}else {
        		return "error";
        	}
        	
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
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
}
