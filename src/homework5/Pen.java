package homework5;

public abstract class Pen {
	private String brand;
	private int price;

	public Pen() {
	}

	public Pen(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
	public void setprice(int price) {
		this.price=price;
	}
	public void getprice() {
		System.out.println("price:"+price);
	}
	public void setbrand(String brand) {
		this.brand = brand;
	}
	public void getbrand() {
		System.out.println("brand:"+brand);
	}
	abstract  void write(); 

}
