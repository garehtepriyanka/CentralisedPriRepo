package day6Assignment1;

public class PClass {
	public PClass() 
	{
		this(34,45,56);
		System.out.println("Parent default Constructor");
	}
	public PClass(int a) 
	{
		this();
		System.out.println("Parent One Parameterized Constructor");
	}
	public PClass(int a, int b) 
	{
		this(33);
		System.out.println("Parent Two Parameterized Constructor");
	}
	public PClass(int a, int b, int c) 
	{
		System.out.println("Parent Three Parameterized Constructor");
	}

}
