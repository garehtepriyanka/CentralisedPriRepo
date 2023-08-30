package Day10PracticeAssignment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TxtFileWriteMultipleLine 
{
	public void writeTxtFileMultipleLine() throws IOException
	{
		File f=new File("../Project_1/PG12345.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter b=new BufferedWriter(fw);
		b.write("First line of the code");
		b.newLine(); //new line or next line
		b.write("Second line of the code");
		b.newLine();
		b.write("Third line of the code");
		b.close();  //for saving and closing the file			
	}	
	public static void main(String[] args) throws IOException 
	{
		TxtFileWriteMultipleLine h = new TxtFileWriteMultipleLine();
		h.writeTxtFileMultipleLine();
		
	}

}
