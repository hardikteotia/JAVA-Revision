package EnumTesterPackage;

import java.util.Scanner;

import EnumFilePackage.Course;

public class Tester1 {
	public static void main(String [] args) {
		Course c = Course.JAVA ;
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter farzi ordinal:");
//		int farziOrdinal = sc.nextInt();
		System.out.println(c.name() +" "+ c.ordinal()+" "+ c.getFarziOrdinal());
	}
}
