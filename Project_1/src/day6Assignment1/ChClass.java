package day6Assignment1;

public class ChClass extends PClass 
{
	public ChClass() 
	{
		super(11,22);
		System.out.println("Child default Constructor");
	}
	public ChClass(int a) 
	{
		this(1,2,3);
		System.out.println("Child one parameterised Constructor");
	}
	public ChClass(int a, int b) 
	{
		this(23);
		System.out.println("Child two parameterised Constructor");
	}
	public ChClass(int a, int b, int c) 
	{
		this();
		System.out.println("Child three parameterised Constructor");
	}
	public static void main(String[] args) 
	{
		ChClass obj = new ChClass(22,11);
	}

}
