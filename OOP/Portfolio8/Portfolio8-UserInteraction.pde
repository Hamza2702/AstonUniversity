String[] styleNames = {"Dark", "Light", "Red", "Blue"};
String txt = "Lorem ipsum dolor sit amet, consectetur adipiscing elit,\nsed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
StyleCollection styles;
Style currentStyle;
Button[] buttons;

void setup() {
  size(800, 800);
  setupStyles();
  setupButtons();
}

void draw() {
  background(currentStyle.getBackground()); // Set background color
  fill(currentStyle.getFillColor()); // Set fill color
  stroke(currentStyle.getStrokeColor()); // Set stroke color
  textSize(currentStyle.getTextSize()); // Set text size
  text(txt, width/2, height/2); // Display the text
  for(int i = 0; i < buttons.length; i++){
    buttons[i].display(styles);
  }
}

void setupStyles() {
  styles = new StyleCollection();
  Style dark = new Style("Dark", color(33), color(0), color(255), 18);
  Style light = new Style("Light", color(200), color(255), color(0), 18);
  Style red = new Style("Red", color(255,140,140), color(255,0,0), color(196,8,8), 18);
  Style blue = new Style("Blue", color(140,140,255), color(0,0,255), color(19,20,175), 18);

  styles.addStyle(dark);
  styles.addStyle(light);
  styles.addStyle(red);
  styles.addStyle(blue);

  currentStyle = blue;
  styles.setDefaultStyle(currentStyle);
}

void setupButtons() {
  buttons = new Button[styleNames.length];

  for (int i = 0; i < styleNames.length; i++) {
    float x = 100 + (width/4 - 25) * (i);
    float y = height - 50;
    float w = 80;
    float h = 40;
    buttons[i] = new Button(x, y, w, h, styleNames[i]);
    
  }
}

void mousePressed() {
  for (int i = 0 ; i < buttons.length; i++){
     if(buttons[i].isInside(mouseX,mouseY)){
       String l = buttons[i].getText();
       currentStyle = styles.getStyle(l);
     }
  }
}
