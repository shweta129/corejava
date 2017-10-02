package shweta;
class demo
{
	int TicketID;
	public demo()
	{
		System.out.println("constructor 1");
		
	}
	public demo(String c)
	{
		System.out.println("abc");
		
	}
}
public class reservation {
	public static void main(String args[])
	{
		demo d =new demo();
		demo d1=new demo("constructor2");
		
	}

}
