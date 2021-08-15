
public class Parent extends Student {
	
	String name;
	private String email;
	private int contactNum;
	
	public Parent(String name, String email, int contactNum, int StudentID, String StudentName, String Studentclass, String CCACategory, String CCAName, String teacher) {
		
		super(StudentID, StudentName, Studentclass, CCACategory, CCAName, teacher);
		this.name = name;
		this.email = email;
		this.contactNum = contactNum;
	}
	
	public String getname() {
		return name;
	}
	
	public String getemail() {
		return email;
	}
	
	public int getcontactNum() {
		return contactNum;
	}
}
	