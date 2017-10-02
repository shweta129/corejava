package shweta;

import java.util.Scanner;

public class simpleexceptions
{
	public static void main(String ar[])
	{
	try {
		int a=78 ,b=0,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("two no:");
		a=sc.nextInt();
		b=sc.nextInt();
		result=a/b;
		
	}
	catch(ArithmeticException e)
	{
	System.out.println(e.getMessage());	
	}
	finally
	{
		System.out.println("End program");
	}
	}

}
