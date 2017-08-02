package myproj;

import java.util.Scanner;

public class Biggest
{

	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		
		if(a>b && a>c)
			System.out.println(a+" is biggest");
		else if(b>c)
			System.out.println(b+" is biggest");
		else
			System.out.println(c+" is biggest");

	}

}
