package Day8PracticeAssignment;

import java.util.Scanner;

public class PalindromeNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter number ");
		Scanner s=new Scanner(System.in);
		int num= s.nextInt();
		int r,temp, sum=0;
		
		temp=num;
		while (num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(temp==sum)
			System.out.println("Palindrome Number "+temp);
		else
			System.out.println("Not Palindrome "+temp);
		
	}

}
