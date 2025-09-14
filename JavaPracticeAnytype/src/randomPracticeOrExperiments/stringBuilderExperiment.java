package randomPracticeOrExperiments;

public class stringBuilderExperiment {
	public static void main(String [] args) {
		//❌ Inefficient way using String:
		String result = "";
		
		
		
		for (int i = 0; i < 10; i++) {
		    result += i;  // Creates a new string every time
		}
		
		System.out.println(result);
		
		//Sufficient way using string:
		StringBuilder obj = new StringBuilder();
		
		for(int i=0; i<10;i++) {
			obj.append(i);
		}
		System.out.println(obj.toString());
		//or another way to type the print string 
		String result2 = obj.toString();//just hold it in string namak variable and then print the string using to string method
		
		StringBuilder obj2 = new StringBuilder("");
		obj2.insert(0, "This is my string");
		System.out.println(obj2.toString());
		
		obj2.delete(4, 8);
		System.out.println(obj2.toString());
		
		//Experimenting with equals method and == method;
		String s1 = "Hello";
		System.out.println(s1.equals("This"));
		
		System.out.println(s1.charAt(2));
		
		String a = "hello";
		String b =  "hello";
		
		System.out.println(a.contains(b));//if different strings then false
		
		System.out.println(a.compareTo(b));
		
		String arr[] = {"Ramesh", "Suresh"};
		
		System.out.println(arr[0].compareTo(arr[1]));
		
	}

}
