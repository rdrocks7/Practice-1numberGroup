package study.hasA;

public class User {
	public static void main (String [] args)
	{
		technicalBooks b1 = new technicalBooks ();
		b1.setBookName ("Core Java Unplugged");
		b1.setCost(400);
		b1.setDateofpublication (new Mydate (12,12,2012));
		b1.setAuthors(new String [] {"Srinivas", "Janhavi", "Prachi"});
		
		technicalBooks b2 = new technicalBooks ("Thinking in Java", 530, new Mydate (12,07,2004), new String [] {"Rudraksha", "Pankaj"});
		System.out.println("Year of Publication of " + b1.getBookName() + " = " + b1.getDateofpublication()  );
		System.out.println("Number of Authors of "+ b2.getBookName()+ " = "+ b2.getAuthors().length);
		System.out.println("Total cost of both books = " + (b1.getCost() + b2.getCost()));
	}

}
