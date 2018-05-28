package service;
import java.util.List;

import Entity.Dingdan;
import Entity.Kehu;
import dao.DingdanDao;


public class DingdanService {
   private DingdanDao dingdanDao;
   
   public Dingdan getDingdanById(int id) {
	   Dingdan dingdan=dingdanDao.getDingdanById(id);
   	   System.out.println(dingdan);
   	   return dingdan;
   }
    
	public void addDingdan(Dingdan dingDan) {
//		UserDao userDao=new UserDaoimpl();
		dingdanDao.add(dingDan);
	}
    public List<Dingdan> getDingdan() {
//    	UserDao userDao=new UserDaoimpl();
    	List<Dingdan> Dingdan= dingdanDao.getDingdan();
    	 return Dingdan;
    }
    
    public void delete(Dingdan dingDan) {
    	dingdanDao.delete(dingDan);
    }
    public void update(Dingdan dingDan) {
    	dingdanDao.update(dingDan);
    }
	public DingdanDao getDingdanDao() {
		return dingdanDao;
	}
	public void setDingdanDao(DingdanDao dingdanDao) {
		this.dingdanDao = dingdanDao;
	}
	
}
