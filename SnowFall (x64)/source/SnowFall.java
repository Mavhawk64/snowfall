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

public class SnowFall extends PApplet {

Snow [] snowy = new Snow[10000];

public void setup()
{
  //size(800, 701);
  
  for(int i = 0; i < snowy.length; i++)
  {
   snowy[i] = new Snow(); 
  }
}

public void draw()
{
  //background(0); //black
  background(0xffcccccc); //gray
  translate(width/2, height/2);
  for(int i = 0; i < snowy.length; i++)
  {
   snowy[i].update();
   snowy[i].show();
  }
}
class Snow
{
  float x;
  float y;
  float z;

Snow()
{
  x = random(-width, width);
  y = random(-height, height);
  z = random(width);
}

public void update()
{
  z = z - 8; //falling speed = 8 is gravity for example
  if(z < 1)
  {
    z = width;
    x = random(-width, width);
    y = random(-height, height);
  }
}

public void show()
{
 fill(255);
 noStroke();
 
 float sx = map(x/z, 0, 1, 0, width);
 float sy = map(y/z, 0, 1, 0, height);
 ellipse(sx, sy, 8, 8);
}
}
  public void settings() {  fullScreen(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--present", "--window-color=#666666", "--hide-stop", "SnowFall" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
