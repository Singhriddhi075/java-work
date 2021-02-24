package Assignment5;

import java.util.Scanner;

public class any2any {
    static int anyToDecimal(int x,int sbs)
	{
		int mult=1;
		int ans=0;
		while(x!=0)
		{
			int rem=x%10;
			ans+=(rem*mult);
			mult=mult*sbs;
			x/=10;
		}
		return ans;

	}

	static int DecimalToAny(int x,int dbs)
	{
		int mult=1;
		int ans=0;
		while(x!=0)
		{
			int rem=x%dbs;
			ans+=(rem*mult);
			mult=mult*10;
			x/=dbs;
		}
		return ans;
	}


    public static void main(String args[]) {

        Scanner obj=new Scanner(System.in);
		int sb=obj.nextInt();
		int db=obj.nextInt();
		int sn=obj.nextInt();
		
		if(db==10)
		{
			int ans=anyToDecimal(sn,sb);
			System.out.println(ans);
		}
		
		else
		{
			int temp=anyToDecimal(sn,sb);
			//System.out.println(temp);
			int ans=DecimalToAny(temp,db);
			System.out.println(ans);
		}


    }
}