public class Student {
	private int StudentID;
	private String StudentName;
	private String Studentclass;
	private String CCACategory;
	private String CCAName;
	private String teacher;

	public Student(int StudentID, String StudentName, String Studentclass, String CCACategory, String CCAName, String teacher) {
  
    this.StudentID = StudentID;
    this.StudentName = StudentName;
    this.Studentclass = Studentclass;
    this.CCACategory = CCACategory;
    this.CCAName = CCAName;
    this.teacher = teacher;
  }
	
	public int getStudId() {
		return StudentID;
	}
	
	public String getStudName() {
		return StudentName;
	}
	
	public String getStudClass() {
		return Studentclass;
	}
	
	public String getCCACategory() {
		return CCACategory;
	}
	
	public String getCCAname() {
		return CCAName;
	}

	public String getTeacher() {
		return teacher;
	}
}

 