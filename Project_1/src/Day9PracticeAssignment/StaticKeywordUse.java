package Day9PracticeAssignment;

public class StaticKeywordUse 
{
	static int a=122;
	int b=45;
	public static void abc()
	{
		a=a+1; //a static method can use static variable only
		System.out.println("I am static method ");
	}
	public void xyz()
	{
		a=a+2; //a non static method can use both variables(static and non static)
		b=b+1; //a non static method can use both variables(static and non static)
		System.out.println("I am Non-Static method ");
	}
	public static void main(String[] args) 
	{
		StaticKeywordUse.abc(); //if we make any variable or any method static we can call directly using classname
		System.out.println(StaticKeywordUse.a); //if we make any variable or any method static we can call directly using classname
		
		StaticKeywordUse ref = new StaticKeywordUse();
		ref.xyz(); //non static can be called using reference variable
		System.out.println(StaticKeywordUse.a);
		System.out.println(ref.b); //non static can be called using reference variable		
	}

}
