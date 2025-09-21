package randomPracticeOrExperiments;

public class varArgsQuestionForPractice {
	
	public static int findMax(int... numbers) {
		if(numbers.length== 0) {
			return Integer.MIN_VALUE;
		}
		int max = numbers[0];
		for(int n: numbers) {
			if(n>max) {
				max=n;
			}
		}
		return max;
		
	}
	
	public static void main(String [] args) {
		System.out.println(findMax(2,10,25));
		System.out.println(findMax(4, 9, 1, 22, 7));     // returns 22  
		System.out.println(findMax());                   // returns Integer.MIN_VALUE  
		System.out.println(findMax(-5));                 // returns -5  
		

	}
}
