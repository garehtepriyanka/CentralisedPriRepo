package Day9PracticeAssignment;

import java.util.Scanner;

public class LoopInsideCondition 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter value of max ");
		Scanner s = new Scanner(System.in);
		int max= s.nextInt();
		if (max > 0)
		{
			for(int i=1; i<=max; i=i+1)
			{
				System.out.println(i);
			}
		}
		else
		{
			System.out.println("Number should be positive");
		}
	}

}
