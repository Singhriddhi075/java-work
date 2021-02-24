package Assignment5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class KorderLCS {
    public static void main(String args[] ) throws Exception {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m = sc.nextInt();
       int k = sc.nextInt();
       int a[] = new int[n];
       int b[] = new int[m];
        for (int i = 0; i <n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
 
        }
        int strg[][] = new int[n+1][m+1];
        for (int i = 1; i <n+1; i++) {
            for (int j = 1; j <m+1 ; j++) {
                if (a[i-1] == b[j-1]){
                    strg[i][j] = strg[i-1][j-1] + 1;
                }
                else{
                    strg[i][j] = Math.max(strg[i-1][j],strg[i][j-1]);
                }
            }
        }
        int maxchange = Math.min(Math.min(n,m)-strg[n][m],k);
        System.out.println(maxchange+strg[n][m]);
 
    }
}