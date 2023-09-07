package homework5;

public class testPen {
	public static void main(String[] args) {
		Pen InkBrush = new InkBrush("Jimmy",1000);
		Pen Pencil = new Pencil("Joe",1000);
		InkBrush.getprice();
		InkBrush.write();
		Pencil.getprice();
		Pencil.write();
		
	}
}
