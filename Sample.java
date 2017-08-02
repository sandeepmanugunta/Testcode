package myproj;

public class Sample 
{
	int x,y;  //properties or fields
	
	public Sample()  //constructor
	{
		System.out.println("cons of sample");
	}
	public Sample(int a,int b)
	{
		
	}
	public void add()//method
	{
		System.out.println(x+y);
	}
	public void add(int a,int b)
	{
		
	}
	public void add(String a,int b)
	{
		
	}
	public void div()
	{
		System.out.println(x/y);
	}
	public static void main(String[] args) 
	{
		Sample s=new Sample(3,4);  //create object, call the properties and methods
		s.x=10;
		s.y=5;
		s.add(3,5);
	}

}
