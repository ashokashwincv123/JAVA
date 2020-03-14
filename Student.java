package university;
import java.util.Scanner;
class Student extends Person 
{
	String univ,stream;
	int sid;
	public void getDetail()
	{
		super.getDetail();
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter the Academic Detail");
		System.out.println("enter the course enrolled");
		stream=s2.nextLine();
		System.out.println("Enter the Student id");
		sid=s2.nextInt();
		showDetail();
	}
	public void showDetail()
	{
		System.out.println("the details entered are:\n");
		System.out.println("first Name        :"+super.fn);
		System.out.println("last name         :"+super.ln);
		System.out.println("Age               :"+super.age);
		System.out.println("Course Enrolled   :"+stream);
		System.out.println("Student Id        :"+sid);
	}
}
