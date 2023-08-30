package Day10PracticeAssignment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TxtFileAppendData 
{
	public void writeTxtAppendLine() throws IOException
	{
		File f=new File("../Project_1/PG12345.txt");
		FileWriter fw=new FileWriter(f, true);
		BufferedWriter b=new BufferedWriter(fw);
		b.newLine(); //new line or next line
		b.write("Fourth line of the code");
		b.newLine(); //new line or next line
		b.write("Fifth line of the code");
		b.newLine();
		b.write("Sixth line of the code");
		b.close();  //for saving and closing the file			
	}	
	public static void main(String[] args) throws IOException 
	{
		TxtFileAppendData h = new TxtFileAppendData();
		h.writeTxtAppendLine();
		
	}

}
