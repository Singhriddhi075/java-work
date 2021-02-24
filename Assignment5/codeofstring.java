package Assignment5;

import java.util.ArrayList;
import java.util.Scanner;

public class codeofstring {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String ques=scn.next();
		//String ans="";
		
		System.out.println(CodesGet(ques));
	}

	public static void Codes(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		// 1 digit encode call
		char ch1 = ques.charAt(0);
		String roq1 = ques.substring(1);
		Codes(roq1, ans + encode1(ch1));
		if (ques.length() >= 2) {
			// 2 digit encode call
			String ch2 = ques.substring(0, 2);
			String roq2 = ques.substring(2);
			Codes(roq2, ans + encode2(ch2));

		}

	}

	public static ArrayList<String> CodesGet(String ques) {

		if (ques.length() == 0) {
			ArrayList<String> br = new ArrayList<String>();
			br.add("");
			return br;
		}

		ArrayList<String> mr = new ArrayList<String>();

		// 1 digit encode call
		String roq1 = ques.substring(1);
		char ch1 = ques.charAt(0);

		ArrayList<String> rr1 = CodesGet(roq1);
		for (String val : rr1) {
			mr.add(encode1(ch1) + val);
		}
		// 2 digit encode call
		if (ques.length() >= 2) {

			String ch2 = ques.substring(0, 2);
			String roq2 = ques.substring(2);

			if (Integer.parseInt(ch2) <= 26) {
				ArrayList<String> rr2 = CodesGet(roq2);
				for (String val : rr2) {
					mr.add(encode2(ch2) + val);
				}
			}
		}
		return mr;

	}

	public static char encode1(char ch) {
		// convert from char to int
		int in = ch - '0';
		// add 96 and typecast to char
		return (char) (in + 96);
	}

	public static char encode2(String str) {
		// convert from char to int
		int in = Integer.parseInt(str);
		// add 96 and typecast to char
		return (char) (in + 96);
	}
}
