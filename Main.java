
public class Main 
{
	public static void main(String[] args) 
	{
		Matrix m1=new Matrix(3,3);	
		m1.scan_array();
		Matrix m2=new Matrix(3,3);	
		m2.scan_array();
		
		Matrix res=new Matrix(3,3);
		Matrix mul=new Matrix(3,3);
		//res=m1.add(m2);
		Matrix.AdditionOfMatrix(m1,m2);
		mul=m1.multi(m2);
		System.out.println("Matrix m1 :\n"+m1);	
		System.out.println("Matrix m2 :\n"+m2);
		System.out.println("Addition :\n"+res);	
		System.out.println("Multiplication :\n"+mul);	
	}
}
 