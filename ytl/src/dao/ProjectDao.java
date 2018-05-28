package dao;

import java.util.List;
import Entity.Project;

public interface ProjectDao {
	public void delete(Project project);
    public void update(Project project);
    public void add(Project project);
    public List<Project> getProject();
    public Project getProjectById(int id);
}