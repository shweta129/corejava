package shweta;
import java.io.*;

public class IODirectoryDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	File drive[]=File.listRoots();// 4 // will list name of root drive of pc
	System.out.println("drive of this machine");
	for(int i=0;i<drive.length;i++)// repeat 4 time
	{
		File f=drive[i];
		System.out.println(f.toString());// display drive name
		File myfile[]=f.listFiles();//show me list name of file
		for(int j=0;j<myfile.length;j++)
		{
			File f1=myfile[j];
			if(f1.isDirectory())// isDirectory will return a boolean value
				                  // file are showing using this statement
			{
				System.out.println(f1.toString()+"<Folder>");
				
			}
			else
			{
				System.out.println(f1.toString()+"<File>");
			}
		}
		
		
		
	}
}
catch(Exception e)
{
	System.out.println("Exception raise"+e.getMessage());
}
	}

}
