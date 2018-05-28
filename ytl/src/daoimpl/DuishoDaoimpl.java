package daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import Entity.Duisho;
import dao.DuishoDao;
import util.Hibernateutil;

public class DuishoDaoimpl implements DuishoDao{
	@Override
	public void add(Duisho duiSho) {
		Session session=Hibernateutil.getSession();
    	session.beginTransaction();
    	session.save(duiSho);
    	session.getTransaction().commit();
    	Hibernateutil.close();
	}
	
	@Override
	public void delete(Duisho duiSho) {
		Session session=Hibernateutil.getSession();
    	session.beginTransaction();
    	session.delete(duiSho);
    	session.getTransaction().commit();
    	Hibernateutil.close();
	}

	@Override
	public void update(Duisho duiSho) {
		Session session=Hibernateutil.getSession();
    	session.beginTransaction();
    	session.update(duiSho);
    	session.getTransaction().commit();
    	Hibernateutil.close();
	}
	
	@Override
	public List<Duisho> getDuisho() {
			Session session =Hibernateutil.getSession();
			String hql ="from Duisho";//基于对象查询类名
		    Query<Duisho> query=session.createQuery(hql,Duisho.class);
		    List<Duisho> duiSho =query.list();
     	    return duiSho;
	}

}
