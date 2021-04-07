Snow [] snowy = new Snow[10000];

void setup()
{
  //size(800, 701);
  fullScreen();
  for(int i = 0; i < snowy.length; i++)
  {
   snowy[i] = new Snow(); 
  }
}

void draw()
{
  //background(0); //black
  background(#cccccc); //gray
  translate(width/2, height/2);
  for(int i = 0; i < snowy.length; i++)
  {
   snowy[i].update();
   snowy[i].show();
  }
}
