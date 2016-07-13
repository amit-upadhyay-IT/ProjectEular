package practice;

public class ProjectEular5 {

	public long mainNumber()
	{
	    long number = 3;
	    while(true)
	    {
	        boolean flag = true;
	        for(int i = 2; i <= 20; i++) {
	            if(number % i != 0) {
	                flag = false;
	                break;
	            }
	        }
	        if(flag) break;
	        else number++;
	    }
	    return number;
	}

	public static void main(String[] args)
	{
		long start = System.nanoTime();
	    ProjectEular5 result =new ProjectEular5();
	    System.out.println("The Smallest Multiple: " + result.mainNumber());
	    long stop = System.nanoTime();
	    System.out.println("Time : "+(stop - start)/1000000+"ms");
	}
}
