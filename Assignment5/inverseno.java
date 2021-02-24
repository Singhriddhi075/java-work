package Assignment5;

import java.util.Scanner;

public class inverseno {
	public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		System.out.println(inverse(num));
		
	}
	public static int inverse(int num){

        int place = 1;
        int mult = 1;
        int ans = 0;

        while(num != 0){
            int rem = num % 10;
            ans = ans + place * (int)Math.pow(10, rem - 1);
            num = num / 10;
            place++;
        }

        return ans;
    }

}
