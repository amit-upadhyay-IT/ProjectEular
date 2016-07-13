package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProjectEular1
{
	private static int sum;
	public static void main(String []args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value upto which you want to find the sum : ");
		int n = Integer.parseInt(br.readLine());
		for(int i = 1; i < n; ++i)
		{
			if((i % 3 == 0) && (i % 5 == 0))
				sum = sum + i;
			else if(i%3 == 0)
				sum = sum + i;
			else if(i % 5 == 0)
				sum = sum + i;
		}
		System.out.println("The sum is : "+sum);
	}
}