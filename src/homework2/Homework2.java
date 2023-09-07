package homework2;

public class Homework2 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 1000; i += 2)
			sum += i;
		System.out.println("和:" + sum);
		System.out.println("=================================================================");
		int product = 1;
		for (int i = 2; i <= 10; i++)
			product *= i;
		System.out.println("積:" + product);
		System.out.println("=================================================================");
		product = 1;
		int m = 0;
		while (m++ < 10)
			product *= m;
		System.out.println("積:" + product);
		System.out.println("=================================================================");
		for (int i = 1; i <= 10; i++)
			System.out.print(i * i + " ");
		System.out.println("\n=================================================================");
		int count = 0;
		for (int i = 1; i <= 49; i++)
			if ((i % 10 != 4) && (i / 10 != 4)) {
				System.out.print(i + " ");
				count++;
			}
		System.out.println("\n總共:" + count);
		System.out.println("=================================================================");
		for (int i = 10; i > 0; i--, System.out.println())
			for (int j = 1; j <= i; j++)
				System.out.print(j + " ");
		System.out.println("=================================================================");
		for (char i = 'A'; i <= 'F'; i++, System.out.println())
			for (int j = 'A'; j <= i; j++)
				System.out.print(i);
	}

}
