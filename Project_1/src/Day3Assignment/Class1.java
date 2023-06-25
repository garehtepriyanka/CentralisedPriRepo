package Day3Assignment;

public class Class1 
{
	int x;
	int y;
	
	public Class1() 
	{
		// TODO Auto-generated constructor stub
		System.out.println("Default Constructor");
	}
	public Class1(int a) 
	{
		// TODO Auto-generated constructor stub
		System.out.println("one parameterized constructor");
	}
	public Class1(int a, int b) 
	{
		x=a;
		y=b;
		System.out.println("two parameterized constructor");
	}
	public static void main(String[] args) 
	{
		Class1 ob = new Class1();
		Class1 ob1 = new Class1(1);
		Class1 ob2 = new Class1(10, 20);
		
		System.out.println("first paramerter is "+ob2.x);
		System.out.println("second paramerter is "+ob2.y);
	}

}
