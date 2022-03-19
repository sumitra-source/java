package Practical;

public class Room {
	    int roomNo;   
	    String roomType;    
	    float roomArea;      
	    boolean acMachine;    
	    void setData(int rno, String rt, float area, boolean ac) 
	    {    
	    	roomNo = rno;  
	    	roomType = rt;  
	    	roomArea = area;   
	    	acMachine = ac;      
	    	}  
	    void displayData()  
	    {  
	    	System.out.println("Room #. Is "  + roomNo);  
	    	System.out.println ("Room Type is " + roomType); 
	    	System.out.println ("Room area is "   + roomArea); 
	    	String s = (acMachine)  ? "yes " : "no "; 
	    	System.out.println ("A/c Machine needed "  + s);    
	    	} 
	    public static void main(String arg[]) 
	    {        
	    	Room room1 = new Room ( );   
	    	room1. setData (101, "Philips", 240.0f, true);         
	    	room1.displayData ( );  
	    	} 
	    } 


