boolean stop;

int button1X;
int button1Y;
int button1W;
int button1H;

int button2X;
int button2Y;
int button2W;
int button2H;

void setup() {
  size(750,800);
  background(87);
  noStroke();
  fill(127);
  rect(0,200,750,400);
  
  // Traffic Light stripes
  fill(255);
  rect(50,250,50,300);
  rect(150,250,50,300);
  rect(250,250,50,300);
  rect(350,250,50,300);
  rect(450,250,50,300);
  rect(550,250,50,300);
  rect(650,250,50,300);
  
  // Button 1
  button1X = 25;
  button1Y = 125;
  button1W = 100;
  button1H = 100;
  
  // Traffic Light 1
  
  fill(55);
  rect(button1X,button1Y,button1W,button1H);
  fill(75);
  rect(35,225,80,15);
  fill(255);
  textAlign(CENTER);
  textSize(25);
  text("WALK", 75,180);
 
  
  // Button 2
  button2X = 625;
  button2Y = 575;
  button2W = 100;
  button2H = 100;
  
  // Traffic Light 2
  
  fill(55);
  rect(button2X,button2Y,button2W,button2H);
  fill(75);
  rect(635,560,80,15);
  fill(255);
  textAlign(CENTER);
  textSize(25);
  text("WALK", 675,625);
  
  stop = true;
}

void draw() {
  // Draw rectangles to stop words from overlapping.
  fill(55);
  rect(25, 125, 100, 100);
  rect(625, 575, 100, 100);
  
  if (stop) {
    fill(0,255,0); // Green
    rect(35,225,80,15); // 1
    rect(635,560,80,15); // 2
    text("WALK", 75,180); // 1
    text("WALK", 675,625); // 2
  } else {
    fill(255,0,0); // Red
    rect(35,225,80,15); // 1
    rect(635,560,80,15); // 2
    text("STOP", 75,180); // 1
    text("STOP", 675,625); // 2
  }
}

void mousePressed() {
  if ((mouseX > button1X && mouseX < (button1X + button1W)) && (mouseY > button1Y && mouseY < (button1Y + button1H))) {
    stop = !stop; // Button 1 pressable
  } else if ((mouseX > button2X && mouseX < (button2X + button2W)) && (mouseY > button2Y && mouseY < (button2Y + button2H))) {
    stop = !stop; // Button 2 pressable
  }
}

// Original code

//// Implement a stop/walk traffic sign
//boolean stop;

//void setup(){
//  size(800,800);
//  stop = true;
//}

//void draw() {
//  fill(0);
//  textAlign(CENTER);
//  textSize(50);
//  if (stop) {
//    background(0,255,0);
//    text("WALK", width/2, height/2);
//  } else {
//    background(255,0,0);
//    text("STOP", width/2, height/2);
//  }
//}

//void mousePressed() {
//  stop = !stop;
//}
