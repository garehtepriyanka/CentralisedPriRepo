package Day5Assignment;

public class Student 
{
	public Student() 
	{
		this(11,22,33);
		System.out.println("Default Constructor");
	}
	public Student(int a) 
	{
		this();
		System.out.println("One Parameterised Constructor");
	}
	public Student(int a, int b) 
	{
		this(11,22,33,44);
		System.out.println("Two Parameterised Constructor");
	}
	public Student(int a, int b, int c) 
	{
		System.out.println("Three Parameterised Constructor");
	}
	public Student(int a, int b, int c, int d) 
	{
		this(11);
		System.out.println("Four Parameterised Constructor");
	}
	public static void main(String[] args) 
	{
		Student obj = new Student(33, 44);
	}

}
