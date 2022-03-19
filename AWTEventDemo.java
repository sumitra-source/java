package Practical;

import java.awt.*; 
import java.applet.*;  
public class AWTEventDemo extends Applet 
{   
   private String message = "Waiting for events . . .";   
        
public AWTEventDemo ( )   
{    
                      
super ( );      
  }     

 public void init ( )
 {     
 setBackground(Color.white );        
   }              
     public void paint ( Graphics  g) 
     {   
         g.setColor( Color.blue );         
   g.drawString (message, 0, size ( ).height-10);    
      }         
  
    public boolean mouseEnter (Event evt, int x, int y)     
    {           
  message = "ouseEnter– x:" + x +" Y:"+ y;            
   repaint();                  
       return true;        
 }       
public boolean mouseExit (Event evt, int x, int y)         {        
 message = "mouseOut – x : " + x + "y :" + y;         
  repaint();                 
    return true;       }   
   public boolean mouseMove (Event evt, int x, int y)   
   { 
        
   return true ; 
} }
