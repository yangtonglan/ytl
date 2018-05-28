package daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import Entity.Jihui;
import dao.JihuiDao;
import util.Hibernateutil;

public class JihuiDaoimpl implements JihuiDao{
	@Override
	public void add(Jihui jiHui) {
		Session session=Hibernateutil.getSession();
    	session.beginTransaction();
    	session.save(jiHui);
    	session.getTransaction().commit();
    	Hibernateutil.close();
	}
	
	@Override
	public void delete(Jihui jiHui) {
		Session session=Hibernateutil.getSession();
    	session.beginTransaction();
    	session.delete(jiHui);
    	session.getTransaction().commit();
    	Hibernateutil.close();
	}

	@Override
	public void update(Jihui jiHui) {
		Session session=Hibernateutil.getSession();
    	session.beginTransaction();
    	session.update(jiHui);
    	session.getTransaction().commit();
    	Hibernateutil.close();
	}
	
	@Override
	public List<Jihui> getJihui() {
			Session session =Hibernateutil.getSession();
			String hql ="from Jihui";//基于对象查询类名
		    Query<Jihui> query=session.createQuery(hql,Jihui.class);
		    List<Jihui> jiHui =query.list();
     	    return jiHui;
	}

}
