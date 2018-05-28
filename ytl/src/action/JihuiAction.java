package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import Entity.Jihui;
import service.JihuiService;

public class JihuiAction extends ActionSupport{
	
	  private JihuiService jihuiService;
	  private  Jihui jiHui;
	  private List<Jihui> list;
	  
	@Override
	public String execute() throws Exception {
	    list =jihuiService.getJihui();
        return "suc";
}

	public JihuiService getJihuiService() {
		return jihuiService;
	}

	public void setJihuiService(JihuiService jihuiService) {
		this.jihuiService = jihuiService;
	}

	public Jihui getJiHui() {
		return jiHui;
	}

	public void setJiHui(Jihui jiHui) {
		this.jiHui = jiHui;
	}

	public List<Jihui> getList() {
		return list;
	}

	public void setList(List<Jihui> list) {
		this.list = list;
	}
	
}
