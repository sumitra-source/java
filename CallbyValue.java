package Practical;


public class CallbyValue{
	     void meth(int i, int j)   
	     {      
	    	 i *=2;   
	    	 j /=2;     
	    	 } 
	      

	public static void main (String args[]) 
	{   
		CallbyValue ob = new CallbyValue();   
		int a =15, b = 20;     
		System.out.println ("Before call  :a = "+ a +" b ="  + b);   
		ob.meth(a, b );   
		System.out.println ("After call :a = " + a+" b = "+  b ); 
		} 
	}  


