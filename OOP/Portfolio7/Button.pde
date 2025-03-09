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

  public void display() {
    fill(255, 0, 0);
    rect(x, y, w, h);
    fill(0);
    textAlign(CENTER);
    textSize(25);
    text(label, x+50, y+30);
  }

  public Boolean isInside(float xCord, float yCord) {
    if (xCord >= x && xCord <= x + w && yCord >= y && yCord <= y + h) {
      return true;
    }
    return false;
  }
}
