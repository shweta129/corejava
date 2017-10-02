package shweta;
import java.util.Scanner;
public class Armstrong 
{
public static void main(String args[])
{
	int n,temp,sum=0,digits=0,remainder;
	Scanner sc=new Scanner(System.in);
	System.out.println("check armstrong no:");
	n=sc.nextInt();
temp=n;
while(temp!=0)
{
	digits++;
	temp=temp/10;
	
}
temp=n;
remainder=temp%10;
sum=sum+power(remainder,digits);
temp=temp/10;


if(n==sum)

	System.out.println("Armstrong no");
else
{
	System.out.println("Not armstrong no");
	

}
}
static int power(int n,int r)
{
	int c,p=1;
	for (c=1;c<=r;c++)
	p=p*n;
	return p;
	
	}
}