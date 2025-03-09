// Initilise variables
int vX; // Mouse X Axis
int vY; // Mouse Y Axis

float discoLightsR; // Random variable R
float discoLightsG; // Random variable G
float discoLightsB; // Random variable B

void setup() // Background etc
{
// Sky
size(900,1000);
background(27,43,64);

// Ground  
fill(118,113,113);
noStroke();
rect(0, 500, 900, 300);
// Road Stripe 1
fill(255);
rect(0,590,300,25);
// Road Stripe 2
rect(400,590,300,25);
// Road Stripe 3
rect(800,590,300,25);

// CityScape

stroke(0);
fill(144,144,144);
rect(0,100,250,400);
rect(250,200,150,300);
rect(300,125,250,375);
rect(550,150,200,350);
rect(700,250,200,250);

// Windows

noStroke();
fill(255,255,0);
// Building 1
rect(10,110,50,50);
rect(70,110,50,50);
rect(130,110,50,50);
rect(190,110,50,50);

rect(10,170,50,50);
fill(0);
rect(70,170,50,50);
rect(130,170,50,50);
fill(255,255,0);
rect(190,170,50,50);

rect(10,230,50,50);
rect(70,230,50,50);
rect(130,230,50,50);
rect(190,230,50,50);

rect(10,290,50,50);
rect(70,290,50,50);
rect(130,290,50,50);
rect(190, 290,50,50);

rect(10,350,50,50);
rect(70,350,50,50);
fill(0);
rect(130,350,50,50);
fill(255,255,0);
rect(190,350,50,50);

rect(10,410,50,50);
rect(70,410,50,50);
rect(130,410,50,50);
rect(190,410,50,50);

// Building 2
rect(260,210,30,30);
rect(260,250,30,30);
rect(260,290,30,30);
rect(260,330,30,30);
fill(0);
rect(260,370,30,30);
fill(255,255,0);
rect(260,410,30,30);

// Building 3
rect(310,140,50,50);
rect(370,140,50,50);
rect(430,140,50,50);
rect(490,140,50,50);

fill(0);
rect(310,200,50,50);
rect(370,200,50,50);
rect(430,200,50,50);
rect(490,200,50,50);
fill(255,255,0);

rect(310,260,50,50);
rect(370,260,50,50);
rect(430,260,50,50);
rect(490,260,50,50);

rect(310,320,50,50);
rect(370,320,50,50);
fill(0);
rect(430,320,50,50);
rect(490,320,50,50);
fill(255,255,0);

rect(310,380,50,50);
rect(370,380,50,50);
rect(430,380,50,50);
rect(490,380,50,50);

// Building 4
rect(560,160,50,50);
rect(620,160,50,50);
rect(680,160,50,50);

rect(560,220,50,50);
rect(620,220,50,50);
rect(680,220,20,50);
rect(680,220,50,30);

rect(560,280,50,50);
fill(0);
rect(620,280,50,50);
fill(255,255,0);
rect(680,280,20,50);

rect(560,340,50,50);
rect(620,340,50,50);
rect(680,340,20,50);

rect(560,400,50,50);
rect(620,400,50,50);
rect(680,400,20,50);

// Building 5

rect(710,260,50,50);
rect(770,260,50,50);
fill(0);
rect(830,260,50,50);
fill(255,255,0);

rect(710,320,50,50);
rect(770,320,50,50);
rect(830,320,50,50);

rect(710,380,50,50);
rect(770,380,50,50);
rect(830,380,50,50);


// Sun
fill(255,255,255);
ellipse(900,50,300,300);

// Street Lights

fill(214,214,214);
rect(150,480,50,20);
rect(165,300,20,180);
rect(165,300,50,20);
fill(255,255,255,185);
rect(195,320,20,100);

fill(214,214,214);
rect(550,480,50,20);
rect(565,300,20,180);
rect(565,300,50,20);
fill(255,255,255,185);
rect(595,320,20,100);

// Mouse
vX = mouseX;
vY = mouseY;
}

void car() // Paste setup to constantly update screen.
{
setup();
discoLightsR = random(1,255);
discoLightsG = random(1,255);
discoLightsB = random(1,255);

// Car

//  Body
stroke(1);
fill(90,90,84);
rect(vX, 380,300,100); // Main // vY  // 380
rect(vX-100, 430, 100, 50); // Front vY+50 // 430
rect(vX+300, 430, 100, 50); // Back vY+50 //430

//  Windows
stroke(1);
fill(discoLightsR, discoLightsG, discoLightsB);
rect(vX+50, 390, 50, 50); // vY+10 //
rect(vX+100, 390, 50, 50); // vY+10
rect(vX+150, 390, 50, 50); // vY+10
rect(vX+200, 390, 50, 50); // vY+10

//  Wheels
stroke(1);
fill(0);

ellipse(vX,470,69,69); //  Wheel 1 vy+110 // 470
ellipse(vX+300,470,69,69); //  Wheel 2 vY+110
fill(142,137,137);
ellipse(vX,470,39,39); //  Wheel 1 vy+110 // 470
ellipse(vX+300,470,39,39); //  Wheel 1 vy+110 // 470

//  Exhaust

fill(206,206,206);
rect(vX+400, 440, 30, 20); // vY+70 // 440

//  Random Fire Length
fill(random(230,250), random(200,250),0);
rect(vX+430, 440, random(10, 50) , 20); //vY+70 //440

// Lights
fill(255,255,255,random(0,255));
noStroke();
rect(vX-125, 440, 25, 25); //vY+60 //440

// Clouds

fill(185,185,185);
ellipse(50,50,50,50);
ellipse(90,50,50,50);
ellipse(130,50,50,50);
ellipse(70,30,50,50);
ellipse(110,30,50,50);

ellipse(250,70,50,50);
ellipse(290,70,50,50);
ellipse(330,70,50,50);
ellipse(270,50,50,50);
ellipse(310,50,50,50);

ellipse(520,50,50,50);
ellipse(560,50,50,50);
ellipse(600,50,50,50);
ellipse(540,30,50,50);
ellipse(580,30,50,50);


}


void foreground()
{
  // Foreground

fill(37,37,37);
rect(0,570,200,600);
rect(200,600,150,600);
rect(350,730,175,600);
rect(525,700,100,600);
rect(625,620,225,600);
rect(825,610,150,600);
  
}
void draw()
{
  car(); //  Call car function
  foreground(); // Foreground is shown as a separate layer to the canvas.
}
