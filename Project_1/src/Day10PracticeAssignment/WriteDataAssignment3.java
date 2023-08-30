package Day10PracticeAssignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class WriteDataAssignment3 
{
	public void WriteData() throws IOException
	{
		File f =new File("../Project_1/PG12.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		System.out.println("Enter the number of lines to write: ");
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		System.out.println();
		System.out.println("Enter the line to write: ");
		for (int i=0; i<=a; i++)
		{			
			String line = s.nextLine();
			bw.write(line);
			bw.newLine();
		}
		

		bw.close();		
		

	}
	public static void main(String[] args) throws IOException 
	{
		WriteDataAssignment3 wda = new WriteDataAssignment3();
		wda.WriteData();
		
	}

}
