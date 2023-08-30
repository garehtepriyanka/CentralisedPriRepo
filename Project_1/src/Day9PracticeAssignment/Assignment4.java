package Day9PracticeAssignment;

public class Assignment4 
{
	static int n=1;
	public static void main(String[] args) 
	{
		for (int i=1; i<=4; i++) //loop for rows
		{
			for (int j=1; j<=i; j++) //loop for columns
			{
					System.out.print(n+" ");
					n=n+1;
			}
			System.out.println("");
		}
	}

}
