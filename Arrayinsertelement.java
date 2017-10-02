package shweta;


public class Arrayinsertelement {
	public static void main(String ar[])
	{

System.out.println("before insertion of element:");
int a[]=new int[5];
a[1]=2;
a[2]=3;
a[3]=8;
a[4]=4;
for(int i=0;i<4;i++)
{
	System.out.println( a[i]);
}

a[5]=9;
a[6]=8;
System.out.println("After insertin");
for(int i=0;i<=6;i++)
{
System.out.println(a[i]);	
}

}
}