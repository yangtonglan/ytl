package daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import Entity.Dingdan;
import Entity.Kehu;
import dao.DingdanDao;
import util.Hibernateutil;

public class DingdanDaoimpl implements DingdanDao{
	@SuppressWarnings("unchecked")
	@Override
	public Dingdan getDingdanById(int id) {
		Session session =Hibernateutil.getSession();
		String hql ="from Dingdan WHERE id=:dingdanId";
	    Query<Dingdan> query=session.createQuery(hql);
	    query.setParameter("dingdanId", id);
	    return query.uniqueResult();
	}
	@Override
	public void add(Dingdan dingDan) {
		System.out.println(dingDan);
		Session session=Hibernateutil.getSession();
    	session.beginTransaction();
    	session.save(dingDan);
    	session.getTransaction().commit();
    	Hibernateutil.close();
	}
	
	@Override
	public void delete(Dingdan dingDan) {
		Session session=Hibernateutil.getSession();
    	session.beginTransaction();
    	session.delete(dingDan);
    	session.getTransaction().commit();
    	Hibernateutil.close();
	}

	@Override
	public void update(Dingdan dingDan) {
		Session session=Hibernateutil.getSession();
    	session.beginTransaction();
    	session.update(dingDan);
    	session.getTransaction().commit();
    	Hibernateutil.close();
	}
	
	@Override
	public List<Dingdan> getDingdan() {
			Session session =Hibernateutil.getSession();
			String hql ="from Dingdan";//基于对象查询
		    Query<Dingdan> query=session.createQuery(hql,Dingdan.class);
		    List<Dingdan> Dingdan =query.list();
     	    return Dingdan;
	}

}
