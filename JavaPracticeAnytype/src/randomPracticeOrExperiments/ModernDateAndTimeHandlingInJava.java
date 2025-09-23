package randomPracticeOrExperiments;

import java.time.LocalDate;
import java.util.Scanner;

public class ModernDateAndTimeHandlingInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the manufacture date of product");
		LocalDate manuDate;
		int days;
		Scanner sc = new Scanner(System.in);
		manuDate = LocalDate.parse(sc.next());
		System.out.println("Enter days: ");
		days = sc.nextInt();
		LocalDate ExpiryDate = manuDate.plusDays(days);
		System.out.println("Expired on "+ExpiryDate+" Date");
	}

}
