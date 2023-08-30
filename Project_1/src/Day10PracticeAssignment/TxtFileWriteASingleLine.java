package Day10PracticeAssignment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TxtFileWriteASingleLine 
{
	public void writeTxtFileSingleLine() throws IOException
	{
		File f=new File("../Project_1/PG1234.txt");
		FileWriter fw=new FileWriter(f);
		fw.write("Welcome to all of you guys");
		fw.close();  //for saving and closing the file			
	}	
	public static void main(String[] args) throws IOException 
	{
		TxtFileWriteASingleLine h = new TxtFileWriteASingleLine();
		h.writeTxtFileSingleLine();
		
	}

}
