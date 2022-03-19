package Practical;

public class CallByRef {
	 int a, b;   
	CallByRef(int i, int j)    
	 {        
		 a  = i;     
		 b  = j;     
		 }
	 void meth(CallByRef o) 
     { 
		 o.a *=2;    
		 o.b /= 2;
		 }

	public static void main (String args[])  
	{ 
	  CallByRef ob = new CallByRef(15,20);
		System.out.println("Before call :ob.a  = "+ob.a+" ob.b "+ob.b); 
		ob.meth (ob);
		System.out.println("After call :ob.a = "+ob.a+" ob.b  "+ ob.b);    
		} 
	}


