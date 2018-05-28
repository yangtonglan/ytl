package Entity;

public class Dingdan {

	private int id;
	private String name;//产品名称
	private String type;//产品类型
	private int  count;//数量
	private double price;//单价
	private double total;//小计
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Dingdan [id=" + id + ", name=" + name + ", type=" + type + ", count=" + count + ", price=" + price
				+ ", total=" + total + "]";
	}
	
}