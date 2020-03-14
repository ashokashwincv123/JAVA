package university;
import java.util.Scanner;
public class Person
{
	String fn,ln;
	int age;
	
	public void getDetail()
	{
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter the basic details");
		System.out.println("Enter the First name");
		fn=s2.nextLine();
		System.out.println("Enter the Last Name");
		ln=s2.nextLine();
		System.out.println("Enter the Age");
		age=s2.nextInt();
	}
}
