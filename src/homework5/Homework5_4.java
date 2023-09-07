package homework5;

public class Homework5_4 {
	public static void main(String[] args) {
		System.out.println("本次產生的驗證碼為:");
		genAuthCode();	
	}

	public static void genAuthCode() {

		for (int i = 0; i < 8; i++) {
			switch ((int) (Math.random() * 3)) {
			case 0: 
				System.out.print((char)(int) (Math.random() * 10+48));
				break;
			case 1: 
				System.out.print((char)(int) (Math.random() * 26+65));
				break;
			case 2: 
				System.out.print((char)(int) (Math.random() * 26+97));
				break;
			}

		}
	}
}
