package myproj;

public class array_ex 
{

	public static void main(String[] args) 
	{
		int x[]={23,45,67,12,45,28}; 
		
		for(int i=0;i<6;i++)
			System.out.println(x[i]);
		
		for(int i: x)
			System.out.println(i);

	}

}
