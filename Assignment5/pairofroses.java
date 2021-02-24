package Assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class pairofroses {
    public static void main(String args[]) {
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0)
        {
            int n=obj.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=obj.nextInt();

            int tar=obj.nextInt();
            int a=0;
            int b=0;
            
            Arrays.sort(arr);

            for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(arr[i]+arr[j]==tar)
                    {
                        int temp = arr[j]-arr[i];
                        if(a==0 && b==0)
                        {
                            a=arr[i];
                            b=arr[j];
                        }
                        else if(temp<b-a)
                        {
                            b=arr[j];
                            a=arr[i];
                        }
                    }
                }
                System.out.println("Deepak should buy roses whose prices are "+a+" and "+b+".");
//                System.out.println("Deepak should buy roses whose prices are"+i+"and"+j+".");
            

            }

            
        }
    }
}
