package practice;

public class ProjectEular12 {
	
	public static long countFactor(long n)
	{
		long counter = 0;
		for(long i = 2; i < (n+1)/2; ++i)
		{
			if(n % i == 0)
				counter++;
		}
		return (counter+2);
	}

	public static void main(String[] args) {
		long tn = 0, n = 1;
		while(true)
		{
			tn = ((n)*(n+1))/2;
			n++;
			if(countFactor(tn) > 300)
			{
				break;
			}
		}
		System.out.println(": "+n);
	}
}
