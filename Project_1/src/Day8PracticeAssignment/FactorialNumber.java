package Day8PracticeAssignment;

import java.util.Scanner;

public class FactorialNumber 
{
	public static void factorialNumber (int num)
	{
		int fact =1;
		
		if (num>=0)
		{
			for (int i=2; i<=num; i++)
			{
				fact= fact*i;
			}
			System.out.println("factorial of "+num+" is "+fact);
		}
		else
		{
			System.out.println("Please enter non negative number ");
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter a number for factorial ");
		Scanner s= new Scanner(System.in);
		int num = s.nextInt();
		factorialNumber(num);
	}

}
