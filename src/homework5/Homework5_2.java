package homework5;

public class Homework5_2 {
	public static void main(String[] args) {
		System.out.println("本次亂數結果:");
		randAvg();
	}
	public static void randAvg() {
		int num;
		int sum = 0;
		for (int i=0; i < 10; i++) {
			System.out.print((num = (int) (Math.random()*101))+" ");
			sum += num;
		}
		System.out.print("\n平均為:"+(sum / 10));
	}
}