package myproj;

public class A 
{
	public void f1()
	{
		System.out.println("hello");
	}
	public static void main(String[] args) 
	{
	  A obj=new A();	  
	  obj.f1();
	  C o=new C();
	  o.f2();
	}
}


class C
{
	public void f2()
	{
		
	}
}
