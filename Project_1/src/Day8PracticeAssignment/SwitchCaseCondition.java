package Day8PracticeAssignment;

import java.util.Scanner;

public class SwitchCaseCondition 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter value of a and b ");
		Scanner ob = new Scanner(System.in);
		int a = ob.nextInt();
		int b = ob.nextInt();
		System.out.println("Please enter operator");
		int op = ob.nextInt();
		int result;
		
		switch (op) {
		case 1:
			result=a+b;
			System.out.println("Result is "+result);
			break;
		case 2:
			result=a-b;
			System.out.println("Result is "+result);
			break;
		case 3:
			result=a*b;
			System.out.println("Result is "+result);
			break;
		case 4:
			result=a/b;
			System.out.println("Result is "+result);
			break;
		default:
			System.out.println("Please enter correct operator");
			break;
		} 
			
		
	}

}
