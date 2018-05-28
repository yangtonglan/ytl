package service;
import java.util.List;

import Entity.Duisho;
import dao.DuishoDao;

public class DuishoService {
   private DuishoDao duishoDao;
    
	public void addDuisho(Duisho duiSho) {
//		UserDao userDao=new UserDaoimpl();
		duishoDao.add(duiSho);
	}
    public List<Duisho> getDuisho() {
//    	UserDao userDao=new UserDaoimpl();
    	List<Duisho> duiSho= duishoDao.getDuisho();
    	 return duiSho;
    }
    
    public void delete(Duisho duiSho) {
    	duishoDao.delete(duiSho);
    }
    public void update(Duisho duiSho) {
    	duishoDao.update(duiSho);
    }
	public DuishoDao getDuishoDao() {
		return duishoDao;
	}
	public void setDuishoDao(DuishoDao duishoDao) {
		this.duishoDao = duishoDao;
	}
	
	
}
