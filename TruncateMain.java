import java.util.Scanner;

//Q. Remove extra spaces from given string
//   eg. "this   is a  demo  class"
//   ans-> "this is a demo class"


public class TruncateMain 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string:");
		String str = sc.nextLine();

		int cntspace=0;
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i)!=' '))
			{
				System.out.print(str.charAt(i));
				cntspace=0;
			}

			else if(str.charAt(i)==' ' && cntspace==0)
			{
				System.out.print(str.charAt(i));
				cntspace++;
		   }
		}
	}
}
