package Day9PracticeAssignment;

public class Assignment2 
{
	public static void main(String[] args) 
	{
		for (int i=5; i>=1; i=i-1) //loop for rows
		{
			for (int j=i; j>=1; j=j-1) //loop for columns
			{
				System.out.print("*");
			}
			System.out.println(); //will move cursor to next line
		}
		
	}

}
