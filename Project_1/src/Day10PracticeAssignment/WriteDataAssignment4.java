package Day10PracticeAssignment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteDataAssignment4 
{
	public void WriteDataInaRange() throws IOException
	{
		File f =new File("../Project_1/PG1.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		System.out.println("Enter the Initialrowcount: ");
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		System.out.println("Enter the Endrowcount: ");
		int b=s.nextInt();
		System.out.println("Enter the line to write: ");
			
		for (int i=0; i<b; i++)
		{
			if (i<a-3)
			{
				bw.newLine();
			}
			else
			{
				String line = s.nextLine();
				bw.write(line);
				bw.newLine();
			}			
		}		
		bw.close();			
	}
	public static void main(String[] args) throws IOException 
	{
		WriteDataAssignment4 wda = new WriteDataAssignment4();
		wda.WriteDataInaRange();		
	}

}
