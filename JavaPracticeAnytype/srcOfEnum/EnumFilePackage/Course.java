package EnumFilePackage;

public enum Course {
	JAVA(10), PYTHON(20), WEB_DEV(30);
	
	private int FarziOrdinal;

	private Course(int farziOrdinal) {
		FarziOrdinal = farziOrdinal;
	}

	public int getFarziOrdinal() {
		return FarziOrdinal;
	}

	public void setFarziOrdinal(int farziOrdinal) {
		FarziOrdinal = farziOrdinal;
	}
	
	
	
	
}
