package Practical;

abstract class AbstractClass {
       abstract void callme();      
       void callmetoo()   
       {    
    	   System.out.println ("This is a concrete method . ");  
    	   }  
       public static void main (String args[])  
       {      
      	 B b  = new B();  
      	 b.callme();      
      	 b.callmetoo();   
      	 } 
}
class B extends  AbstractClass   
{
	void callme() 
	{   
		System.out.println ("B’ s implementation of callme.");  
		}    
	}