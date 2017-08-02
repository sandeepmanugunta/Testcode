package myproj;

public abstract class Shape 
{
  int side,area;
  
  public Shape()
  {
	  System.out.println("cons in shape");
  }
  public void f1()
  {
	  System.out.println("hello");
  }
  
  public abstract void draw();
  
}
