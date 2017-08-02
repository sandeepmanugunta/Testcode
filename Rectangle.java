package myproj;

public class Rectangle extends Shape
{

	int x;
	
	public Rectangle()
	{
		super();
		System.out.println("cons in rec");		
	}	
	public void draw()  //method override
	{
		super.side=5;
		System.out.println("draw rec");
	}
	static public void main(String[] args)
	{
		Rectangle r=new Rectangle();
		r.side=4;
		r.draw();
		

	}

}
