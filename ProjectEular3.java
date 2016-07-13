package practice;

import java.util.Scanner;

class CheckPrime
{
	private boolean flag = true ;
	public boolean check(long n)
	{
		int f = 2;
		while(f < n/2)
		{
			if(n % f == 0)
				flag = false;
			f++;
		}
		return flag;
	}
}

public class ProjectEular3 {
	
	private static long value;

	public static void main(String[] args) {
		
		CheckPrime cp = new CheckPrime();
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter n : ");
		long n = input.nextLong();
		for(long i = (n+1)/2 ; i > 1; i--)
		{
			if(n % i == 0)
			{
				if(cp.check(i))
				{
					value = i;
					break;
				}
			}
		}
		System.out.println(" : "+value);
		input.close();
	}

}
