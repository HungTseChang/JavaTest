package homework3;

import java.util.Scanner;
import java.util.Arrays;

public class Homework3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Homework3_1 h3 = new Homework3_1();
		int input[] = new int[3];
		Boolean ni = false;
		System.out.println("請輸入三個整數:");
		for (int i = 0; i < 3; i++) {
			if (sc.hasNextInt())
				input[i] = sc.nextInt();
			else {
				ni = true;
				break;
			}
		}
		if (ni)
			System.out.println("不是三角形");
		else
			h3.printTriangle(input);
	}

	public void printTriangle(int tr[]) {
		Arrays.sort(tr);
		if (tr[0] + tr[1] <= tr[2])
			System.out.println("不是三角形");
		else if (tr[0] == tr[1] || tr[1] == tr[2]) {
			if (tr[0] == tr[2])
				System.out.println("正三角形");
			else
				System.out.println("等腰三角形");
		} else if (Math.sqrt(tr[0] * tr[0] + tr[1] * tr[1]) == tr[2])
			System.out.println("直角三角形");
		else
			System.out.println("其他三角形");
	}
}
