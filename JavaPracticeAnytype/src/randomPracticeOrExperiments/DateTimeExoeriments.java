package randomPracticeOrExperiments;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTimeExoeriments {
	public static void main(String [] args) {
		LocalDate obj1 = LocalDate.now();
		
		System.out.println(obj1);
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Date Enter:"+sc.next());
		LocalDate date = LocalDate.parse("2938-08-12");
		System.out.println(date);  // Output: 2025-09-11
		
		LocalDate date1 = LocalDate.of(2030, 9, 23);
		System.out.println(date1);
		
		
		//varArgs
		
	}
}
