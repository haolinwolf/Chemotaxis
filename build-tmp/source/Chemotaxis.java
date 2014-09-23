import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Chemotaxis extends PApplet {

int bX;
int bY;
int colorA;
int colorB;
int colorC;//declare bacteria variables here   

Bacteria [] colony;

 public void setup()   
 {     
 	size(400,400);//initialize bacteria variables here
  colony = new Bacteria[100];
  for(int i = 0; i < colony.length; i++) 
  {
    colony[i]= new Bacteria(200,200);
  }  
 }   
 public void draw()   
 {    
 	background(0);
  
  for(int i = 0; i < colony.length ; i++)
     {
        colony[i].move();
        colony[i].show(); //move and show the bacteria   
      }
 }  
 class Bacteria    
 {     
 	int bX, bY, colorA,colorB, colorC;//lots of java!
Bacteria (int x, int y)
{
    bX = x;
    bY = y;
   colorA = PApplet.parseInt(random(0,250));
   colorB = PApplet.parseInt(random(0,250));
   colorC = PApplet.parseInt(random(0,250));
 }   
public void move()
{
  bX += (int)(Math.random()*5)-2;
  bY += (int)(Math.random()*5)-2;
}
public void show()
{
  fill (colorA,colorB,colorC,80);
  noStroke();
  ellipse(bX,bY,10,10);
}
 }
  
  

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
