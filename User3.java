package study.hasA;

import java.util.Scanner;

	public class User3 {
		public static void main (String [] args)
		{
			technicalBooks [] book = new technicalBooks [3];
			Scanner sc = new Scanner(System.in);
			int sum =0;
			
			for (int i=0;i<3;i++)
			{
				System.out.println("Enter the bookname:\t");
				String name = sc.nextLine();
				System.out.println();
				
				System.out.println("Enter the cost:  \t");
				double d = sc.nextDouble();
				System.out.println();
			//----------------------------------------------Getting Date-----------------------------------------------//
				System.out.println("Enter the date in dd-mm-yyyy format:");
				String st = sc.next();
				
				String [] date = st.split("-");
				
				Mydate temp = new Mydate (Integer.parseInt(date[0]) , Integer.parseInt(date[1]) , Integer.parseInt(date[2]));
				System.out.println(temp.getDd() + "-"+ temp.getMm() + "-" + temp.getYy());
				
			// -----------------------------------------------Getting Authors----------------------------------------------//
				System.out.println("Enter the  Authors with , in between them:");
				String str = sc.nextLine();
				
				String [] Authors = str.split(",");
				
				for (String author : Authors)
				{
					System.out.println(author);
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
