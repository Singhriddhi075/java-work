package Assignment5;

import java.util.Scanner;

public class subsetREC {

	public static int count=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=obj.nextInt();
		}
		
		int target=obj.nextInt();
		find("",0,0,array,target);
		System.out.println();
		System.out.println(count);
	}

	public static void find(String s,int sum,int vidx,int[] array,int target) {
		// TODO Auto-generated method stub
		
		//base case
		if(vidx==array.length && sum==target)
		{
			System.out.print(s+" ");
			count++;
			return;
		}
		
		if(vidx==array.length)
		{
			return;
		}
		
		//smaller problem

		find(s+array[vidx]+" ",sum+array[vidx],vidx+1,array,target);	
		find(s,sum,vidx+1,array,target);
		
	}

}