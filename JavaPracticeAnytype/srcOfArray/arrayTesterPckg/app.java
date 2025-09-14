package arrayTesterPckg;


import arrayDataPckg.*;
import ReferencedarrayPckg.*;
import java.util.Scanner;

public class app {
	public static void main(String [] args) {
		
		
		Scanner sc = new Scanner(System.in);
		references refObj = new references();
		 
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		
		refObj.givingArraySize(size);
		System.out.println("Enter the id and name: ");
		for(int i=0;i<size;i++) {
			refObj.ref[i]=new Storage(sc.nextInt(),sc.next());
			
		}
		
		for(int i=0;i<size;i++) {
			refObj.ref[i].display();
		System.out.println(refObj.ref[i].getName());	
		}
		
		
		
	}
}
