package ReferencedarrayPckg;

import arrayDataPckg.Storage;

public class references {
	
	// [access specifier] [Class name - jiska array banega] [array name]
	public Storage[] ref;

	//we created a public method to give the size to the array
	public void givingArraySize(int size) {
	
		ref = new Storage[size];
	}
	
	
	
}
