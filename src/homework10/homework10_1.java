package homework10;

public class homework10_1 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			int num = (int) (Math.random() * 100 + 1);
			System.out.println(num + (isPrime(num) ? "是" : "不是") + "質數");
		}

	}

	static boolean isPrime(int num) {
		if ( num == 1)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++)
			if (num % i == 0)
				return false;
		return true;
	}
}
