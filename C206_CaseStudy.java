import java.util.ArrayList;
import java.util.Random;

public class C206_CaseStudy {

	public static void main(String[] args) {
		
		C206_CaseStudy.userLogin();
		
	}

	public static void userLogin() {
		
		ArrayList<CCADetails> CCADetailsList = new ArrayList<CCADetails>();
		ArrayList<CCACategory> CCACatList = new ArrayList<CCACategory>();
		ArrayList<Parent> ParentList = new ArrayList<Parent>();
		ArrayList<Student> StudentList = new ArrayList<Student>();
		
		CCADetailsList.add(
				new CCADetails("Soccer", "Sports activity", 20, "Monday", "4:00PM- 6:00PM", "Soccer Field", "Mr.Bala"));
		CCADetailsList.add(new CCADetails("aesthetics Arts", "indoor activity", 20, "Tuesday", "3:00PM- 4:00PM",
				"Art room", "Mr.Mala"));
		CCADetailsList.add(new CCADetails("Modern Dance", "Outdoor activity", 20, "Wednesday", "4:00PM- 6:00PM",
				"Dance room", "Mr.vala"));
		CCADetailsList.add(new CCADetails("Photography club ", "Outdoor activity", 20, "Thursday", "3:00PM- 4:00PM",
				"Photography room", "Mr.Pala"));

		CCACatList.add(new CCACategory("Sports"));
		CCACatList.add(new CCACategory("Performing Arts"));
		CCACatList.add(new CCACategory("Multimedia Club"));
		CCACatList.add(new CCACategory("Arts club"));

		ParentList.add(new Parent("Lala", "lala@gmail.com", 87693758, 1819, "jack", "Primary 3", null, null, "Mr.Raju"));
		ParentList.add(new Parent("Lulu", "Lulu@gamil.com", 89057485, 1818, "Ben", "Primary 5", null, null, "Mr.Ali"));
		ParentList.add(new Parent("Lolo", "Lolo@gamil.com", 90684639, 1817, "Alice", "Primary 6", null, null, "Mrs.Mary"));
		ParentList.add(new Parent("Lele", "Lele@gamil.com", 96375648, 1816, "Anne", "Primary 4", null, null, "Mrs.stacy"));

		StudentList.add(new Student(1819, "jack", "Primary 3", "Mr.Raju", null, null));
		StudentList.add(new Student(1818, "Ben", "Primary 5", "Mr.Ali", null, null));
		StudentList.add(new Student(1817, "Alice", "Primary 6", "Mrs.Mary", null, null));
		StudentList.add(new Student(1816, "Anne", "Primary 4", "Mrs.stacy", null, null));
		StudentList.add(new Student(1816, "Anne", "Primary 4", "Mrs.stacy",null, null));

		C206_CaseStudy.setHeader("LOGIN PAGE");
		int option = 0;
		userMenu();
		option = Helper.readInt("Enter user type > ");
		
		while (option != 4) {

			if (option == 1) {

				C206_CaseStudy.staffMenu();
				int SA_option = 0;
				SA_option = Helper.readInt("Enter your option > ");
				while (SA_option != 11) {
					if (SA_option == 1) {
						C206_CaseStudy.addCCADetails(CCADetailsList);
					} else if (SA_option == 2) {
						C206_CaseStudy.deleteccaDetails(CCADetailsList);
						break;
					} else if (SA_option == 3) {
						C206_CaseStudy.addCCACategory(CCACatList);
					} else if (SA_option == 4) {
						C206_CaseStudy.deleteccaCategory(CCACatList);
					} else if (SA_option == 5) {
						C206_CaseStudy.addParentDetails(ParentList);
					} else if (SA_option == 6) {
						C206_CaseStudy.deleteParent(ParentList);
					} else if (SA_option == 7) {
						C206_CaseStudy.viewParent(ParentList);
						break;
					} else if (SA_option == 8) {
						C206_CaseStudy.addStudentRegisteredDetails(StudentList);
					} else if (SA_option == 9) {
						C206_CaseStudy.deleteStudent(StudentList);
					} else if (SA_option == 10) {
						C206_CaseStudy.viewStudent(StudentList);
						break;

					} else {
						System.out.println("Invalid option");
					}
					System.out.println("Goodbye");
					
				}

			} else if (option == 2) {
				C206_CaseStudy.parentMenu();
				String combination = "abcdefghijklmnopqrstuvwxyz";
			    String combinationTwo = combination.toUpperCase();
			    String combination3 = "1234567890";
			    String allCombination = combination + combinationTwo +combination3 ;
			    String output = "";
			    Random rand = new Random();
			    for(int i = 0; i < 6 ; i++) {
			    	output += allCombination.charAt(rand.nextInt(allCombination.length()));
			    	
			    }
			    System.out.println("Registration ID: " + output);
				int parent_option = 0;
				parent_option = Helper.readInt("Enter your option > ");
				while (parent_option != 4) {

					if (option == 1) {
						C206_CaseStudy.viewCCACategory(CCACatList);
					} else if (option == 2) {
						C206_CaseStudy.viewCCADetails(CCADetailsList);
					} else if (option == 3) {
						C206_CaseStudy.addStudentRegisteredDetails(StudentList);
					} else {
						System.out.println("Invalid option");
					}
					System.out.println("Goodbye");
				}

			} else if (option == 3) {

				C206_CaseStudy.studentMenu();
				int student_option = 0;
				student_option = Helper.readInt("Enter your option > ");
				while (student_option != 4) {

					if (option == 1) {
						C206_CaseStudy.viewCCACategory(CCACatList);
					} else if (option == 2) {
						C206_CaseStudy.viewCCADetails(CCADetailsList);
					} else if (option == 3) {
						C206_CaseStudy.addStudentRegisteredDetails(StudentList);
					} else {
						System.out.println("Invalid option");
					}
					System.out.println("Goodbye");

				}
			} else {
				System.out.println("Invalid option");
			}
			System.out.println("Goodbye!");
		}
	}

	public static void userMenu() {
		System.out.println("1. System administrator");
		System.out.println("2. Parent");
		System.out.println("3. Student");
		System.out.println("4. Quit");
	}

	public static void staffMenu() {
		C206_CaseStudy.setHeader("Staff Optiion");
		System.out.println("1. Add CCA Details");
		System.out.println("2. Delete CCA Details");
		System.out.println("3. Add CCA Category");
		System.out.println("4. Delete CCA Category");
		System.out.println("5. Add Parent");
		System.out.println("6. Delete Parent");
		System.out.println("7. View Parent");
		System.out.println("8. Add Student");
		System.out.println("9. Delete Student");
		System.out.println("10. View Student");
		System.out.println("11. Quit");
	}

	public static void parentMenu() {
		C206_CaseStudy.setHeader("Parent Option");
		System.out.println("1. View CCA Category");
		System.out.println("2. View CCA Details");
		System.out.println("3. Student Registration");
		System.out.println("4. Quit");

	}

	public static void studentMenu() {
		C206_CaseStudy.setHeader("Student Option");
		System.out.println("1. View CCA Category");
		System.out.println("2. View CCA Details");
		System.out.println("3. Student Registration");

	}

	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

//========================================== VIEW CCADETAILS =========================================
	public static void viewCCADetails(ArrayList<CCADetails> CCADetailsList) {

		C206_CaseStudy.setHeader("CCA DETAILS");
		String output = String.format("%-10s %-15s %-8s %-5s %-8 %-10 %-15s\n", "TITLE", "DESCRIPTION", "SIZE", "DAY",
				"TIME", "VENUE", "IC NAME");
		output += retrieveAllCCA(CCADetailsList);
		System.out.println(output);
	}

	public static String retrieveAllCCA(ArrayList<CCADetails> CCADetailsList) {
		String output = "";
		// write your code here
		for (int i = 0; i < CCADetailsList.size(); i++) {

			output += String.format("%-10s %-15s %-8s %-5s %-8s %-10s %-15s\n", CCADetailsList.get(i).getTitle(),
					CCADetailsList.get(i).getDescription(), CCADetailsList.get(i).getSize(),
					CCADetailsList.get(i).getDay(), CCADetailsList.get(i).getTime(), CCADetailsList.get(i).getVenue(),
					CCADetailsList.get(i).getICname());
		}
		return output;
	}

	// ========================================== VIEW CCACATEGORY
	// =========================================
	public static void viewCCACategory(ArrayList<CCACategory> CCACatList) {

		C206_CaseStudy.setHeader("CCA DETAILS");
		String output = String.format("%10s\n ", "CCA Name");
		output += retrieveCCACat(CCACatList);
		System.out.println(output);
	}

	public static String retrieveCCACat(ArrayList<CCACategory> CCACatList) {

		String output = "";
		for (int i = 0; i < CCACatList.size(); i++) {

			output += String.format("%-10s\n", CCACatList.get(i).getCCAname());
		}
		return output;
	}

	// ========================================== VIEW PARENT
	// =========================================
	public static void viewParent(ArrayList<Parent> ParentList) {

		C206_CaseStudy.setHeader("Parent Details");
		String output = String.format("%-15s %-15s %-25s\n ", "Parent Name", "Parent Email", "Parent Contact Number");
		output += retrieveParent(ParentList);
		System.out.println(output);
	}

	public static String retrieveParent(ArrayList<Parent> ParentList) {

		String output = "";
		for (int i = 0; i < ParentList.size(); i++) {

			output += String.format("%-15s %-15s %-25d\n", ParentList.get(i).getname(), ParentList.get(i).getemail(),
					ParentList.get(i).getcontactNum());
		}
	
		
		return output;
		
	} 
	

	// ========================================== VIEW STUDENT
	// =========================================
	public static void viewStudent(ArrayList<Student> StudentList) {

		C206_CaseStudy.setHeader("Student Details");
		String output = String.format("%-15s %-15s %-15s %-20s\n ", "Student ID", "Student Name", "Student Level",
				"Teacher In-Charge");
		output += retrieveStudent(StudentList);
		System.out.println(output);
	}

	public static String retrieveStudent(ArrayList<Student> StudentList) {

		String output = "";
		for (int i = 0; i < StudentList.size(); i++) {

			output += String.format("%-15s %-15s %-15s %-20s\n ", StudentList.get(i).getStudId(),
					StudentList.get(i).getStudName(), StudentList.get(i).getStudClass(),
					StudentList.get(i).getTeacher());
		}
		return output;
	}

	// ========================================== ADD
	// CCADETAILS=========================================
	public static ArrayList<CCADetails> addCCADetails(ArrayList<CCADetails> CCADetailsList) {

		String title = Helper.readString("Enter CCa Title > ");
		String description = Helper.readString("Enter description > ");
		int size = Helper.readInt("Enter size > ");
		String day = Helper.readString("Enter CCA day > ");
		String time = Helper.readString("Enter CCA time > ");
		String venue = Helper.readString("Enter CCA venue > ");
		String ICname = Helper.readString("Enter CCA In-Charge name > ");

		CCADetails ccaDetails = new CCADetails(title, description, size, day, time, venue, ICname);
		CCADetailsList.add(ccaDetails);
		System.out.println("CCA Details Added");
		return CCADetailsList;

	}

	// ========================================== ADD CCACATERGORY
	// =========================================
	public static ArrayList<CCACategory> addCCACategory(ArrayList<CCACategory> CCACatList) {

		String CCAName = Helper.readString("Enter CCA name > ");

		CCACategory ccaCategory = new CCACategory(CCAName);
		CCACatList.add(ccaCategory);
		System.out.println("CCA Category Added");
		return CCACatList;

	}

	// ========================================== ADD PARENT
	// =========================================
	public static ArrayList<Parent> addParentDetails(ArrayList<Parent> ParentList) {

		String name = Helper.readString("Enter Parent Name > ");
		String email = Helper.readString("Enter Parent Email > ");
		int contactNum = Helper.readInt("Enter Parent Contact Number > ");
		int studID = Helper.readInt("Enter Student ID > ");
		String studName = Helper.readString("Enter student name > ");
		String lvlClass = Helper.readString("Enter student level > ");
		String ccacategory = Helper.readString("Enter ccacategory > ");
		String ccaname = Helper.readString("Enter ccacategory> ");
		String teacher = Helper.readString("Enter student teacher > ");

		Parent parentDetails = new Parent(name, email, contactNum, studID, studName, lvlClass, ccacategory, ccaname,
				teacher);
		ParentList.add(parentDetails);
		System.out.println("Parent Details Added");
		return ParentList;
	}

	// ========================================== ADD STUDENT TO CCA
	// =========================================
	public static ArrayList<Student> addStudentRegisteredDetails(ArrayList<Student> StudentList) {

		int studID = Helper.readInt("Enter Student ID > ");
		String studName = Helper.readString("Enter student name > ");
		String lvlClass = Helper.readString("Enter student level > ");
		String teacher = Helper.readString("Enter student teacher > ");
		String CCACategory = Helper.readString("Enter CCA Category > ");
		String CCAName = Helper.readString("Enter CCA Name > ");

		Student StudentDetails = new Student(studID, studName, lvlClass, teacher, CCACategory, CCAName);
		StudentList.add(StudentDetails);
		System.out.println("Student Details Added");
		return StudentList;

	}

	// =================================== DELETE STUDENT
	// ======================================
	public static void deleteStudent(ArrayList<Student> StudentList) {

		C206_CaseStudy.deleteStudent(StudentList);

		int deleteStudent = Helper.readInt("Enter student ID to delete > ");
		if (deleteStudent > 0 && deleteStudent <= StudentList.size() && StudentList != null) {
			StudentList = null;
			System.out.println("student deleted!");
		} else {
			System.out.println("Invalid student index");
		}
	}

	// =================================== DELETE PARENT
	// ======================================
	public static void deleteParent(ArrayList<Parent> ParentList) {

//		C206_CaseStudy.deleteParent(ParentList);

		int deleteParent = Helper.readInt("Enter parent ID to delete > ");
		if (deleteParent > 0 && deleteParent <= ParentList.size() && ParentList != null) {
			ParentList = null;
			System.out.println("Parent deleted!");
		} else {
			System.out.println("Invalid parent index");
		}
	}

	// =================================== DELETE CCACATEGORY
	// ======================================
	public static void deleteccaCategory(ArrayList<CCACategory> CCACatList) {

		C206_CaseStudy.deleteccaCategory(CCACatList);

		int deleteccaCategory = Helper.readInt("Enter cca category to delete > ");
		if (deleteccaCategory > 0 && deleteccaCategory <= CCACatList.size() && CCACatList != null) {
			CCACatList.remove(deleteccaCategory);
			System.out.println("Category deleted!");
		} else {
			System.out.println("Invalid category index");
		}
	}

	// =================================== DELETE CCADETAILS
	// ======================================
	public static void deleteccaDetails(ArrayList<CCADetails> CCADetailsList) {

		C206_CaseStudy.deleteccaDetails(CCADetailsList);

		int deleteccaDetails = Helper.readInt("Enter cca detail to delete > ");
		if (deleteccaDetails > 0 && deleteccaDetails <= CCADetailsList.size() && CCADetailsList != null) {
			CCADetailsList = null;
			System.out.println("detail deleted!");
		} else {
			System.out.println("Invalid detail index");
		}
	}

}