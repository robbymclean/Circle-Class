
public class Circle  {

private int radius;
//number of sides
private double ns;	

	public Circle() {
	
		radius = 2;
		ns = 0;
		//since circles have no sides
	}
  public double getWidth(){
	  return radius* 2;
	  
  }
  
  public double getHeight(){
	  return radius *2;
  }
  
  public double getNumSides()
  {
	  return ns;
  }
  
  
  public static void main(String [] args){
	  Circle c = new Circle();
	  System.out.println(c.getWidth());
	  System.out.println(c.getHeight());
	 
	  
  }
}
