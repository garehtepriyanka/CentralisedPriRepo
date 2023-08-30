package Day7Assignment;

public class MarutiMethodOverriding {
	public void BasePrice()
	{
		System.out.println("Base Price is 3lacs");
	}
	public void RoadPrice(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("Road price is "+c);
	}
	public void TurboEngine(int a, int b)
	{
		int c;
		c=a/b;
		System.out.println("TurboEngine price is "+c);
	}

}
