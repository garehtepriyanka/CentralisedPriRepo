package Day2Assignment1;


// (((((10+2)+2)-2)*2)/2)

public class Class2 
{
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("Sum result is "+c);
		return c;
	}
	public int Subtract(int e, int f)
	{
		int g;
		g= e-f;
		System.out.println("Subtract result is "+g);
		return g;
	}
	public int Mult(int p, int q)
	{
		int r;
		r=p*q;
		System.out.println("Multiply result is "+r);
		return r;
	}
	public void Div(int x, int y)
	{
		int z;
		z=x/y;
		System.out.println("Final result is "+z);
	}
	
	public static void main(String[] args) 
	{
		Class2 ref = new Class2();
		System.out.println("Below is the code for Day2 assignment1- (((((10+2)+2)-2)*2)/2)");
		int sumresult= ref.sum(10,2);
		int sumresult2= ref.sum(sumresult, 2);
		int subresult= ref.Subtract(sumresult2, 2);
		int multiresult= ref.Mult(subresult, 2);
		ref.Div(multiresult,2);
		
	}
}
