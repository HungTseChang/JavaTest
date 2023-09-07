package homework5;

import java.util.Arrays;

public class Homework5_3 {
	public static void main(String[] args) {
		int intArray[][] = { { 1, 6, 3 }, { 9, 5, 2 } };
		double doubleArray[][] = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
		System.out.println(maxElement(intArray));
		System.out.println(maxElement(doubleArray));
	}

	public static int maxElement(int x[][]) {
		int max = 0;
		for (int i = 0; i < x.length; i++) {
			Arrays.sort(x[i]);
			if (max < x[i][x[i].length - 1])
				max = x[i][x[i].length - 1];
		}
		return max;
	}

	public static double maxElement(double x[][]) {
		double max = 0;
		for (int i = 0; i < x.length; i++) {
			Arrays.sort(x[i]);
			if (max < x[i][x[i].length - 1])
				max = x[i][x[i].length - 1];
		}
		return max;
	}
}
