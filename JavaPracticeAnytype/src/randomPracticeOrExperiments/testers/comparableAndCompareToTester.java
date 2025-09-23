package randomPracticeOrExperiments.testers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class comparableAndCompareToTester {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> mylist = new ArrayList<>();
		
		
		
		List<Integer> mylist2 = Arrays.asList(10,20) ;
		
		mylist.add(1111);
		System.out.println("Enter the values");
		for(int i = 0; i<5; i++) {
			mylist.add(sc.nextInt());
		}
		System.out.println("Enter the values");
		for(int i = 0; i<5; i++) {
			mylist2.add(sc.nextInt());
		}
		System.out.println(mylist.size());
		System.out.println(mylist2.size());
		System.out.println(mylist.equals(mylist2));
		System.out.println("-------------------");
		
		for(Integer i: mylist) {
			System.out.println(i);
		}
	
	}
	
}
