package Practical;

import java.awt.*; 
import java.applet.*;
 public class CanvasApplet extends Applet {  
 public void init( )  {   
  DrawingRegion region = new DrawingRegion ( ); 
  add(region); 
 } } 
class DrawingRegion extends Canvas { 
 public DrawingRegion()  {  
 setSize(150,150);  } 
  public void paint (Graphics g)  {
     g.drawRect(0,0,149,149); //draw border around region   
  g.drawString("A 150 x 150 Canvas", 20,20);  
 } }
