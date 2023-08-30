package Day10PracticeAssignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteDataAssignment5 
{
	public void ReadWriteData() throws IOException
	{
		File f1 =new File("../Project_1/PG1.txt");
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		File f =new File("../Project_1/PG2.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		String a;
		while((a=br.readLine())!=null)
		{
			System.out.println(a);
			bw.write(a);
			bw.newLine();
		}
				
		bw.close();		
	}
	public static void main(String[] args) throws IOException 
	{
		ReadWriteDataAssignment5 wda = new ReadWriteDataAssignment5();
		wda.ReadWriteData();		
	}

}
