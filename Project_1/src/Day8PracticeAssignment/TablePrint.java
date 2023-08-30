package Day8PracticeAssignment;

import java.util.Scanner;

public class TablePrint 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Number for table: ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		for (int i=1; i<=10; i++)
		{
			System.out.println(num+"*"+i+"="+num*i);
		}
		
	}

}
