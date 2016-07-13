package practice;

import java.util.Scanner;

public class ProjectEular2 {

	private static int first, second, sum;
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = input.nextInt();
		
		first = 0; second = 1;
		int third = first + second;
		while(third < n)
		{
			if(third % 2 == 0)
			{
				sum = sum + third;
			}
			third = first + second;
			first = second;
			second = third;
		}
		System.out.println("The sum is : "+sum);
		input.close();
	}

}
