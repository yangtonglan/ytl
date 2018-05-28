package daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import Entity.Dingdan;
import Entity.Project;
import dao.ProjectDao;
import util.Hibernateutil;

public class ProjectDaoimpl implements ProjectDao{
	@Override
	public Project getProjectById(int id) {
		Session session =Hibernateutil.getSession();
		String hql ="from Project WHERE id=:projectId";
	    Query<Project> query=session.createQuery(hql);
	    query.setParameter("projectId", id);
	    return query.uniqueResult();
	}
	@Override
	public void add(Project project) {
		Session session=Hibernateutil.getSession();
    	session.beginTransaction();
    	session.save(project);
    	session.getTransaction().commit();
    	Hibernateutil.close();
	}
	
	@Override
	public void delete(Project project) {
		Session session=Hibernateutil.getSession();
    	session.beginTransaction();
    	session.delete(project);
    	session.getTransaction().commit();
    	Hibernateutil.close();
	}

	@Override
	public void update(Project project) {
		Session session=Hibernateutil.getSession();
    	session.beginTransaction();
    	session.update(project);
    	session.getTransaction().commit();
    	Hibernateutil.close();
	}
	
	@Override
	public List<Project> getProject() {
			Session session =Hibernateutil.getSession();
			String hql ="from Project";//基于对象查询类名
		    Query<Project> query=session.createQuery(hql,Project.class);
		    List<Project> project =query.list();
     	    return project;
	}

}
