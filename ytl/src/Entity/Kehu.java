package Entity;

import java.util.HashSet;
import java.util.Set;

public class Kehu {
	private int id;
	private String kehuName;//客户姓名
	private String kehuPhone;//客户电话
	private String kehuGrade;//客户等级
	private String kehuTrade;//所属行业
	private String kehusource;//客户来源
	private  Set<User> user=new HashSet<User>() ;//客户负责人
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKehuName() {
		return kehuName;
	}
	public void setKehuName(String kehuName) {
		this.kehuName = kehuName;
	}
	public String getKehuPhone() {
		return kehuPhone;
	}
	public void setKehuPhone(String kehuPhone) {
		this.kehuPhone = kehuPhone;
	}
	public String getKehuGrade() {
		return kehuGrade;
	}
	public void setKehuGrade(String kehuGrade) {
		this.kehuGrade = kehuGrade;
	}
	public String getKehuTrade() {
		return kehuTrade;
	}
	public void setKehuTrade(String kehuTrade) {
		this.kehuTrade = kehuTrade;
	}
	public String getKehusource() {
		return kehusource;
	}
	public void setKehusource(String kehusource) {
		this.kehusource = kehusource;
	}
	public Set<User> getUser() {
		return user;
	}
	public void setUser(Set<User> user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Kehu [id=" + id + ", kehuName=" + kehuName + ", kehuPhone=" + kehuPhone + ", kehuGrade=" + kehuGrade
				+ ", kehuTrade=" + kehuTrade + ", kehusource=" + kehusource + ", user=" + user + "]";
	}
	
}
