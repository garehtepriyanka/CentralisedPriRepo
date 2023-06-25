package Assignment1;

public class Student {
	int rollNo;
	int age;
	public void display1()
	{
		System.out.println("Welcome to All of you");
	}
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args) {
		Student obj1=new Student();
		obj1.display1();
		obj1.display2();
		obj1.rollNo = 1234;
		System.out.println(obj1.rollNo);
		obj1.age = 30;
		System.out.println(obj1.age);
	}

}
