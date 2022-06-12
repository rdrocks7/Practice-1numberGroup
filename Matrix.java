import java.util.Scanner;
public class Matrix 
{
	int mat[][];
	Matrix(int r,int c)
	{
		mat=new int[r][c];
	}
	
	Scanner sc  =new Scanner(System.in);
	
	public void scan_array()
	{
		System.out.println("Enter array elements :");
		for (int i = 0; i < mat.length; i++) 
		{
			for (int j = 0; j <mat[i].length; j++) 
			{
				mat[i][j]=sc.nextInt();
			}
		}
	}
	
	/*public Matrix add(Matrix m)
	{
		Matrix res=new Matrix(3,3);
		for (int i = 0; i < mat.length; i++) 
		{
			for (int j = 0; j <mat[i].length; j++) 
			{
				res.mat[i][j]=mat[i][j]+m.mat[i][j]; 
			}
			
		}
		return res;
	}*/
	
	public static Matrix AdditionOfMatrix(Matrix m1, Matrix m2)
	{
		Matrix res=new Matrix(3,3);
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				res.mat[i][j]=m1.mat[i][j]+m2.mat[i][j]; 
			}
		}
		return res;
	}
	
	public Matrix multi(Matrix m)
	{
		Matrix mul=new Matrix(3,3);
		for (int i = 0; i < mat.length; i++) 
		{
			for (int j = 0; j <mat[i].length; j++) 
			{
				for (int k = 0; k <mat[i].length; k++) 
				{
				mul.mat[i][j]=mul.mat[i][j]+mat[i][k]*m.mat[k][j]; 
				}
			}
			
		}
		return mul;
	}
	

	public String toString()
	{
		String str="";
		for (int i = 0; i < mat.length; i++) 
		{
			for (int j = 0; j <mat[i].length; j++) 
			{
				str = str+mat[i][j]+"	"; 
			}
			str=str+"\n";
		}
		return str;
	}
}
