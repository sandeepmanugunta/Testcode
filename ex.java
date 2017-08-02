package myproj;

public class ex 
{

	static int x;
	
	int y;
	Integer n;
	
	public void f1()
	{
	 n=10;
	
		x++;
	}
	public static void main(String[] args) 
	{
		ex e1=new ex();
		e1.f1();
		
		ex e2=new ex();
		e2.f1();
		
		System.out.println(e1.x+"      "+e2.x);
	}

}
