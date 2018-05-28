package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import Entity.Project;
import service.ProjectService;

public class ProjectAction extends ActionSupport{
	
	  private ProjectService projectService;
	  private  Project project;
	  private List<Project> list;
	  
	@Override
	public String execute() throws Exception {
		    list =projectService.getProject();
	        return "suc";
	}
	//添加项目
		public String add (){
			projectService.add(project);
			return "suc";
		}  
	
	public ProjectService getProjectService() {
		return projectService;
	}

	public void setProjectService(ProjectService projectService) {
		this.projectService = projectService;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public List<Project> getList() {
		return list;
	}

	public void setList(List<Project> list) {
		this.list = list;
	}
    
}
