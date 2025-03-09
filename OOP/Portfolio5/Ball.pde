class Ball
{
  // ball variables
  private float ballX; // x coordinate of the ball
  private float ballY; // y coordinate of the ball
  private float ballSpeed; // speed of movement of the ball
  private float ballWidth; // the diameter of the ball
  
  public Ball(float bSpeed, float bWidth)
  {
    ballX = random(0, width); // ball random position
    ballY = 0; // at the top of the canvas
    ballSpeed = bSpeed; // ball moves faster than the catcher 2
    ballWidth = bWidth; // diameter of the ball 30
  }
  
  public void displayBall() 
  {
    fill(0, 0, 255);
    circle(ballX, ballY, ballWidth);
  }
  
  public void moveBall() 
  {
    ballY = (ballY + ballSpeed); // ball moves down slowly
    if (ballY >= height) 
    { // ball at the bottom of the canvas
      resetBall();
    }
  }
  
  public void resetBall() 
  {
    ballY = 0; // ball starts again at top
    ballX = random(0, width); // in a random position
  }

  public float getX()
  {
    return ballX;
  }
  
  public float getY()
  {
    return ballY;
  }
  
  public float getWidth()
  {
    return ballWidth;
  }
}
