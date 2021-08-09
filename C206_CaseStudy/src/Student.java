
public class Student {
	private String StudentID;
	private String name;
	private String lvlclass;
	private String teacher;
	
	public Student(String studentID, String name, String lvlclass, String teacher) {
		super();
		StudentID = studentID;
		this.name = name;
		this.lvlclass = lvlclass;
		this.teacher = teacher;
	}

	public String getStudentID() {
		return StudentID;
	}

	public void setStudentID(String studentID) {
		StudentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLvlclass() {
		return lvlclass;
	}

	public void setLvlclass(String lvlclass) {
		this.lvlclass = lvlclass;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	
	
	
	
	
}
