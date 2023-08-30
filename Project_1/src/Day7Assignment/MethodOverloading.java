package Day7Assignment;

public class MethodOverloading {
	public void Method()
	{
		System.out.println("default method overloading");
	}
	public void Method(int a)
	{
		System.out.println("Result is "+a);
	}
	public void Method(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("Result is "+c);
	}
	public void Method(int a, float b)
	{
		float y;
		y=a+b;
		System.out.println("Result is "+y);
	}
	public int Method(int a, int b, int c)
	{
		int x;
		x=a*b*c;
		System.out.println("Result is "+x);
		return x;
	}
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.Method(11);
		obj.Method(2,3,4);
		obj.Method(22, 33);
		obj.Method();
		obj.Method(2, 3.5f);
	}

}
