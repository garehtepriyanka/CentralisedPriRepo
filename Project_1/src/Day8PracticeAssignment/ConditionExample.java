package Day8PracticeAssignment;

import java.util.Scanner;

public class ConditionExample 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter value of a ");
		Scanner ob = new Scanner(System.in);
		int a= ob.nextInt();
		if (a%2==0)
		{
			System.out.println("Even Number "+a);
		}
		else
		{
			System.out.println("Odd Number "+a);
		}
	}

}
