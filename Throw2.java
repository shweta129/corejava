package shweta;

public class Throw2 {

	int a=9;
	public void demo()
	{
	
		if(a>10)
		{
			throw new ArithmeticException("invalid value");
		}
		else
		{
			System.out.println("Correct value");
		}
		
	}
	

public static void main(String ar[])
{
	Throw2 t=new Throw2();
	t.demo();
}
}
