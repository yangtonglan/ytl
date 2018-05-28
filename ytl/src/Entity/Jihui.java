package Entity;

import java.util.HashSet;
import java.util.Set;

public class Jihui {
	private int id;
	private String  name;
	private String gailv;//销售概率
	private  Set<User> user=new HashSet<User>() ;//销售负责人
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGailv() {
		return gailv;
	}
	public void setGailv(String gailv) {
		this.gailv = gailv;
	}
	public Set<User> getUser() {
		return user;
	}
	public void setUser(Set<User> user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Jihui [id=" + id + ", gailv=" + gailv + ", user=" + user + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	


}
