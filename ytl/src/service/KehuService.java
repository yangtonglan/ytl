package service;
import java.util.List;

import Entity.Kehu;
import Entity.User;
import dao.KehuDao;

public class KehuService {
   private KehuDao kehuDao;
    
	public void addKehu(Kehu kehu) {
//		UserDao userDao=new UserDaoimpl();
		kehuDao.add(kehu);
	}
    public List<Kehu> getKehu() {
//    	UserDao userDao=new UserDaoimpl();
    	System.out.println("UserService "+ kehuDao);
    	List<Kehu> kehu= kehuDao.getKehu();
    	 return kehu;
    }
    public Kehu getKehuById(int id) {
    	Kehu kehu=kehuDao.getKehuById( id);
    	System.out.println(kehu);
    	return kehu;
    }
    
    public void delete(Kehu kehu) {
    	kehuDao.delete(kehu);
    }
    public void update(Kehu kehu) {
    	kehuDao.update(kehu);
    }
	public KehuDao getKehuDao() {
		return kehuDao;
	}
	public void setKehuDao(KehuDao kehuDao) {
		this.kehuDao = kehuDao;
	}
   
    
}
