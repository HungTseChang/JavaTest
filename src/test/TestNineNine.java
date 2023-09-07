package test;

import java.util.Arrays;
import java.util.function.BiConsumer;

public class TestNineNine {
	public static void main(String[] args) {
		System.out.println("一.===================================================================");
		for (int i = 1, j = 1; i <= 9; i++, j = 1, System.out.println())
			while (j <= 9) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
				j++;
			}
		System.out.println("二.===================================================================");
		for (int i = 1, j = 1; i <= 9; i++, j = 1, System.out.println())
			do {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
				j++;
			} while (j <= 9);
		System.out.println("三.===================================================================");
		int i = 1, j = 1;
		while (i <= 9) {
			do {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
				j++;
			} while (j <= 9);
			i++;
			j = 1;
			System.out.println();
		}
		System.out.println("四.===================================================================");
		int a=0;
		int nine[] = {1,2,3,4,5,6,7,8,9};
		Integer sum[]=new Integer[81];
		for (int m = 0; m < 9; m++)
			for(int n=0;n<9;n++)
				sum[a++]=nine[m]*nine[n];
		System.out.println(Arrays.asList(sum));
		for(int m=0;m<81;m++)
			System.out.println(sum[m]);
	}
}
