package action.Top;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import Entity.Kehu;
import Entity.User;
import service.KehuService;

public class alterKehuAction extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	private KehuService kehuService;
	 private  Kehu kehu;
	 
	 public String alterkehu1(){
     	
		     Kehu kehu2 = new Kehu();
        	 kehu2.setId(kehu.getId());
        	 kehu2.setKehuName(kehu.getKehuName());
        	 kehu2.setKehuPhone(kehu.getKehuPhone());
        	 kehu2.setKehuGrade(kehu.getKehuGrade());
        	 kehu2.setKehuTrade(kehu.getKehuTrade());
        	 kehu2.setKehusource(kehu.getKehusource());
			
			kehuService.update(kehu2);
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
	 
}
