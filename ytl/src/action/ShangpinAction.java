package action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import Entity.Kehu;
import Entity.Shangpin;
import Entity.User;
import service.KehuService;
import service.ShangpinService;
import service.UserService;

public class ShangpinAction extends ActionSupport{
	 
	private static final long serialVersionUID = 1L; 
	  private  Shangpin shangpin;
	  private List<Shangpin> list;
	  private Shangpin shangpin1;
	  private int shangpinId;
	  
	//将商品信息显示到修改页面
			public String xiaoshishangpin1(){
				System.out.println(shangpinId);
				ShangpinService shangpinService=new ShangpinService();
				shangpin1= shangpinService.getShangpinById(shangpinId);
				System.out.println(shangpin1);
			   HttpSession session=ServletActionContext.getRequest().getSession();
			   session.setAttribute("shangpin1", shangpin1);
				return "suc";
			}  
	  
	@Override
	public String execute() throws Exception {
		ShangpinService  shangpinService =new ShangpinService();
		    list =shangpinService.getShangpin();
	        return "suc";
	}
	//添加商品
		public String add (){
			ShangpinService  shangpinService =new ShangpinService();
			shangpinService.addShangpin(shangpin);
			return "suc";
		}  


	public Shangpin getShangpin() {
		return shangpin;
	}

	public void setShangpin(Shangpin shangpin) {
		this.shangpin = shangpin;
	}

	public List<Shangpin> getList() {
		return list;
	}

	public void setList(List<Shangpin> list) {
		this.list = list;
	}

	public Shangpin getShangpin1() {
		return shangpin1;
	}

	public void setShangpin1(Shangpin shangpin1) {
		this.shangpin1 = shangpin1;
	}

	public int getShangpinId() {
		return shangpinId;
	}

	public void setShangpinId(int shangpinId) {
		this.shangpinId = shangpinId;
	}

}
