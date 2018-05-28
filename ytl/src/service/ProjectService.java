package service;
import java.util.List;

import Entity.Dingdan;
import Entity.Project;
import dao.ProjectDao;

public class ProjectService {
   private ProjectDao projectDao;
   
   public Project getProjectById(int id) {
	   Project project= projectDao.getProjectById(id);
   	   System.out.println(project);
   	   return project;
   }
    
	public void add(Project project) {
		projectDao.add(project);
	}
    public List<Project> getProject() {
    	List<Project> project= projectDao.getProject();
    	 return project;
    }
    
    public void delete(Project project) {
    	projectDao.delete(project);
    }
    public void update(Project project) {
    	projectDao.update(project);
    }
	public ProjectDao getProjectDao() {
		return projectDao;
	}
	public void setProjectDao(ProjectDao projectDao) {
		this.projectDao = projectDao;
	}
	
}
