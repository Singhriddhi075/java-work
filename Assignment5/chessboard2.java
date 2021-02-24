package Assignment5;

import java.util.Scanner;

public class chessboard2 {

	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		boolean[][] board = new boolean[n][n];
		int[][] nos = new int[n][n];
		int c = 1, cv = 1;
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < n; j++)
			{

				//System.out.print(c+" ");
				if (checkP(c))
				{
					//System.out.println(c);
					if (cv % 2 == 0)
						nos[i][j] = 2; // port
					else
						nos[i][j] = 1; // mine
					cv++;
				}
				
				else
					nos[i][j] = 0; // none
				c++;
			}
			//System.out.println();
		}
		
//		for(int i=0;i<n;i++)
//		{
//			for(int val:nos[i])
//				System.out.print(val+" ");
//		
//			System.out.println();
//		}
		
		chessboard(nos, board, 0, 0, "");
		System.out.println();
		System.out.println(count);
	}

	private static boolean isPrime(int c) {
		// TODO Auto-generated method stub
		return false;
	}

	public static void chessboard(int[][] nos, boolean[][] board, int row, int col, String ans) {
		// TODO Auto-generated method stub

		// base case
		if (row == board.length - 1 && col == board[0].length - 1) {
			System.out.print(ans + "{" + row + "-" + col + "} ");
			count++;
			return;
		}

		if (row >= board.length || col >= board[0].length || nos[row][col] == 1) {
			return;
		}

		if (nos[row][col] == 2) {
			System.out.print(ans + "{" + row + "-" + col + "}P" + "{" + (board.length-1)  + "-" + (board[0].length-1) + "} " );
			count++;
		}
		
		// smaller problem

		// k1
		chessboard(nos, board, row + 2, col + 1, ans + "{" + row + "-" + col + "}K");

		// k2
		chessboard(nos, board, row + 1, col + 2, ans + "{" + row + "-" + col + "}K");

		// rook on walls
		if (col == board.length - 1 || col == 0 || row == board[0].length - 1 || row == 0) {
			for (int i = 1; col + i < board.length; i++)
				chessboard(nos, board, row, col + i, ans + "{" + row + "-" + col + "}R");

			for (int i = 1; row + i < board.length; i++)
				chessboard(nos, board, row + i, col, ans + "{" + row + "-" + col + "}R");

		}

		// if on diagonals then bishop
		if (row == col || row + col == board.length - 1) {
			for (int i = 1; row + i < board.length; i++)
				chessboard(nos, board, row + i, col + i, ans + "{" + row + "-" + col + "}B");
		}

	}

	static boolean checkP(int x) {

		if (x == 0 || x == 1)
			return false;
		if (x == 2) {
			return true;
		}

		if (x % 2 == 0) {
			return false;
		} else {
			for (long i = 3; i * i <= x;) {

				if (x % i == 0) {
					return false;
				}
				i = i + 2;
			}
		}

		return true;
	}

}