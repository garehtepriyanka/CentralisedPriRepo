package Day9PracticeAssignment;

public class ThreeLoopAssignment6 
{
	public static void main(String[] args) 
	{
		for (int i=1; i<=5; i++) //loop for rows
		{
			for (int s=1; s<=5-i; s++)
			{
				System.out.print(" ");
			}
			for (int j=1; j<=2*i-1; j++) //loop for columns
			{
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
