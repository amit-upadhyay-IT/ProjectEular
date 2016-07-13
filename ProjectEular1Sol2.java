package practice;

import java.util.Scanner;

public class ProjectEular1Sol2 {

	private static int sumOf3, sumOf5, sumToSub, sum;

	public static void main(String[] args) {
		
		System.out.println("Enter the number upto which you want to find the sum : ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i = 1; 3*i < n; i++)
		{
			sumOf3 = sumOf3 + 3*i;
		}
		for(int i = 1; 5*i < n; i++)
		{
			sumOf5 = sumOf5 + 5*i;
		}
		for(int i = 1; 15*i < n; ++i)
		{
			sumToSub = sumToSub + i*15;
		}
		sum = sumOf3 + sumOf5 - sumToSub;
		System.out.println("The sum is : "+sum);
		input.close();
	}

}
