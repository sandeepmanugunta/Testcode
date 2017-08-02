package myproj;

public class loop_ex 
{

	public static void main(String[] args) 
	{
		/*int n=1;
		while(n<=10)
		{
			System.out.println(n);
			n++;
		}*/
		
		/*int n=1;
		do
		{
			System.out.println(n);
			n++;
		}while(n<=10);*/
		
		/*for(int n=1;n<=10; n++)
		{
			System.out.println(n);
		}*/
		
		/*for(int i=1;i<=5;i++)
		{
		  for(int j=1;j<=i;j++)
		  {
		    System.out.print(j);
		  }
		  System.out.println();
		}*/
		
		String s1="malayalam";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
		 
		  s2=s2+s1.charAt(i);
		}
		if(s1.matches(s2))
			System.out.println("it is palindrome");
		else
			System.out.println("not a palindrome");
		

	}

}






















