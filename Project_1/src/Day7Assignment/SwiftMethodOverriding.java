package Day7Assignment;

public class SwiftMethodOverriding extends MarutiMethodOverriding
{
	public void RoadPrice(int a, int b)
	{
		int c;
		c= a*b;
		System.out.println("On Road price is "+c);
	}
	public void ElectricModel(int a, int b)
	{
		int c;
		c=a-b;
		System.out.println("Electric Car Price is "+c);
	}
	public static void main(String[] args) 
	{
		SwiftMethodOverriding obj2 = new SwiftMethodOverriding();
		obj2.BasePrice();
		obj2.RoadPrice(50, 2);
		obj2.ElectricModel(55, 11);
		obj2.TurboEngine(10, 2);
		
		MarutiMethodOverriding obj1 = new MarutiMethodOverriding();
		obj1.RoadPrice(50, 2);
	}

}
