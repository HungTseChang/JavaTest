package homework5;

public class MyRectangleMain {
	public static void main(String[] args) {
		MyRectangle mr1= new MyRectangle();
		MyRectangle mr2= new MyRectangle(10, 20);
		mr1.setWidth(10);
		mr1.setDepth(20);
		System.out.println("mr1:"+mr1.getArea()+"\nmr2:"+mr2.getArea());
	}
}
