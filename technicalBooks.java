package study.hasA;

import java.util.Arrays;

public class technicalBooks {
	private String bookName;
	private double cost;
	//HASA refernce of Mydate
	private Mydate dateofpublication;
	// HASA reference of Array
	private String [] Authors;
	
	public technicalBooks ()
	{
		
	}
	public technicalBooks (String bookName, double cost, Mydate dateofpublication, String [] Authors)
	{
		this.bookName = bookName;
		this.cost = cost;
		this.dateofpublication = dateofpublication;
		this.Authors= Authors;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof technicalBooks)
		{
			technicalBooks temp = (technicalBooks)obj;
			if (this.bookName.equals(temp.bookName) && this.cost == temp.cost && this.dateofpublication.equals(temp.dateofpublication) && Arrays.deepEquals(this.Authors, temp.Authors))
			
				return true;
				else 
					return false;
			
		}
		else
			return false;
	}
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Mydate getDateofpublication() {
		return dateofpublication;
	}

	public void setDateofpublication(Mydate dateofpublication) {
		this.dateofpublication = dateofpublication;
	}

	public String[] getAuthors() {
		return Authors;
	}

	public void setAuthors(String[] authors) {
		Authors = authors;
	}
	

}
