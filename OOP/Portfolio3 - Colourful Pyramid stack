int numRows;
int rowLength;
int startX;
int startY;
int rectWidth;
int rectHeight;
boolean isColour;

float r;
float g;
float b;

void setup() 
{
  size(900, 400);
  stroke(0);
  numRows = 1;
  rowLength = 10;
  startX = 50;
  startY = 350;
  rectWidth = 75;
  rectHeight = 30;
  isColour = false;
}

void draw() {
  background(255);
  
  for (int row = 0; row < numRows; row++) // Row
  {
    float posX = startX + (row * rectWidth/2), posY = startY - (row * rectHeight); // X position into width/2 | Get the next row's height
    rowLength = 10 - row;
    for (int col = 0; col < rowLength; col++) // Individual columns
    {
      rect(posX, posY, rectWidth, rectHeight); // Rectangle with pos X and Y
      posX += rectWidth; // Increase rectangle position
    }
    delay(0); // Used to debug (500)
  }
  
}

void mousePressed() {
  if (numRows < 10) // number of rows
  {
    numRows += 1;
    print(" " + numRows + " |"); // Debug
  } else if (numRows >= 10)
  {
    numRows = 0;
    if (numRows == 0)
    {
      isColour = !isColour; // Invert colour variable
    }
      if (isColour) // Check if colour or not. 
  {
     r = random(1,255);
     g = random(1,255);
     b = random(1,255);
      
     fill(r,g,b); // Colourful
  } else
  {
    fill(255); // White
  }
    print(isColour); // Debug
  }
}
