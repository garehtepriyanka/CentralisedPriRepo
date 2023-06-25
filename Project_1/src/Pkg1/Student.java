package Pkg1;
//{} means boundary of the class
// we will keep(put) variable + method
// variable ---- which store some value and value can be change
// method ---- for performing any operation we will create method for it

public class Student //piller1
{
	int a; // declare a variable named a and it will store integer value
	
	public void priyanka()
	{   // boundary of the method
		System.out.println("Welcome to all you");
		
	}
	
	public static void main(String[] args) //piller2
	{
		Student abc=new Student(); //piller3
		abc.priyanka();
		abc.a=122;
		System.out.println(abc.a);
		abc.a=4122;
		System.out.println(abc.a);
	}
	

}
