package practice;

//import java.math.*;

public class ProjectEular6 {

	private static int sum1, sum2, ans;
	public static void main(String []args)
	{
		for(int i = 1; i <= 100; ++i)
		{
			sum1 = (int) (sum1 + Math.pow(i,2));
		}
		System.out.println(": "+sum1);
		sum2 = (int) Math.pow(5050, 2);
		System.out.println(": "+sum2);
		ans = sum2 - sum1;
		System.out.println(": "+ans);
	}
}