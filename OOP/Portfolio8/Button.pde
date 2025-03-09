class Button {

  private float x;
  private float y;
  private float w;
  private float h;
  private String label;

  public Button(float xp, float yp, float wd, float ht, String label) {
    this.x = xp;
    this.y = yp;
    this.w = wd;
    this.h = ht;
    this.label = label;
  }

  public void display(StyleCollection style) {
    Style buttonStyle = style.getStyle(label);
    
    fill(buttonStyle.getBackground());
    stroke(buttonStyle.getStrokeColor());
    rect(x, y, w, h);
    fill(255);
    textAlign(CENTER);
    textSize(buttonStyle.getTextSize());
    text(buttonStyle.getName(), x + w / 2, y + h / 2 + 10); 
}


  public Boolean isInside(float xCord, float yCord) {
    if (xCord >= x && xCord <= x + w && yCord >= y && yCord <= y + h) {
      return true;
    }
    return false;
  }
  
  public void setLabel(String l){
    label = l;
  }
  public String getText(){
     return label;
  }
  
}
