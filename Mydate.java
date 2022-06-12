package study.hasA;

public class Mydate implements Comparable<Mydate> {
	public int dd, mm, yy;
	public Mydate (int dd, int mm, int yy)
	{
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Mydate)
		{
			Mydate temp = (Mydate)obj;
			if (this.dd == temp.dd && this.mm == temp.mm && this.yy ==temp.yy)
				return true;
			else return false;
		}
		else return false;
	}
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) { 
		this.dd = dd;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	public String toString()
	{
		String str = (dd + " " + mm + " " + yy);
		return str;
	}


	@Override
	public int compareTo(Mydate o) {
		if (this.year > o.year)
		return 0;
	}

}
