package Assignment5;

import java.util.Scanner;

public class arraybinarysearch {
    public static void main(String args[]) {

      Scanner scn=new Scanner(System.in);
      int N=scn.nextInt();
      int[]a=new int[N];
      for(int i=0;i<N;i++){

          a[i]=scn.nextInt();
      }
      int M=scn.nextInt();
      System.out.println(binarySearch(a,M));

    }



    public static int binarySearch(int[] arr, int item) {

		int lo = 0;
		int hi = arr.length - 1;

		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			if (item > arr[mid]) {
				lo = mid + 1;
			} else if (item < arr[mid]) {
				hi = mid - 1;
			} else {
				return mid;
			}
		}

		return -1;
	}






}
