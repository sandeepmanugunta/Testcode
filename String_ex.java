package myproj;

public class String_ex 
{

	public static void main(String[] args) 
	{
		String str="this is sample data";
		System.out.println(str.length());
		System.out.println(str.charAt(10));
		System.out.println(str.substring(3,10));
		System.out.println(str.toUpperCase());
		System.out.println(str.contains("java"));
		System.out.println(str.indexOf("is"));
		
		int x=str.length();
	
		/*String s1="$24,329,12";
		s1=s1.substring(1);
		s1=s1.replace(",","");
		
		if(Integer.parseInt(s1)>15000)
		{
			System.out.println("value is greater than 15000");
		}*/
		
		String s1="the product code 1238 is created success";
		for(int i=0;i<s1.length();i++)
		{
			if(Character.isDigit(s1.charAt(i)))
			{
				System.out.print(s1.charAt(i));
			}
		}
		
		
		str.toUpperCase().replace("s", "x").contains("java");
		
		

	}

}
