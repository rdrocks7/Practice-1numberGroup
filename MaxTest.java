class MaxTest
{
   void max(int x,int y)
   {
       if(x>y)
	   {
	    System.out.println("largest number among two numbers is x:"+x);
	   }
	   else
	   {
	   System.out.println("largest number among two numbers is y:"+y);
	   }
   }

    void max(int x,int y,int z)
   {
       if(x>y&&x>z)
	   {
	    System.out.println("largest number among three numbers is x:"+x);
	   }
	   else if(y>x&&y>z)
	   {
	   System.out.println("largest number among three numbers is y:"+y);
	   }
	   else 
	   {
	   System.out.println("largest number among three numbers is z:"+z);
	   }
   }




}