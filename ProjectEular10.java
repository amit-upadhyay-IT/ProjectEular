package practice;

public class ProjectEular10 {

	public boolean checkPrime(long num)
	{
		if(num <= 1)	return false;
		long z = (long) Math.sqrt(num);
		for(long i = 2; i  <= z; i = i + 1)
		{
			if(num % i == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		long start = System.nanoTime();
		
		long sum = 0;
		
		ProjectEular10 obj = new ProjectEular10();
		
		for(long i = 3; i < 2000000; i = i + 2)
		{
			if(obj.checkPrime(i))
				sum = sum + i;
		}
		sum = sum + 2;
		System.out.println(": "+sum);
		
		long last = System.nanoTime();
		System.out.println("time : "+(last-start)/1000000+"ms");
	}
}
