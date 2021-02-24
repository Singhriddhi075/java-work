package Assignment5;

import java.util.Scanner;

public class patterninvertdglass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = n, r = n, r2 = n;
		int rightno = 1, leftno = 1;
		int space = 2 * n - 1;
		int row = 1;
		int z1 = n, z2 = 1;
		int a = n, b = 1, na = n, nb = n, space2 = 1, c = 1;
		while (row <= 2 * n + 1) {
			if (row <= 2 * n / 2) {
				k = n;
				r = r2;
				for (int i = 1; i <= leftno; i++) {
					System.out.print(k + " ");
					k--;
				}
				for (int i = 1; i <= space; i++) {
					System.out.print("  ");
				}

				for (int i = 1; i <= leftno; i++) {
					System.out.print(r + " ");
					r++;
				}
				 r2--;
					rightno = rightno + 1;
					leftno = leftno + 1;
					space = space - 2;

					} else if (row == (2 * n /2)+ 1) {
						for (int i = 1; i <= n; i++) {
							System.out.print(z1 + " ");
							z1--;

						}
						for (int i = 1; i <= 1; i++) {
							System.out.print("0 ");
						}
						for (int i = 1; i <= n; i++) {
							System.out.print(z2 + " ");
							z2++;
						}
					} else if(row>n+1){
						a = n;
						b = c;
						for (int i = 1; i <= na; i++) {
							System.out.print(a + " ");
							a--;
						}
						for (int i = 1; i <= space2; i++) {
							System.out.print("  ");
						}
						for (int i = 1; i <= nb; i++) {
							System.out.print(b + " ");
							b++;
						}

		            space2 = space2 + 2;
					na--;
					nb--;
					c++;
					}

					///// prepatory step for upper part

					System.out.println();
					row++;

				}

		    }
		}
