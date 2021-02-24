package Assignment5;

import java.util.Scanner;

public class countnobinarystring {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {

			int n1 = scn.nextInt();
			int n2 = scn.nextInt();

			System.out.println(countStrings(n1));
			System.out.println(countStrings(n2));
			t--;
		}

	}

	static int countStrings( int n) {
		int a[] = new int[n];
		int b[] = new int[n];
		a[0] = b[0] = 1;
		for (int i = 1; i < n; i++) {
			a[i] = a[i - 1] + b[i - 1];
			b[i] = a[i - 1];
		}
		return a[n - 1] + b[n - 1];
	}
}
