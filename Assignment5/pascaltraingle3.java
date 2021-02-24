package Assignment5;

import java.util.Scanner;

public class pascaltraingle3 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		int nst=1;

		for(int row=1;row<=n;row++) {
			int val=1;
			for(int cst=1;cst<=nst;cst++) {
				System.out.print(val+"\t");
				val = val*(row-cst)/cst;
			}
			System.out.println();
			nst++;
		}
    }
}