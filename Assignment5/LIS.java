package Assignment5;

import java.util.Scanner;

public class LIS {
    public static void main(String args[]) {
        
        Scanner obj = new Scanner (System.in);
        int n = obj.nextInt();
        int[] arr = new int[n], lis = new int[n];
        for(int i=0;i<n;i++) arr[i] = obj.nextInt();

        int omax = 0;
        for(int i=0;i<n;i++){
            int x = 0;
            for(int j=i-1;j>=0;j--){
                if(arr[i]>arr[j]) x = Math.max(x, lis[j]);
            }

            lis[i] = x + 1;
            omax = Math.max(lis[i], omax);
        }

        System.out.println(omax);      


    }
}