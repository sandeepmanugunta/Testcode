package myproj;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class List_ex 
{

	public static void main(String[] args) 
	{
		List<String> lst=new ArrayList<String>();
		lst.add("selenium");
		lst.add("java");
		lst.add("testing");
		lst.add("qtp");
		lst.add("selenium");
		
		lst.add(2,"linux");
		
		for(String x:lst)
			System.out.println(x);
		
		
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("ravi");
		ts.add("kiran");
		ts.add("vijay");
		ts.add("ajay");
		ts.add("kiran");
		
		for(String x : ts)
			System.out.println(x);
		
		
		
		
	}

}
