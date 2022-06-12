//Q. Reverse words in string 
// or Reverse of character array
//eg.  This is demo class
//ans- siht si omed ssalc

public class ArrayMain {

	public static void main(String[] args) 
	{
		String str="This is demo class";
		System.out.println("String is : " +str);
		
		char ch[]=new char[str.length()];
		
		for(int i=0;i<str.length();i++)
		{
			ch[i]=str.charAt(i);
		}
		
		reverseWords(ch,0,ch.length-1);
		
		String s="";
		for(int i=0;i<ch.length;i++) {
			s+=ch[i];
		}
		
		System.out.println(s);
	}//end of main

	public static void reverse(char str[],int start,int end)
	{
		char tmp;
		while(start<=end)
		{
			tmp=str[start];
			str[start]=str[end];
			str[end]=tmp;
			start++;
			end--;
		}
		
		//char array or word ko swap karke reverse kiya
		/*
		for(start=0,end=str.length;start<=end;start++,end--)
		{
			tmp=str[start];
			str[start]=str[end];
			str[end]=tmp;
		}*/
	}

	
	public static void reverseWords(char str[],int start,int end)
	{
		//w_start and w_end har ek word ke start and end hai
		int w_start,w_end;
		for(w_start=w_end=start;w_end<end;w_end++)  //this is demo class
		{
			//agar space mila to
			if(str[w_end]==' ')
			{
				continue;
			}		
			
			w_start=w_end;
			while(str[w_end]!=' ' && w_end<end) //0->t,1->h,2->i,3->s,4->space yeil so break hote ithe
			{
				w_end++; //1,2,3,4
			}
			
			//agar w_end bichme kahi to ya end me aajaye
			//to ek jagah se pehle lana hoga....
			//warna space count hoga ya terminate hojayega
			//and last word lega hi nhi
			
			
			//but here we dont want space while reversing so w_end-1
			if(w_end!=end)
			{
				w_end--;
			}       //this  0     3
			reverse(str,w_start,w_end);
		}
	}
	
}//end of class
