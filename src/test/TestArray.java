package test;

import java.util.Arrays;

public class TestArray {
	public static void main(String[] args) {
		int x[][] = new int[3][3], y[][] = new int[3][3], z[][] = new int[3][3];
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++) {
				x[i][j] = (int) (Math.random() * 31);
				y[i][j] = (int) (Math.random() * 31);
				z[i][j] = x[i][j] + y[i][j];
			}
		System.out.println(Arrays.deepToString(x));
		System.out.println(Arrays.deepToString(y));
		System.out.println(Arrays.deepToString(z));
		
		TestArray ar = new TestArray();
		int n[][]= ar.getRandomArray();
		int m[][]= ar.getRandomArray();
		int k[][]= ar.sumArray(n, m);
		ar.printArray(n);
		ar.printArray(m);
		ar.printArray(k);
	}
	
	public int[][] getRandomArray(){
		int array[][] = new int[3][3];
		for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array.length; j++) 
				array[i][j] = (int) (Math.random() * 31);
		return array;
	}
	
	public int[][] sumArray(int[][] array1, int[][] array2){
		int array[][] = new int[3][3];
		for (int i = 0; i < array1.length; i++)
			for (int j = 0; j < array1.length; j++) 
				array[i][j] = array1[i][j]+array2[i][j]	;
		return array;
	}
	
	public void printArray(int[][] array){
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) 
				System.out.print(array[i][j]+"\t");
			System.out.println();
		}
		System.out.println("=========================");
	}
}
