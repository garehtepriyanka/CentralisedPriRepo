package Day8PracticeAssignment;

import java.util.Scanner;

public class SwapingNumUsingThirdVariable 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter value of a ");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("Enter value of b ");
		int b = s.nextInt();
		int c =a+b;
		b=c-b;
		a=c-a;
		System.out.println("Swapped value of a is "+a);
		System.out.println("Swapped value of b is "+b);
		
	}

}
