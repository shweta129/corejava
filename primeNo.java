package shweta;

public class primeNo 
{
	public static void main(String args[])
	{
		int m=0,n,flag=0;
		n=17;
		m=n/2;
		for(int i=2;i<=m;i++)
		{
		if(n%i==0)
		{
			System.out.println("not prime");
			flag=1;
			break;
			
		}
		}
	if(flag==0)
	{
		System.out.println("prime");
	}
		}
	}


