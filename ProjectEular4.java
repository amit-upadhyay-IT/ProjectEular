package practice;
import java.util.ArrayList;
import java.util.Iterator;
public class ProjectEular4 {
	
	public static boolean checkPalindrome(int num)
	{
		int rem = 0, rev = 0;
		int n = num;
		while(n != 0)
		{
			rem = n % 10;
			rev = rev*10 + rem;
			n = n / 10;
		}
		if (rev == num)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		int i, j, p = 0;
		boolean flag = false, fl = false;
		for(i = 999; i > 100; --i)
		{
			for(j = 999; j > 100 ; --j)
			{
				p = i * j;
				flag = checkPalindrome(p);
				//System.out.println(" "+ flag);
				if(flag)
					fl = al.add(Integer.valueOf(p));
			}
		}
		System.out.println("added : "+fl);
		Iterator<Integer> it = al.iterator();
		Integer max = 0;
		while(it.hasNext())
		{
			Integer e = it.next();
			//System.out.print(" "+ e);
			if(e>max)
				max = e;
		}
		System.lineSeparator();
		System.out.println(" : "+max);
	}

}
