package homework5;

public class InkBrush extends Pen {
	 public InkBrush(String brand, int price) {
		 super(brand,price);
		 setprice(price);
	 }
	 public void setprice(int price){
		 price *=0.9;
		 super.setprice((int)price);
	 }
	public void write(){
		System.out.println("沾墨汁再寫");
	}
}
