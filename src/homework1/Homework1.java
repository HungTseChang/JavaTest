package homework1;

public class Homework1 {
	public static void main(String[] args) {
		int x = 12, y = 6;
		System.out.println("和:" + (x + y) + "\n積:" + x * y);
		System.out.println("=================================================================");

		int egg = 200;
		System.out.println((egg / 12) + "打" + (egg % 12) + "顆");
		System.out.println("=================================================================");

		int sec = 256559;
		System.out.println((sec / 60 / 60 / 24) + "天" + (sec / 60 / 60 % 24) + "時" + (sec / 60 % 60) + "分" + (sec % 60) + "秒");
		System.out.println("=================================================================");

		final double pi = 3.1415;
		int r = 5;
		System.out.println("園面積" + r * r * pi + "\n園周長" + r * 2 * pi);
		System.out.println("=================================================================");

		int money = 15, year = 10;
		double rates = 0.02;
		System.out.println((money * Math.pow((1 + rates), year)) + "萬");
		System.out.println("=================================================================");

		System.out.println(5 + 5); // 整數相加
		System.out.println(5 + '5'); // 5的unicode為53
		System.out.println(5 + "5"); // 變成字串相加
	}
}
