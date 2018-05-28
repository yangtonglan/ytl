package action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import Entity.User;
import service.UserService;

public class UserAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private User user;
	private UserService userService;
	private String value_1;// 登录姓名
	private String value_2;// 登录密码
	// 注册判断

	public String add() {
		User user1 = userService.getUser(user.getUserName());
		if (user1 == null) {
			userService.addUser(user);
			return "success";
		} else {
			return "error";
		}
	}

	// 注销
	public String logout() {
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.removeAttribute("user");
		return "success";
	}

	// 登录判断
	public String login() {
		System.out.println(value_1 + " : " + value_2);
		User user1 = userService.getUser(value_1);
		if (user1 != null && user1.getUserPassword().equals(value_2)) {
			ServletActionContext.getRequest().getSession().setAttribute("user", user1);
			return "main";
		} else {
			return "error";
		}
	}

	// 删除
	public String delete() {

		return null;
	}

	// 更新
	public String update() {

		return null;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getValue_1() {
		return value_1;
	}

	public void setValue_1(String value_1) {
		this.value_1 = value_1;
	}

	public String getValue_2() {
		return value_2;
	}

	public void setValue_2(String value_2) {
		this.value_2 = value_2;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public UserService getUserService() {
		return userService;
	}

}
