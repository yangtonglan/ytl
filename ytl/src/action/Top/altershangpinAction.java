package action.Top;

import Entity.Shangpin;
import service.ShangpinService;

public class altershangpinAction {
       private  Shangpin shangpin;
       
	 public String altershangpin1(){
		    ShangpinService shangpinService=new ShangpinService();
		    Shangpin shangpin2 = new Shangpin();
        	shangpin2.setId(shangpin.getId());
        	shangpin2.setName(shangpin.getName());
        	shangpin2.setPrice(shangpin.getPrice());
        	shangpin2.setCount(shangpin.getCount());
        	shangpin2.setTotal(shangpin.getTotal());
			
        shangpinService.update(shangpin2);
			return "suc";
		}

	public Shangpin getShangpin() {
		return shangpin;
	}

	public void setShangpin(Shangpin shangpin) {
		this.shangpin = shangpin;
	}
    
}
