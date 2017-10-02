	package shweta;
	import java.util.Scanner;

public class searchvalue {


	/*{
		int a,n,search,array[];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the vlaues");
		 n=sc.nextInt();
		array=new int[n];
		
		System.out.println("enter"+" "+"Interger");
		
		for(int a=0;a<=n;a++)
		
			array[a]=sc.nextInt();
		
System.out.println("Enter the no to find");
search=sc.nextInt();


	for(int a=0;a<n;a++)
{
	if(array[a]=search)
	{
		System.out.println(search+"line no"+(a+1)+".");
		
		
	}
		if(a==n)
		{
			System.out.println(search+"not in array");
		}
	}

}
}
*/
public static void main(String args[])
	  {
	    int c, n, search, array[];
	 
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter number of elements");
	    n = in.nextInt(); 
	    array = new int[n];
	 
	    System.out.println("Enter " + n + " integers");
	 
	    for (c = 0; c < n; c++)
	      array[c] = in.nextInt();
	 
	    System.out.println("Enter value to find");
	    search = in.nextInt();
	 
	    for (c = 0; c < n; c++)
	    {
	      if (array[c] == search)     /* Searching element is present */
	      {
	         System.out.println(search + " is present at location " + (c + 1) + ".");
	          break;
	      }
	   }
	   if (c == n)  /* Searching element is absent */
	     System.out.println(search + " is not present in array.");
	  }
	


}
