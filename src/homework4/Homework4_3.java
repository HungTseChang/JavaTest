package homework4;

import java.util.Scanner;

public class Homework4_3 {
//	private static final Scanner sc = new Scanner(System.in);
	
	public static int getInputNum(String notifiedMsg, String errMsg) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println(notifiedMsg);
			if (sc.hasNextInt()) {
				int inputNum = sc.nextInt();
				return inputNum;
			} else {
				System.out.println(errMsg);
				sc.next();
			}
		}
	}
	
	
	public static void main(String[] args) {
		int daySum = 0;
		int monthDay[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.println("請輸入 yyyy年 mm月 dd日");
//		int year, month, day;
		
		
		int year = getInputNum("請輸入yyyy", "請輸入yyyy正確格式");
		int month = getInputNum("請輸入mm", "請輸入mm正確格式");
		int day = getInputNum("請輸入dd", "請輸入dd正確格式");
		
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		
//		while (true) {
//			Scanner sc = new Scanner(System.in);
//			if (sc.hasNextInt())
//				year = sc.nextInt();
//			else {
//				System.out.println("請輸入正確格式");
//				continue;
//			}
//			if (sc.hasNextInt())
//				month = sc.nextInt();
//			else {
//				System.out.println("請輸入正確格式");
//				continue;
//			}
//			if (sc.hasNextInt())
//				day = sc.nextInt();
//			else {
//				System.out.println("請輸入正確格式");
//				continue;
//			}
//			if (year >= 0 && month > 0 && month < 13 && day > 0 && day <= monthDay[month - 1]) {
//				if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
//					monthDay[1] = 29;
//				for (int i = 0; i < month - 1; i++)
//					daySum += monthDay[i];
//				daySum += day;
//				System.out.println("輸入的日期為該年的第" + daySum + "天");
//				break;
//			}
//			System.out.println("請輸入正確格式");
//		}
	}
}
