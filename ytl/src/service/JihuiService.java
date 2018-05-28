package service;
import java.util.List;

import Entity.Jihui;
import dao.JihuiDao;

public class JihuiService {
   private JihuiDao jihuiDao;
    
	public void addKehu(Jihui jiHui) {
//		UserDao userDao=new UserDaoimpl();
		jihuiDao.add(jiHui);
	}
    public List<Jihui> getJihui() {
//    	UserDao userDao=new UserDaoimpl();
    	List<Jihui> duiSho= jihuiDao.getJihui();
    	 return duiSho;
    }
    
    public void delete(Jihui jiHui) {
    	jihuiDao.delete(jiHui);
    }
    public void update(Jihui jiHui) {
    	jihuiDao.update(jiHui);
    }
	public JihuiDao getJihuiDao() {
		return jihuiDao;
	}
	public void setJihuiDao(JihuiDao jihuiDao) {
		this.jihuiDao = jihuiDao;
	}
	
	
}
