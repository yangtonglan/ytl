package daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.query.Query;

import Entity.Kehu;
import Entity.User;
import dao.KehuDao;
import dao.UserDao;
import util.Hibernateutil;

public class KehuDaoimpl implements KehuDao{
	@Override
	public void add(Kehu kuhe) {
		Session session=Hibernateutil.getSession();
    	session.beginTransaction();
    	session.save(kuhe);
    	session.getTransaction().commit();
    	Hibernateutil.close();
	}
	
	@Override
	public void delete(Kehu kuhe) {
		Session session=Hibernateutil.getSession();
    	session.beginTransaction();
    	session.delete(kuhe);
    	session.getTransaction().commit();
    	Hibernateutil.close();
	}

	@Override
	public void update(Kehu kuhe) {
		Session session=Hibernateutil.getSession();
    	session.beginTransaction();
    	session.update(kuhe);
    	session.getTransaction().commit();
    	Hibernateutil.close();
	}
	
	@Override
	public List<Kehu> getKehu() {
			Session session =Hibernateutil.getSession();
			String hql ="from Kehu";//基于对象查询
		    Query<Kehu> query=session.createQuery(hql,Kehu.class);
		    List<Kehu> kehu =query.list();
     	    return kehu;
	}

	@Override
	public Kehu getKehuById(int id) {
		Session session =Hibernateutil.getSession();
		String hql ="from Kehu WHERE id=:kehuId";
	    Query<Kehu> query=session.createQuery(hql);
	    query.setParameter("kehuId", id);
	    return query.uniqueResult();
	}

}
