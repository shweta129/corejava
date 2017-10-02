package shweta;
import java.util.HashMap;
import java.util.Map;
public class hashmap {
	

	
		public static void main(String args[])
		{
			HashMap<Integer,String> m=new HashMap<Integer,String> ();
			m.put(1,"shweta");//HashMap always in order
			m.put(2,"sandesh");
			m.put(3,"shweta");
			m.put(2,"sandesh");//does not contain repeated value 
			for(Map.Entry mn:m.entrySet())
			{
				System.out.println(mn.getKey()+" "+mn.getValue());
			}
		}

	}

