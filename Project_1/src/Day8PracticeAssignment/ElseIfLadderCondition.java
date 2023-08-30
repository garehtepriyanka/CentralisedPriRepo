package Day8PracticeAssignment;

import java.util.Scanner;

public class ElseIfLadderCondition 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter value of marks ");
		Scanner ob = new Scanner(System.in);
		int marks = ob.nextInt();
		if ((marks>=0)&&(marks<35))
		{
			System.out.println("Failed "+marks);
		}
		else if ((marks>35)&&(marks<60))
		{
			System.out.println("Pass "+marks);
		}
		else if ((marks>=60)&&(marks<80))
		{
			System.out.println("First Division "+marks);
		}
		else if ((marks>=80)&&(marks<=100))
		{
			System.out.println("Merit "+marks);
		}
		else
		{
			System.out.println("Please enter the correct marks ");
		}
	}

}
