package Day10PracticeAssignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TxtFileHandlingCharByChar 
{
	public void readTxtFile() throws IOException
	{
		File f=new File("../Project_1/PG123.txt");
		FileReader fr=new FileReader(f);
		int a;
		while ((a=fr.read())!=-1)
		{
			System.out.println((char)a);
		}
	}
	public static void main(String[] args) throws IOException 
	{
		TxtFileHandlingCharByChar f = new TxtFileHandlingCharByChar();
		f.readTxtFile();
		
	}

}
