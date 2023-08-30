package Day9PracticeAssignment;

public class ThreeLoopAssignment5 
{
	public static void main(String[] args) 
	{
		for (int i=1; i<=5; i++) //loop for rows
		{
			for (int s=i; s<=5; s++)
			{
				System.out.print(" ");
			}
			for (int j=1; j<=i; j++) //loop for columns
			{
					System.out.print("*");
			}
			System.out.println("");
		}
	}

}
