package daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.query.Query;

import Entity.User;
import dao.UserDao;
import util.Hibernateutil;

public class UserDaoimpl implements UserDao{
	
	@Override
	public User getUserById(int id) {
		Session session =Hibernateutil.getSession();
		String hql ="from User WHERE userId=:userId";
	    Query<User> query=session.createQuery(hql,User.class);
	    query.setParameter("userId", id);
	    return query.uniqueResult();
	}

	@Override
	public void add(User user) {
		Session session=Hibernateutil.getSession();
    	session.beginTransaction();//开启事务
    	session.save(user);
    	session.getTransaction().commit();//提交事务
    	Hibernateutil.close();//关闭连接
	}
	
	@Override
	public void delete(User user) {
		Session session=Hibernateutil.getSession();
    	session.beginTransaction();
    	session.delete(user);
    	session.getTransaction().commit();
    	Hibernateutil.close();
	}

	@Override
	public void update(User user) {
		Session session=Hibernateutil.getSession();
    	session.beginTransaction();
    	session.update(user);
    	session.getTransaction().commit();
    	Hibernateutil.close();
	}
	
	@Override
	public User getUser(String username) {
			Session session =Hibernateutil.getSession();
			String hql ="from User WHERE userName=:userName";
		    Query<User> query=session.createQuery(hql,User.class);
		    query.setParameter("userName", username);
		    return query.uniqueResult();
	}
	@Override
	public List<User> getUser() {
		Session session =Hibernateutil.getSession();
		String hql ="from User";
	    Query<User> query=session.createQuery(hql,User.class);
	    return query.list();
	}

	@Override
	public Integer getlong(DetachedCriteria p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getpageuser(DetachedCriteria p, Integer start, Integer pagesize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByPassword(String password) {
		Session session =Hibernateutil.getSession();
		String hql ="from User WHERE userPassword=:userPassword";
	    Query<User> query=session.createQuery(hql,User.class);
	    query.setParameter("userPassword", password);
	    return query.uniqueResult();
		
	}
	
}
