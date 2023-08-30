package Day9PracticeAssignment;

public class DoubleLoopAssignment1 
{
	public static void main(String[] args) 
	{
		for (int i=1; i<=4; i=i+1) //loop for rows
		{
			for (int j=1; j<=i; j=j+1) //loop for columns
			{
				System.out.print("*");
			}
			System.out.println(); //will move cursor to next line
		}
		
	}

}
