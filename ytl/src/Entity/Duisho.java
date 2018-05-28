package Entity;

public class Duisho {
	private int id;
	private String companyName;//公司名称
	private String product;//竞争产品
	private String state;//竞争状态
	private String describe;//竞争描述
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Duisho [id=" + id + ", companyName=" + companyName + ", product=" + product + ", state=" + state
				+ ", describe=" + describe + "]";
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	
}