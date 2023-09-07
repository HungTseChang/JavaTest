package test;

import java.util.Scanner;

public class testRegex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		String regex = "^[A-Z][12]{1}\\d{8}$";
		
		if(id.matches(regex)) {
			System.out.println("OK");
		}else {
			System.out.println("No good....");
		}
		sc.close();
	}
}
