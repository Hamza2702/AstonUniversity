class Car {
  private float x;
  private float y;
  private color clr;
  private float theSize;
  private int score; // Add a score variable

  public Car(float xp, float yp, float size, color c) {
    theSize = size;
    setPosition(xp);
    y = yp;
    clr = c;
    score = 0; // Initialize the score to 0
  }

  public void display() {
    // Offset to draw the wheels
    float wheelOffset = theSize / 4;
    rectMode(CENTER);
    // Draw the chassis
    stroke(0);
    fill(clr);
    rect(x, y, theSize, theSize/2);
    // Draw the wheels
    fill(0);
    rect(x - wheelOffset, y - wheelOffset, wheelOffset, wheelOffset/2);
    rect(x + wheelOffset, y - wheelOffset, wheelOffset, wheelOffset/2);
    rect(x - wheelOffset, y + wheelOffset, wheelOffset, wheelOffset/2);
    rect(x + wheelOffset, y + wheelOffset, wheelOffset, wheelOffset/2);
    fill(255);
    textSize(25);
    text(score, x-5, y+7); // Display the score in the center of the car's chassis
  }

  public void move() {
    x = x + random(0, 10);
  }
  
  public void increaseScore() {
    score += 1; // Increment the score when the car wins
  }
  
  public void detectWinners(){
    for (int i = 0; i < cars.length; i++){
     if (cars[i].getPosition() >= track.getFinishPosition()){
      cars[i].increaseScore(); 
     }
    }
  }
  
  public void detectOneWinner() {
    float[] carPositions = new float[cars.length];
  
    // Get pos of all cars
    for (int i = 0; i < cars.length; i++) {
      carPositions[i] = cars[i].getPosition();
    }
  
    // Find pos of two furthest cars
    int firstIndex = 0;
    int secondIndex = 0;
  
    for (int i = 1; i < carPositions.length; i++) {
      if (carPositions[i] > carPositions[firstIndex]) {
        secondIndex = firstIndex;
        firstIndex = i;
      } else if (carPositions[i] > carPositions[secondIndex]) {
        secondIndex = i;
      }
    }
    
    cars[firstIndex].increaseScore();
  }
  
  public float getPosition() {
    // Return the X position of the front of the car
    return x + theSize/2;
  }
  
  public void setPosition(float newPos) {
    x = newPos - theSize/2;
  }
}
