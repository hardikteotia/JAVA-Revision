package inheritanceStudy;



public class Student extends Person{

	private int id;
	private int Number;
	public Student(String name, int age, int id, int Number) {
		super(name,age);
		this.id=id;
		this.Number=Number;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	
	public void setNumber(int Number) {
		this.Number=Number;
	}
	public int getNumber() {
		return Number;
	}
}
