package homework3;

import java.util.Scanner;

public class Homework3_2 {
	public static void main(String[] args) {
		int ans = (int) (Math.random() * 101);
		int input;
		System.out.println("開始猜數字吧!");
		while (true) {
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextInt()) {
				input = sc.nextInt();
				if (input == ans) {
					System.out.println("答對了!答案就是" + ans);
					break;
				} else if (input > ans)
					System.out.println("大於正確答案");
				else
					System.out.println("小於正確答案");
			} else
				System.out.println("請輸入整數");
		}
	}
}
