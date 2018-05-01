package ncu.lyl.student;

public class Student {
	private String number;
	private String name;
	private String javaGrade;
	
	
	
	public Student(String number, String name, String javaGrade) {
		super();
		this.number = number;
		this.name = name;
		this.javaGrade = javaGrade;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJavaGrade() {
		return javaGrade;
	}

	public void setJavaGrade(String javaGrade) {
		this.javaGrade = javaGrade;
	}

	@Override
	public String toString() {
		return number +"	" + name + "	" + javaGrade;
	}
	
}
