package tester;
import PrinterPackage.*;
public class Test {
	public static void main(String [] args) {
		Printer p = new ConsolePrinter();
		
		p.print(null);
		
		p=new FilePrinter();
		p.print(null);
		
		//p.openFile(); javac error cuz printer p doesn't know about open file 
		//so we will downcast it
		
		((FilePrinter)p).openFile();
		
		p.print(null);
		
		p=new NetworkPrinter();
		
		p.print(null);
		((FilePrinter)p).openFile();
		
	}
	
}
