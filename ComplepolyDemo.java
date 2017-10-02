package shweta;
class poly//overloading
{
	public void demo()
	{
		System.out.println("simple method");

	}
	public void demo(String x)
	{
		System.out.println(x);
	}
	public void demo(int a,int b,int c)
	{
	
		c=a+b;
		System.out.println(c);
	}
}

public class ComplepolyDemo {
	public static void main(String args[])
	{
		poly p=new poly();
		p.demo();
		p.demo(1,2,0);
		p.demo("overload");
	}

}
