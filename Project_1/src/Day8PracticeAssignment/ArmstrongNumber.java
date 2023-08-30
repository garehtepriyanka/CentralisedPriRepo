package Day8PracticeAssignment;

import java.util.Scanner;

public class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter number ");
		Scanner s=new Scanner(System.in);
		int a = s.nextInt();
		int numb, temp, armno =0;
		
		numb=a;
		while (numb>0)
		{
			temp = numb%10;
			armno = armno + temp*temp*temp;
			numb= numb/10;
		}
		if (armno==a)
			System.out.println(a + " is an Armstrong Number");
		else
			System.out.println(a + " is not an Armstrong Number");		
		
	}

}
