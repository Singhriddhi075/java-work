package Assignment5;

import java.util.Scanner;

public class maxcircularsum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int j =0;j<n;j++)
			{
				a[j]=sc.nextInt();
			}
			int straightSum = findmaxSumSubArray( a);
            int wrap=0;  // use wrap
			for(int j=0;j<a.length;j++)
			{
                wrap+=a[j];   // wrap
				a[j]=a[j]*(-1);
			}
			int negativeSum= findmaxSumSubArray(a);
            wrap=wrap+negativeSum;  //Here is change
			System.out.println(wrap>straightSum?wrap:straightSum);   // use the max of two value 
		}
		
	}
	
	public static int findmaxSumSubArray(int[] a)
	{
		int max_so_far=a[0];
		int max_ending_here=0;
		int start =0, s=0,e=0;
		for(int i=0;i<a.length;i++)
		{
			max_ending_here = max_ending_here+a[i];
			if(max_so_far<max_ending_here)
			{
				max_so_far=max_ending_here;
				start = s; e=i;
			}
			if(max_ending_here<0)
			{
				max_ending_here=0;
				s=i+1;
			}
		}
		return max_so_far;
    }
}