package day6Assignment1;

public class Hub {
	public void M3()
	{
		System.out.println("Hub Class Method");
	}
	public static void main(String[] args) {
		DT ob = new DT();
		ob.M1();
		ob.M2();
		Hub ob2 = new Hub();
		ob2.M3();
	}

}
