package Assignment5;

import java.util.Scanner;

public class longestincss {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();
			long[] one = new long[n];
			long[] zero = new long[n];
			one[0] = 1;
			zero[0] = 1;
			for (int i = 1; i < zero.length; i++) {
				zero[i] = zero[i - 1] + one[i - 1];
				one[i] = zero[i - 1];
			}

			long ans = zero[n - 1] + one[n - 1];
			System.out.println(ans);
			t--;
		}
	}
}
