package Assignment5;

import java.util.Scanner;

public class pp {
public static int givep(int []arr,int value)
{
int total = 0, c = 1; 
for (int i = 0; i < arr.length; i++) {
total += arr[i];
if (total > value) { 
// for next count
total = arr[i]; 
c++;
}
}
return c;
}
public static int pp(int []arr,int p)
{
	int max=0,sum=0,lo,hi,mid,ans=0;
	for(int i=0;i<arr.length;i++)
	{
		sum+=arr[i];
		if(max<arr[i])
		max=arr[i];

	}
	lo=max;
	hi=sum;
	while(lo<hi)
	{                                        
		 mid=(lo+hi)/2;
		int count=givep(arr,mid);
		if(count<=p)
		{	ans=mid;
			hi=mid;
		}
		else
		{
			lo=mid+1;
		}
	}
	return ans;
	

}
public static void main(String args[]) {
	int p,n;
	Scanner sc=new Scanner(System.in);
	p=sc.nextInt();
	n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	arr[i]=sc.nextInt();
	System.out.println(pp(arr,p));
}
}