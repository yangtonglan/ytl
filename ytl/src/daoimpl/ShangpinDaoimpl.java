package daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.query.Query;

import Entity.Kehu;
import Entity.Project;
import Entity.Shangpin;
import Entity.User;
import dao.KehuDao;
import dao.ShangpinDao;
import dao.UserDao;
import util.Hibernateutil;

public class ShangpinDaoimpl implements ShangpinDao{
	@Override
	public Shangpin getShangpinById(int id) {
		Session session =Hibernateutil.getSession();
		String hql ="from Shangpin WHERE id=:shangpinId";
	    Query<Shangpin> query=session.createQuery(hql);
	    query.setParameter("shangpinId", id);
	    return query.uniqueResult();
	}
	@Override
	public void add(Shangpin shangpin) {
		Session session=Hibernateutil.getSession();
    	session.beginTransaction();
    	session.save(shangpin);
    	session.getTransaction().commit();
    	Hibernateutil.close();
	}
	
	@Override
	public void delete(Shangpin shangpin ){
		Session session=Hibernateutil.getSession();
    	session.beginTransaction();
    	session.delete(shangpin);
    	session.getTransaction().commit();
    	Hibernateutil.close();
	}

	@Override
	public void update(Shangpin shangpin) {
		Session session=Hibernateutil.getSession();
    	session.beginTransaction();
    	session.update(shangpin);
    	session.getTransaction().commit();
    	Hibernateutil.close();
	}
	
	@Override
	public List<Shangpin> getShangpin() {
			Session session =Hibernateutil.getSession();
			String hql ="from Shangpin";//基于对象查询
		    Query<Shangpin> query=session.createQuery(hql,Shangpin.class);
		    List<Shangpin> shangpin =query.list();
     	    return shangpin;
	}

}
