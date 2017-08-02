package myproj;

public class Student 
{
	String sname,course;  //instance variable
	static String college; //static variable
	
	int x;
	public void getdata()
	{
		System.out.println(sname+" "+course+"  "+college);		
	}	
	public void f1()
	{
		int x;
		x=20;
		this.x=30;		
	}
	public static void main(String[] args) 
	{
		Student.college="jntu";
		
		Student s1=new Student();
		s1.sname="ravi";
		s1.course="ECE";
		
		Student s2=new Student();
		s2.sname="vijay";
		s2.course="IT";
		
		s1.getdata();
		s2.getdata();
	}
}
