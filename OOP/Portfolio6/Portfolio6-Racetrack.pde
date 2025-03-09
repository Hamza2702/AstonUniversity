RaceTrack track; //<>//
boolean raceOver;
Car[] cars;
Car car;
int y;
float r;
float g;
float b;
Boolean checkWinner;

void setup() {
  size(1000, 600);
  track = new RaceTrack();
  raceOver = false;
  cars = new Car[14];
  for (int i = 0; i < cars.length; i++){
    y += 40;
    r = random(0,255);
    g = random(0,255);
    b = random(0,255);
    cars[i] = new Car(track.getStartPosition(), y, 60, color(r, g, b));
  }
}

void draw() {
  background(70);
  track.display();
  for (int i = 0; i < cars.length; i++){
    cars[i].display();
    if (!raceOver) {
      if (cars[i].getPosition() >= track.getFinishPosition()) {
        checkWinner = true;
        raceOver = true;
        if (checkWinner){
          cars[i].detectOneWinner();
        }
        println("Press 's' to restart");
      } else {
        cars[i].move();
      }
    }
  }
}

void keyPressed() {
  if (key == 's' && raceOver) {
    float startLine = track.getStartPosition();
    for (int i = 0; i < cars.length; i++){
      cars[i].setPosition(startLine);
      raceOver = false;
    }
  }
}
