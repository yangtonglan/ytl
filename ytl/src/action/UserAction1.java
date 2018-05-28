package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import Entity.Kehu;
import Entity.User;
import service.UserService;

public class UserAction1 extends ActionSupport{
	
	  private  UserService userService;
	  private User user;//获得前台User
	  private List<User> list;
	//打印User表格
	@Override
	public String execute() throws Exception {
		    list =userService.getUser();
	        return "suc";
	}
	
	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
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
