package randomPracticeOrExperiments.testers;

import java.util.Scanner;

import randomPracticeOrExperiments.setOfColors;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a color");
		
		for(setOfColors c : setOfColors.values()) {
			System.out.println(c);
		}
		
		String input = sc.next().toUpperCase();
		System.out.println("You selected: "+ setOfColors.valueOf(input));
		for(setOfColors c : setOfColors.values()) {
			System.out.println(c);
		}
	}

}
