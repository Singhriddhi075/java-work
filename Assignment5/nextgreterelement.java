package Assignment5;

import java.util.Scanner;
import java.util.Stack;

public class nextgreterelement {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n=scn.nextInt();
		int[] arr = new int[n];
		for (int j = 0; j < n; j++) {
			arr[j] = scn.nextInt();
			
		}
        Stack<Integer> stack = new Stack<>(); // generic function
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] > stack.peek()) {
                int rv = stack.pop();
                System.out.println(rv + "->" + arr[i]);
            }
            stack.push(i);  // Corrected this line
        }
        while (!stack.isEmpty()) {
            int rv = stack.pop();
            System.out.println(rv + "->" + "-1");
        }
    }

}
