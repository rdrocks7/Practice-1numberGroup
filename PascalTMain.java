//Q. Pascal Triangle
/*
1
1	1
1	2	1
1	3	3	1
1	4	6	4	1
1	5	10	10	5	1
1	6	15	20	15	6	1
 */
//1. All elements of column 0 are 1
//2. All the elements of which row and col are same,are 1
//3. Any other element can be obtained by adding two elements of previous row
// a[row][col]=a[row-1][col-1] + a[row-1][col]

//take no of rows from the user

import java.util.*;
public class PascalTMain 
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows and columns :");
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for (int j = 0; j <=i; j++) 
			{
				if(j==0 || i==j)
				{
					a[i][j]=1;
				}
				else
				{
					a[i][j]=a[i-1][j-1] + a[i-1][j];
				}
				System.out.print(a[i][j]+"	");
			}
			System.out.println();
		}
		
		/*for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				System.out.print(a[i][j]+"	");
			}
			System.out.println();
		}*/
	}

}//end of class