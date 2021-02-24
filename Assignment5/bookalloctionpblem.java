package Assignment5;

import java.util.Scanner;

public class bookalloctionpblem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int i =0;i<t;i++) {
		int n = sc.nextInt();
		int k =sc.nextInt();
		 
		long[] books=new long[n];
		for(int j=0;j<n;j++)
		{
			books[j]=sc.nextLong();
		}

        System.out.println(binarySearch(books, n, k));
		}
	}

	public static long binarySearch(long books[], int n, int k) {
		long ans = 0, s = 0, e = 0;
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += books[i];
			//s = Math.max(s, books[i]);
		}
		e = sum;
		while (s <= e) {
			long mid = (s + e) / 2;
			if (isValid(books, n, k, mid)) {
				ans = mid;
				e = mid - 1;
			} else {
				s = mid + 1;
			}
		}
		return ans;
	}

	public static boolean isValid(long books[], int n, int k, long ans) {
		int students = 1;
		long current_page = 0;
		for (int i = 0; i < books.length; i++) {
            if (books[i] > ans) {

				return false;
			}
			if (current_page + books[i] > ans) {
				current_page = books[i];
				students++;
				if (students > k) {
					return false;
				}
			} else {
				current_page += books[i];

			}
		}
		return true;

    }
}
				