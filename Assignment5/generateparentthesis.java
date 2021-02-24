package Assignment5;

import java.util.Scanner;

public class generateparentthesis {
    public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		int n =  s.nextInt();

		
		generateParenthesis(2*n,"",0,n,0);
    }


	public static void generateParenthesis(int n, String ans, int close, int limit, int open){
	 
	if(n==0){
		System.out.println(ans);
		return;
		}
	
	if(close < open && open != 0){
		generateParenthesis(n-1,ans+")",close+1,limit,open);
	}
	if(open < limit){
		generateParenthesis(n-1,ans+"(",close,limit,open+1);
	}
	}
}
