package PrinterPackage;

public class FilePrinter implements Printer {
	public void openFile() {
		System.out.println("Open File in FilePrinter");
	}

	@Override
	public void print(String msg) {
		System.out.println("In print method of FilePrinter");

		
	}
	
	public void closeFile() {
		System.out.println("Close File in FilePrinter");
	}
}
