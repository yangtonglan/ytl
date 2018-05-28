package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import Entity.Dingdan;
import service.DingdanService;

public class DingdanAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private DingdanService dingdanService;
	  private  Dingdan dingdan;
	  private List<Dingdan> list;
	  
	@Override
	public String execute() throws Exception {
		    list =dingdanService.getDingdan();
	        return "suc";
	}
	//添加订单
		public String add (){
			dingdanService.addDingdan(dingdan);
			return "suc";
		}  

	public DingdanService getDingdanService() {
		return dingdanService;
	}

	public void setDingdanService(DingdanService dingdanService) {
		this.dingdanService = dingdanService;
	}

	public Dingdan getDingdan() {
		return dingdan;
	}

	public void setDingdan(Dingdan dingdan) {
		this.dingdan = dingdan;
	}

	public List<Dingdan> getList() {
		return list;
	}

	public void setList(List<Dingdan> list) {
		this.list = list;
	}
    

}
