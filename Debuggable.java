package Practical;



abstract class Debuggable {
 void dump() 
		{
			System.out.println("debuggable error: no dump() defined for the class"); 
			} 
	public static void main(String arg[])
	{ 
		X x =new X(1,2,3); 
		Y y=new Y(2,4,5); 
		Z z=new Z(7,8,9); 
		x.dump(); 
		y.dump(); 
		z.dump(); 
	}
	

		} 
	class X extends Debuggable
	{
		private int a,b,c; 
		public X( int aa ,int bb,int cc) 
			{ 
			a = aa; 
			b = bb;
			c = cc;
		     }
		void dump() 
		{ 
			System.out.println( "a = " + a +" b=" +b+ " c=" +c); 
			} 
		} 
	class Y extends Debuggable
	{ 
		private int i,j,k;
		public Y( int ii ,int jj,int kk)
		{ 
			i = ii; j = jj; k = kk;
			} 
		void dump() 
		{ 
			System.out.println( "i = " + i +" j=" +j+ " k=" +k);
			} 
		} 
	class Z extends Debuggable{
		private int p,q,r; 
	public Z( int pp ,int qq,int rr)
	{
		p = pp; q = qq; r = rr;
		} 
	void dump() 
	{ 
		System.out.println( "p = " + p +" q=" +q+ " r=" +r);
		} 
	} 
	
	

