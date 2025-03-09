float ballX;
float ballY;
float ballWidth;
float speedX;
float speedY;

float holeX;
float holeY;
float holeWidth;

char k;

void setup()
{
  size(600,600);
  k = 'S';
  // Reset ball parameters, position and size
  ballX = 10;
  ballY = height/2;
  ballWidth = 60;
  // Initialize Speed to random values
  initializeSpeed();
  initializeHole();
}

void draw()
{
  background(127);
  // Draw the ball
  drawColourCircle(ballX, ballY, ballWidth, color(255, 0, 0));
  // Move the ball
  moveBall();
  // Check for collision 
  if (checkCollide(ballX, ballY, holeX, holeY, ballWidth, holeWidth)) 
  {
    initializeHole();
    initializeSpeed();
  }
  // Bounce the ball (when necessary)
  bounceBall();
  // Black Hole
  drawColourCircle(holeX, holeY, holeWidth, color(0));
}


void initializeSpeed()
{
 speedX = random(5,10);
 speedY = random(5,10);
}

void drawColourCircle(float x, float y, float diameter, color c) 
{
  fill(c); // Set the fill color to the specified color
  ellipse(x, y, diameter, diameter); // Draw the circle with the given parameters
}


void moveBall()
{
  ballX += speedX;
  ballY += speedY;
}

void bounceBall() 
{
  if (ballX + ballWidth/2 >= width) 
  {
    ballX = width - ballWidth/2;
    speedX = -speedX;
  } 
  else if (ballX - ballWidth/2 <= 0) 
  {
     ballX = ballWidth/2;
     speedX = -speedX;
  }
  
  if (ballY + ballWidth/2 >= height) 
  {
    ballY = height - ballWidth/2;
    speedY = -speedY;
  } 
  else if (ballY - ballWidth/2 <= 0) 
  {
    ballY = ballWidth/2;
    speedY = -speedY;
  }
}


void initializeHole()
{
 holeX = random(0, width);
 holeY = random(0, height);
 holeWidth = random(100,300);
}

float distance(float x1, float y1, float x2, float y2)
{
  float side1 = x1 - x2;
  float side2 = y1 - y2;
  float distance = sqrt((side1 * side1) + (side2 * side2));
  return distance;
}

Boolean checkCollide(float x1, float y1, float x2, float y2, float diameter1, float diameter2)
{
  float r1 = diameter1/2;
  float r2 = diameter2/2;
  float d = distance(x1, y1, x2, y2);
  
  Boolean check = d <= r1 + r2; // Return boolean
  return check;
}

void keyPressed()
{
  if (key == 'x') {
    speedX = random(5, 10);
    print("x");
  } else if (key == 'y') {
    speedY = random(5, 10);
    print("y");
  }
}
