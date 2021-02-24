package Assignment5;

import java.util.Scanner;

public class inversearray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		int[] arr = { 2, 0, 3, 1, 4 };
		int n= scn.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<arr.length;i++) {
				arr[i]=scn.nextInt();
		}
		inversearray(arr);
		//display(arr);
	}

	public static void inversearray(int[] arr) {
		int[] inv = new int[arr.length];
		for (int i = 0; i < inv.length; i++) {
			inv[arr[i]] = i;
		}

		display(inv);
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}