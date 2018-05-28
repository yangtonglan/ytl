package action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import Entity.Kehu;
import Entity.User;
import service.KehuService;
import service.UserService;

public class KehuAction extends ActionSupport{
	
	  private KehuService kehuService;
	  private UserService userService;
	  private  Kehu kehu;
	  private List<Kehu> list;
	  private List<User> list1;
	  private User user;
	  private Kehu kehu1;
	  private int kehuId;
	  
	  
	//将客户资料显示到修改页面
		public String xiaoshikehu (){
		   kehu1= kehuService.getKehuById(kehuId);
		   HttpSession session=ServletActionContext.getRequest().getSession();
		   session.setAttribute("kehu1", kehu1);
			return "suc";
		} 
		
		
	@Override
	public String execute() throws Exception {
		    list =kehuService.getKehu();
		    list1 =userService.getUser();
	        return "suc";
	}
	//添加客户
	public String add (){
		kehuService.addKehu(kehu);
		return "suc";
	}  

	public KehuService getKehuService() {
		return kehuService;
	}

	public void setKehuService(KehuService kehuService) {
		this.kehuService = kehuService;
	}

	public Kehu getKehu() {
		return kehu;
	}

	public void setKehu(Kehu kehu) {
		this.kehu = kehu;
	}

	public List<Kehu> getList() {
		return list;
	}

	public void setList(List<Kehu> list) {
		this.list = list;
	}

	public List<User> getList1() {
		return list1;
	}

	public void setList1(List<User> list1) {
		this.list1 = list1;
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
	public int getKehuId() {
		return kehuId;
	}
	public void setKehuId(int kehuId) {
		this.kehuId = kehuId;
	}
	public Kehu getKehu1() {
		return kehu1;
	}
	public void setKehu1(Kehu kehu1) {
		this.kehu1 = kehu1;
	}
   
	
}
