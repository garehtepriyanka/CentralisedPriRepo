package Day9PracticeAssignment;

public class DoubleLoopExample 
{
	public static void main(String[] args) 
	{
		for (int i=1; i<=5; i=i+1) //loop for rows
		{
			for (int j=1; j<=i; j=j+1) //loop for columns
			{
				System.out.print("*");
			}
			System.out.println(); //will move cursor to next line
		}
		
	}

}
