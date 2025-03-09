import java.util.HashMap;

public class StyleCollection{
 
  private HashMap<String, Style> styles;
  
  public StyleCollection(){
    styles = new HashMap<String, Style>();
  }
  
  public void addStyle(Style s){
    String name = s.getName();
    styles.put(name, s);
  }
  
  public void setDefaultStyle(Style s){
    styles.put("Default", s);
  }
  
  public Style getStyle(String key){
    return styles.get(key);
  }
  
  public Style getDefaultStyle(){
    return styles.get("Default");
  }
  
}
