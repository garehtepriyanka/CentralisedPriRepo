package Day8PracticeAssignment;

import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter number ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int i, count=0;
		
		for (i=2; i<num; i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
			System.out.println("It is a Prime Number "+num);
		else
			System.out.println("It is not a Prime Number "+num);
		
		
	}

}
