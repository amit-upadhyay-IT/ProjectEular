package practice;

public class ProjectEular10Sol2 {

	public boolean checkPrime(long num)
	{
        if(num < 1) return false;
		if(num > 1 && num <=3)	return true;
        else if(num % 2 == 0 || num % 3 == 0) return false;
		long z = (long) Math.sqrt(num);
		for(long i = 5; i  <= z; i = i + 6)
		{
			if(num % i == 0 || num % (i+2) == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		long start = System.nanoTime();

		long sum = 0;

		ProjectEular10Sol2 obj = new ProjectEular10Sol2();

		for(long i = 5; i < 2000000; i = i + 6)
		{
			if(obj.checkPrime(i))
				sum = sum + i;
            if(obj.checkPrime(i+2))
                sum = sum + (i+2);
		}
		sum = sum + 5;
		System.out.println(": "+sum);

		long last = System.nanoTime();
		System.out.println("time : "+(last-start)/1000000+"ms");
	}
}
