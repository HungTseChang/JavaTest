package homework5;

public class Pencil extends Pen {
	 public Pencil(String brand, int price) {
		 super(brand,price);
		 setprice(price);
	 }
	 public void setprice(int price){
		 price *=0.8;
		 super.setprice((int)price);
	 }
	public void write(){
		System.out.println("為削鉛筆再寫");
	}
}
