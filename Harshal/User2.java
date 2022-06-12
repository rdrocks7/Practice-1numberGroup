package study.hasA;

import java.util.Scanner;

public class User2 {
	public static void main (String [] args)
	{
		technicalBooks [] book = new technicalBooks [3];
		Scanner sc = new Scanner(System.in);
		int sum =0;
		
		for (int i=0;i<3;i++)
		{
			System.out.print("Enter the bookname:\t");
			String name = sc.nextLine();
			System.out.println();
			
			System.out.print("Enter the cost:  \t");
			double d = sc.nextDouble();
			System.out.println();
			
			System.out.print("Enter Day:\t");
			int day = sc.nextInt();
			System.out.println();
			
			System.out.print("Enter Month:\t");
			int month = sc.nextInt();
			System.out.println();
			
			System.out.print("Enter Year:\t");
			int year = sc.nextInt();
			System.out.println();
			
			Mydate temp = new Mydate (day,month,year);
			
			System.out.println("Enter how many Authors:");
			int n = sc.nextInt();
			
			String [] Authors = new String [n];
			
			for (int j=0; j<n;j++)
			{
				System.out.println("Enter the Authors name:");
				Authors [i] = sc.nextLine();
			}
			
			book [i] = new technicalBooks(name, d, temp, Authors);
			
			sc.nextLine();		// this is consuming any extra newline
		}
	
		System.out.println();
		for (technicalBooks tb : book)		//for each technical book 'tb' in books // this loop is called "for-each loop"
		{
			System.out.println(tb.getBookName() + "\t" + tb.getCost());
			sum = ((int)(sum + tb.getCost()));
			for (String s : tb.getAuthors())
			{
				System.out.print(s + " ");
			}
			System.out.println();
			
		}
		System.out.println("Your total bill = " + sum);
	}

}
