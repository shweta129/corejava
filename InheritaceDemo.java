package shweta;
class parent//inheritance
{
	public parent()
	{
		System.out.println("this is parent");
	}
	
}
class child extends parent
{
	public child()
	{ 
		
		super();
		System.out.println("this is child");
	}
}
public class InheritaceDemo {
public static void main(String args[])
{
	child c=new child();
	
}
}
