package arrayDataPckg;//package3

public class Storage {
	private int id;
	private String name;
	
	//constructor
	public Storage(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	//getter setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	//display
	public void display() {
		
	System.out.println("Id: "+ id +" Name: "+ name);
	}
	
	
}
