package service;
import java.util.List;

import Entity.Kehu;
import Entity.Shangpin;
import dao.ShangpinDao;
import daoimpl.ShangpinDaoimpl;

public class ShangpinService {
	public Shangpin getShangpinById(int id) {
		ShangpinDao shangpinDao=new ShangpinDaoimpl();
    	Shangpin shangpin=shangpinDao.getShangpinById(id);
    	return shangpin;
    }
	public void addShangpin(Shangpin shangpin) {
		ShangpinDao shangpinDao=new ShangpinDaoimpl();
		shangpinDao.add(shangpin);
	}
    public List<Shangpin> getShangpin() {
    	ShangpinDao shangpinDao=new ShangpinDaoimpl();
    	List<Shangpin> Shangpin= shangpinDao.getShangpin();
    	 return Shangpin;
    }
    
    public void delete(Shangpin shangpin) {
    	ShangpinDao shangpinDao=new ShangpinDaoimpl();
    	shangpinDao.delete(shangpin);
    }
    public void update(Shangpin shangpin) {
    	ShangpinDao shangpinDao=new ShangpinDaoimpl();
    	shangpinDao.update(shangpin);
    }

}
