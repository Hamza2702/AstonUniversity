// Call classes
Ball ball;
Ball ball2;
Catcher catcher;

void setup() 
{
  size(800, 600);
  rectMode(CENTER);
  // Assign
  catcher = new Catcher(1, 140, 20);
  ball = new Ball(2, 30);
  ball2 = new Ball(2, 30);
}

void draw() 
{
  background(0);
  catcher.showScore();  // display the score at the top of the screen
  catcher.displayCatcher();  // call the function to display the catcher
  catcher.checkCaught(ball);  // check if the ball is touching the catcher
  catcher.moveCatcher();  // call the function to move the catcher
  catcher.checkCaught(ball2);  // check if the ball is touching the catcher
  ball.displayBall(); // call the function to display the ball
  ball.moveBall(); // call the function to move the ball
  ball2.displayBall(); // call the function to display the ball
  ball2.moveBall(); // call the function to move the ball
}


void keyPressed() 
{
  if (key == 'z' || key == 'x' || key == 's') 
  {
    catcher.catcherControl = key;  // z, x, and s keys control movement
  }
}
