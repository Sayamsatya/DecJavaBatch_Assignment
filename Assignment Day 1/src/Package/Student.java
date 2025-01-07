package Package;

public class Student {

	int age;
	int Rollno;
	
	public void display1()
	{
		System.out.println("Welcome to all of you");
	}
	
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.display1();
		s.display2();
		s.age=29;
		s.Rollno=1123;
		System.out.println(s.age);
		System.out.println(s.Rollno);
	}
}
