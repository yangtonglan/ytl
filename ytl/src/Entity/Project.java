package Entity;

import java.util.HashSet;
import java.util.Set;

public class Project {
	private int id;
	private String name;//项目管理
	private String jingdu;//项目进度
	private String evaluate;//项目评估
	private  Set<User> user=new HashSet<User>() ;//项目管理人
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJingdu() {
		return jingdu;
	}
	public void setJingdu(String jingdu) {
		this.jingdu = jingdu;
	}
	public String getEvaluate() {
		return evaluate;
	}
	public void setEvaluate(String evaluate) {
		this.evaluate = evaluate;
	}
	public Set<User> getUser() {
		return user;
	}
	public void setUser(Set<User> user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", jingdu=" + jingdu + ", evaluate=" + evaluate + ", user="
				+ user + "]";
	}
	
   
}
