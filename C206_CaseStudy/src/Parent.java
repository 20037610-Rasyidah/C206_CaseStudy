
public class Parent extends Student {
	private String name;
	private String email;
	private int ContactNum;
	
	public Parent(String studentID, String name, String lvlclass, String teacher, String name2, String email,
			int contactNum) {
		super(studentID, name, lvlclass, teacher);
		name = name2;
		this.email = email;
		ContactNum = contactNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getContactNum() {
		return ContactNum;
	}

	public void setContactNum(int contactNum) {
		ContactNum = contactNum;
	}
	
	
}
