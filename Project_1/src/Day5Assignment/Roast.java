package Day5Assignment;

public class Roast 
{
	public void M1(int a)
	{
		System.out.println("One Parameterized Method");
	}
	public void M2(int a, int b)
	{
		System.out.println("Two Parameterized Method");
	}
	public void M3(int a, int b, int c)
	{
		System.out.println("Three Parameterized Method");
	}
	public void M4(int a, int b, int c, int d)
	{
		this.M3(13, 23, 33);
		this.M5();
		this.M1(11);
		System.out.println("Four Parameterized Method");
		this.M2(44,22);
	}
	public void M5()
	{
		System.out.println("Default Method");
	}
	public static void main(String[] args) 
	{
		Roast obj = new Roast();
		obj.M4(11,22,33,44);
	}

}
