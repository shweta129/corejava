package shweta;

public class Throw {

	int a=9;
	public void demo()
	{
	
		if(a<10)
		{
			throw new ArithmeticException("invalid value");// is used to display error in output //it is throw the error in o/p environment
		}
		else
		{
			System.out.println("Correct value");
		}
		
	}
	

public static void main(String ar[])
{
	Throw t=new Throw();
	t.demo();
}
}
