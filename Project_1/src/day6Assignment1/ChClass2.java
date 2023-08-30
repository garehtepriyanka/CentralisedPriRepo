package day6Assignment1;

public class ChClass2 extends PaClass2
{
	public void Method1()
	{
		System.out.println("Child Default Method");
	}
	public void Method2(int x)
	{
		super.M4(11,22,33);
		super.M1();
		super.M2(23);
		super.M3(98, 45);
		this.Method3(34, 67);
		this.Method1();
		this.Method4(34, 45, 67);
		System.out.println("Child one parameterised Method");
	}
	public void Method3(int x, int y)
	{
		System.out.println("Child two parameterised Method");
	}
	public void Method4(int x, int y, int z)
	{
		System.out.println("Child three parameterised Method");
	}
	public static void main(String[] args) {
		ChClass2 obj2 = new ChClass2();
		obj2.Method2(33);
	}

}
