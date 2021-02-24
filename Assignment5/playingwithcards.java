package Assignment5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class playingwithcards {

	
	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int q=scn.nextInt();
		
		Stack<Integer> stack1=new Stack<>();
		Stack<Integer> stack2=new Stack<>();
		Stack<Integer> stack3=new Stack<>();
		for(int i=0;i<n;i++)
		{
			stack1.push(scn.nextInt());
		}
		ArrayList<Integer> prime=SOE(1000000);

		 for(int i = 0 ; i < q; i++)
		    {
		        if(stack1.empty())
		            break;
		        int cur = prime.get(i);
		        while(!stack1.empty())
		        {
		            int ele = stack1.peek();
		            stack1.pop();
		            if(ele%cur == 0)
		            {
		                stack2.push(ele);
		            }
		            else
		            {
		                stack3.push(ele);
		            }
		        }
		        while(!stack2.empty())
		        {
		        	
		            System.out.println(stack2.peek());
		            stack2.pop();
		        }
		       
		        stack1=stack3;
		        while(!stack3.empty())
		            stack3=new Stack<>();
		        
		    }
		    while(!stack1.empty())
		    {
		        System.out.println(stack1.peek());
		        stack1.pop();
		    }
	}
	
	public static ArrayList<Integer> SOE(int n)
	{
		ArrayList<Integer> list=new ArrayList<>();
		boolean[] primes= new boolean[n+1];
		Arrays.fill(primes, true);
		primes[0]=false;
		primes[1]=false;
		
		for(int table=2;(table *table)<=n; table++)
		{
			if(primes[table]==false)
			{
				continue;
			}
			
			for(int multi=2;(table*multi)<=n;multi++)
			{
				primes[table*multi]=false;
			}
		}
		
		for(int i=2;i<=n;i++)
		{
			if(primes[i])
				list.add(i);
		}
		return list;
		
	}


}