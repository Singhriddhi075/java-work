package Assignment5;

import java.util.Scanner;

public class reverseanarray {
    public static void main(String args[]) {
       
       
       Scanner  scn=new Scanner(System.in);
       int n=scn.nextInt();
       int[]a=new int[n];
       for(int i=0;i<n;i++){
           a[i]=scn.nextInt();
       } 
       reverse(a,n);
    }

  public static void reverse(int[]a,int n){

       int[] b = new int[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) { 
            b[j - 1] = a[i]; 
            j = j - 1; 
        } 
   
        for (int k = 0; k < n; k++) { 
            System.out.println(b[k]); 
        } 
  }


}