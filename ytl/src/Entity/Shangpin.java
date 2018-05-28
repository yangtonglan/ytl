package Entity;

public class Shangpin {

	private int id;
	private String name;//商品名称
	private int  count;//商品存货
	private double price;//商品单价
	private double total;//商品小计
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
		return "Shangpin [id=" + id + ", name=" + name + ", count=" + count + ", price=" + price + ", total=" + total
				+ "]";
	}
	
}
	
