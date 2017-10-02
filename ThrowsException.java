package shweta;
import java.io.IOException;
import java.util.*;
class exception
 {

void met() throws IOException // throws keyword is used declre any exception will into multiple catch or exception

{
	throw new IOException("error");
}
}
 public class ThrowsException
 {
	 public static void main(String arg[])
	 {
		 try
		 {
			 exception ex=new exception();
			 ex.met();
		 }
		 catch(Exception e)
		 {
			 System.out.println("Exception is now handle from new envi");
		 }
		 finally
		 {
			 System.out.println("end");
		 }
	 }
	 
 }