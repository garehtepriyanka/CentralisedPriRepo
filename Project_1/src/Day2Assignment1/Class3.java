package Day2Assignment1;
//  (((((10*2)-2)+2)-2)/2)
public class Class3 
{
	public int multi(int a, int b)
	{
		int c;
		c=a*b;
		System.out.println("Multiply result is "+c);
		return c;
	}
	public int subtract(int d, int e)
	{
		int f;
		f=d-e;
		System.out.println("Subtarct result is "+f);
		return f;
	}
	public int sum(int p, int q)
	{
		int r;
		r=p+q;
		System.out.println("Sum result is "+r);
		return r;
	}
	public void div(int x, int y)
	{
		int z;
		z=x/y;
		System.out.println("Division result is "+z);
	}
	public static void main(String[] args) 
	{
		Class3 ref2= new Class3();
		System.out.println("Below is the code for Day2 assignment2- (((((10*2)-2)+2)-2)/2)");
		int multiresult= ref2.multi(10, 2);
		int subresult= ref2.subtract(multiresult, 2);
		int sumresult= ref2.sum(subresult, 2);
		int subresult2= ref2.subtract(sumresult, 2);
		ref2.div(subresult2, 2);
		
	}

}
