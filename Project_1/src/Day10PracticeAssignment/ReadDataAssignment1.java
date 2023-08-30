package Day10PracticeAssignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataAssignment1 
{
	public void ReadData() throws IOException
	{
		File f =new File("../Project_1/PG12345.txt");
		FileReader fr = new FileReader(f);
		BufferedReader b = new BufferedReader(fr);
		String s;
		for (int i=1; i<5; i++)
		{
			b.readLine(); //not storing line before fifth line
		}
		s=b.readLine();  //store the fifth line in variable
		System.out.println(s);

	}
	public static void main(String[] args) throws IOException 
	{
		ReadDataAssignment1 rda = new ReadDataAssignment1();
		rda.ReadData();
		
	}

}
