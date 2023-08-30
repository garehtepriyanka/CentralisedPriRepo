package Day10PracticeAssignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataAssignment2 
{
	public void ReadDataOfRange(int a , int b) throws IOException
	{
		File f =new File("../Project_1/PG12345.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s;
		for (int i=1; i<a; i++)
		{
			br.readLine(); //not storing line before start range
		}
		for (int i=a; i<=b; i++)
		{
		s=br.readLine();  //store from start to end range
		System.out.println(s);
		}

	}
	public static void main(String[] args) throws IOException 
	{
		ReadDataAssignment2 rda = new ReadDataAssignment2();
		rda.ReadDataOfRange(2,4);
		
	}

}
