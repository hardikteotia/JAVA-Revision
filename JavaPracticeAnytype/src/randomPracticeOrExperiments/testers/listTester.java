package randomPracticeOrExperiments.testers;
import randomPracticeOrExperiments.*;
import java.util.ArrayList;
import java.util.List;

public class listTester {

	public static void main(String[] args) {
		//list<Datatype> listname =  new typeOfList<>();
		
		List<Integer> mylist = new ArrayList<>();
		mylist.add(10);
		mylist.add(20);
		mylist.add(30);
		mylist.add(40);
		mylist.add(50);
		
		for(Integer l: mylist) {
			System.out.println(l);
		}
		System.out.println("-----------");
		mylist.add(0, 80);//it will add item in list and push the items without deleting them
		mylist.add(2, 90);
		
		mylist.addFirst(111);
		System.out.println(mylist.containsAll(mylist));
		System.out.println(mylist.contains(10));
		for(Integer l: mylist) {
			System.out.println(l);
		}
		System.out.println("--" + mylist.get(5));
//		mylist.clear();
		
		
		
		System.out.println(mylist.toString());
		
	}

}
