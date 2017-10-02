package shweta;
 class run//overriding
 {
	 public void method()
	 {
		 System.out.println("1st mentod");
	 }
	 
 }
 class jump extends run
 {
	 public void method()
	 {
		 System.out.println("2nd method");
	 }
 }
public class runpoly {
	public static void main(String args[])
	{
		jump j=new jump();
	j.method();
	run r=new run();
	r.method();
	
	}

}
