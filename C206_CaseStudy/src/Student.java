
public class Student {
	private String StudentID;
	private String name;
	private String lvlclass;
	private String teacher;
	private String CCACategory;
	private String CCCName;

	


	public Student(String studentID, String name, String lvlclass, String teacher, String cCACategory, String cCCName) {
		super();
		StudentID = studentID;
		this.name = name;
		this.lvlclass = lvlclass;
		this.teacher = teacher;
		CCACategory = cCACategory;
		CCCName = cCCName;
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

	public String getCCACategory() {
		return CCACategory;
	}

	public void setCCACategory(String cCACategory) {
		CCACategory = cCACategory;
	}

	public String getCCCName() {
		return CCCName;
	}

	public void setCCCName(String cCCName) {
		CCCName = cCCName;
	}
	
	
	
	
	
}
