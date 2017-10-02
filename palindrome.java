package shweta;

import java.util.*;
class palindrome
/*
{
	public static void main(String ad[])
	{
		
	int orignal,reverse;
	Scanner sc=new Scanner(System.in)
	System.out.println("check string is palindrome or not:");
	orignal=sc.nextInt();
			
	 int lenght=orignal.nextLine();
	
	 for(i=lenght-1;i>=0;i--)
	 {
		 reverse=reverse+orignal.charAt();
		 
	 }
	 if(orignal.equals())
	 {
		 System.out.println("Palindrome");
	 }
	 
		 else
		 {
			System.out.println("not Palindrome"); 
		 }
	 }}// palindrome is used for check reverse value

*/
{
public static void main(String args[])
{
   String original, reverse = "";
   Scanner in = new Scanner(System.in);

   System.out.println("Enter a string to check if it is a palindrome");
   original = in.nextLine();

   int length = original.length();

   for ( int i = length - 1; i >= 0; i-- )
      reverse = reverse + original.charAt(i);

   if (original.equals(reverse))
      System.out.println("Entered string is a palindrome.");
   else
      System.out.println("Entered string is not a palindrome.");

}
}	




