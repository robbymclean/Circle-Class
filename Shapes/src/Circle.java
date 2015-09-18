
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
  
<<<<<<< HEAD
  public double getNumSides()
  {
	  return ns;
  }
  
  
=======
  public double getPerimeter(){
	  return 2* radius * 3.14;
  }

public double getArea(){
	return radius * radius * 3.14;
}

public double getSideLength(double sideLength){
	return sideLength;
}

>>>>>>> 06f0c06db204154c8a911a9207496bad0f991a8a
  public static void main(String [] args){
	  Circle c = new Circle();
	  System.out.println(c.getWidth());
	  System.out.println(c.getHeight());
	  System.out.println(c.getArea());
<<<<<<< HEAD
	 
	  
=======
	  System.out.println(c.getPerimeter());
>>>>>>> 06f0c06db204154c8a911a9207496bad0f991a8a
  }
}
