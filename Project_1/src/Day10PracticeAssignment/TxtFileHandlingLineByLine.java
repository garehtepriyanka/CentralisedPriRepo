package Day10PracticeAssignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TxtFileHandlingLineByLine 
{
	public void readTxtFileLineByLine() throws IOException
	{
		File f=new File("../Project_1/PG123.txt");
		FileReader fr=new FileReader(f);
		BufferedReader b = new BufferedReader(fr);
		String s;
		while((s=b.readLine())!=null)
		{
			System.out.println(s);
		}
	}	
	public static void main(String[] args) throws IOException 
	{
		TxtFileHandlingLineByLine f = new TxtFileHandlingLineByLine();
		f.readTxtFileLineByLine();
		
	}

}
