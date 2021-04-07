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

void update()
{
  z = z - 8; //falling speed = 8 is gravity for example
  if(z < 1)
  {
    z = width;
    x = random(-width, width);
    y = random(-height, height);
  }
}

void show()
{
 fill(255);
 noStroke();
 
 float sx = map(x/z, 0, 1, 0, width);
 float sy = map(y/z, 0, 1, 0, height);
 ellipse(sx, sy, 8, 8);
}
}
