int bX;
int bY;
int colorA;
int colorB;
int colorC;//declare bacteria variables here   

Bacteria [] colony;

 void setup()   
 {     
 	size(400,400);//initialize bacteria variables here
  colony = new Bacteria[100];
  for(int i = 0; i < colony.length; i++) 
  {
    colony[i]= new Bacteria(200,200);
  }  
 }   
 void draw()   
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
   colorA = int(random(0,250));
   colorB = int(random(0,250));
   colorC = int(random(0,250));
 }   
void move()
{
  bX += (int)(Math.random()*5)-2;
  bY += (int)(Math.random()*5)-2;
}
void show()
{
  fill (colorA,colorB,colorC,80);
  noStroke();
  ellipse(bX,bY,10,10);
}
 }
  
  
