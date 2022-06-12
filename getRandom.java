package study.utility;

import java.util.Random;
public class getRandom {
	public static void main (String [] args)
	{
		Random r = new Random ();
		int x = r.nextInt(119);
		System.out.println(x);
	}
	
	

}
