package action.Top;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import Entity.User;
import service.UserService;

public class AlterUserAction {
	  private  UserService userService;
	  private User user;//获得前台User
	  //修改个人资料
		public String alter1() {
			System.out.println();
			HttpSession session = ServletActionContext.getRequest().getSession();
        	//从struts2的session里取出当前对象（在登录action里存入）
            User user1 = (User) session.getAttribute("user");
            if (user1!=null) {
				user1.setUserEmail(user.getUserEmail());
				user1.setUserName(user.getUserName());
				user1.setUserPassword(user.getUserPassword());
				user1.setUserPhone(user.getUserPhone());
				user1.setUserPosition(user.getUserPosition());
			}
			userService.update(user1);
			return "suc";
		}
		public UserService getUserService() {
			return userService;
		}
		public void setUserService(UserService userService) {
			this.userService = userService;
		}
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		
}
