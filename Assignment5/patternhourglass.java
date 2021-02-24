package Assignment5;

import java.util.Scanner;

public class patternhourglass {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nsp = 0;
		int nst = 2 * n + 1;
		int i =n;
		int val;
		int row = 0;
		while (row < (2 * n + 1)) {
			val = i; // mera change 
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("  ");
			}
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val+" ");
				if (cst <= (nst / 2)) {
					val--;
				} else {
					val++;
				}
			}
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("  ");
			}
			System.out.println();
			row++;
			if (row <= ((2 * n + 1) / 2)) {
				nst = nst - 2;
				nsp = nsp + 1;
				i--; // mera change 
			} else {
				i++; // mera change 
				nst = nst + 2;
				nsp = nsp - 1;
			}
		}
	}
	}