package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import Entity.Duisho;
import service.DuishoService;
public class DuishotAction extends ActionSupport{
	
	  private DuishoService duishoService;
	  private  Duisho duiSho;
	  private List<Duisho> list;
	  
	@Override
	public String execute() throws Exception {
		    list =duishoService.getDuisho();
	        return "suc";
	}

	public DuishoService getDuishoService() {
		return duishoService;
	}

	public void setDuishoService(DuishoService duishoService) {
		this.duishoService = duishoService;
	}

	public Duisho getDuiSho() {
		return duiSho;
	}

	public void setDuiSho(Duisho duiSho) {
		this.duiSho = duiSho;
	}

	public List<Duisho> getList() {
		return list;
	}

	public void setList(List<Duisho> list) {
		this.list = list;
	}

	
}
