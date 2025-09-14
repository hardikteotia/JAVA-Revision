package inheritanceStudy;
import java.util.Scanner;



public class Tester {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		System.out.println("For Participation\n Enter your name and age: ");
		name = sc.next();
		age = sc.nextInt();
		Person ref = new Person(name, age);
		System.out.println("Your name is: "
				+ref.getName()+" and age: "
				+ref.getAge());
		System.out.println("Enter Student details: ");
		
		int id;
		int Number;
//		System.out.println("Name: "+sc.next() );
//		System.out.println("Age: "+sc.nextInt());
		System.out.println("Id: ");
		System.out.println("Number: ");
		Student s1 = new Student(name,age,sc.nextInt(),sc.nextInt());
		System.out.println(s1.getName()+s1.getAge()+s1.getId()+s1.getNumber());
		sc.close();
	}

}
