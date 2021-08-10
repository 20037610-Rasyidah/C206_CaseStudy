import java.util.ArrayList;
public class C206_CaseStudy {

  public static void main(String[] args) {

    ArrayList<CCADetails> CCADetailsList = new ArrayList<CCADetails>();
    ArrayList<CCACategory> CCACatList = new ArrayList<CCACategory>();
    ArrayList<Parent> ParentList = new ArrayList<Parent>();
    ArrayList<Student> StudentList = new ArrayList<Student>();

    CCADetailsList.add(new CCADetails("Soccer", "Sports activity",20,"Monday",1600,"Soccer Field","Mr.Bala"));
    CCADetailsList.add(new CCADetails("aesthetics Arts", "indoor activity",20,"Tuesday",1500,"Art room","Mr.Mala"));
    CCADetailsList.add(new CCADetails("Modern Dance", "Outdoor activity",20,"Wednesday",1300,"Dance room","Mr.vala"));
    CCADetailsList.add(new CCADetails("Photography club ", "Outdoor activity",20,"Thursday",1300,"Photography room","Mr.Pala"));
    
    CCACatList.add(new CCACategory("Sports"));
    CCACatList.add(new CCACategory("Performing Arts"));
    CCACatList.add(new CCACategory("Multimedia Club"));
    CCACatList.add(new CCACategory("Arts club"));
    
    ParentList.add(new Parent("1819", "jack","Primary 3", "Mr.Raju","Lala","lala@gamil.com", 87693758));
    ParentList.add(new Parent("1818", "Ben","Primary 5", "Mr.Ali","Lulu","Lulu@gamil.com", 89057485));
    ParentList.add(new Parent("1817", "Alice","Primary 6", "Mrs.Mary","Lolo","Lolo@gamil.com", 90684639));
    ParentList.add(new Parent("1816", "Anne","Primary 4", "Mrs.stacy","Lele","Lele@gamil.com", 96375648));
    
    StudentList.add(new Student("1819", "jack","Primary 3", "Mr.Raju"));
    StudentList.add(new Student("1818", "Ben","Primary 5", "Mr.Ali"));
    StudentList.add(new Student("1817", "Alice","Primary 6", "Mrs.Mary"));
    StudentList.add(new Student("1816", "Anne","Primary 4", "Mrs.stacy"));
    
    
    C206_CaseStudy.userLogin();
    
    

//    int option = 0;
//
//    while (option != 5) {
//
//      C206_CaseStudy.userLogin();
//      option = Helper.readInt("Enter an option > ");
//      
//      
// 
//      if (option == 1) {
//        // View all items
//        C206_CaseStudy.viewCCADetails(CCADetailsList);
//        C206_CaseStudy.viewCCACategory(CCACatList);
//        C206_CaseStudy.viewParent(ParentList);
//        C206_CaseStudy.viewStudent(StudentList);
//
//
//      } else if (option == 2) {
//        // Add a new item
//        C206_CaseStudy.setHeader("ADD RECORDS");      
//        System.out.println("1. CCA Details");
//        System.out.println("2. CCA Category");
//        System.out.println("3. Parent");
//        System.out.println("4. Student");
//        
//        int itemType = Helper.readInt("Enter option to select item type > ");
//
//        if (itemType == 1) {
//          // ============================ ADD CCADETAILS ==================================
//        	CCADetails ccaCategory = addCCADetails();
//        	C206_CaseStudy.addCCADetails(CCADetailsList,ccaCategory);
//
//        } else if (itemType == 2) {
//        	// ============================ ADD CCACATEGORY ==================================
//        	CCACategory ccaCategory  = addCCACategory();
//        	C206_CaseStudy.addCCACategory(CCACatList, ccaCategory);
//
//        } else if (itemType == 3) {
//        	// ============================ ADD PARENT ==================================
//        	 Parent parentDetails = addParentDetails();
//             C206_CaseStudy.addParentDetails(ParentList, parentDetails);
//        }else if (itemType == 4) {
//        	// ============================ ADD STUDENT ==================================
//        	 Student StudentDetails = addStudentDetails();
//             C206_CaseStudy.addStudentDetails(StudentList, StudentDetails);
//        }
//        
//        else {
//          System.out.println("Invalid type");
//        }
//
//      } else if (option == 3) {
//        // Loan item
//        C206_CaseStudy.setHeader("LOAN");      
//        C206_CaseStudy.setHeader("ITEM TYPES");
//        System.out.println("1. Camcorder");
//        System.out.println("2. Chromebook");
//        
//        int itemType = Helper.readInt("Enter option to select item type > ");
//
//        if (itemType == 1) {
//          // Loan camcorder
//          C206_CaseStudy.loanCamcorder(camcorderList);
//        } else if (itemType == 2) {
//          // Loan Chromebook
//          C206_CaseStudy.loanChromebook(chromebookList);
//        } else {
//          System.out.println("Invalid type");
//        }
//
//      } else if (option == 4) {
//        // Return item
//        C206_CaseStudy.setHeader("RETURN");        
//        C206_CaseStudy.setHeader("ITEM TYPES");
//        System.out.println("1. Camcorder");
//        System.out.println("2. Chromebook");
//        
//        int itemType = Helper.readInt("Enter option to select item type > ");
//        if (itemType == 1) {
//          // Return camcorder
//          C206_CaseStudy.returnCamcorder(camcorderList);
//        } else if (itemType == 2) {
//          // Return Chromebook
//          C206_CaseStudy.returnChromebook(chromebookList);
//        } else {
//          System.out.println("Invalid type");
//        }
//
//      } else if (option == 5) {
//        System.out.println("Bye!");
//      } else {
//        System.out.println("Invalid option");
//      }

//    }
    
    

  }

  public static void userLogin() {
    C206_CaseStudy.setHeader("LOGIN PAGE");
    String login = ("Enter your email or id");
    Helper.line(80, "-");
    
    if(login.contains("staff@gmail.com")) {
    	int option = 0;   
    	C206_CaseStudy.staffMenu();
    	option =Helper.readInt("Enter your option");
    	
      while (option!= 11) {
    	  
      if(option == 1) {
    	  C206_CaseStudy.addCCADetails();
      }
      else if(option == 2) {
    	  C206_CaseStudy.deleteccaDetails(CCADetails [] detailsList);
      }else if(option == 3) {
    	  C206_CaseStudy.addCCACategory();
      }else if (option == 4) {
    	  C206_CaseStudy.deleteccaCategory(categoryList);
      }else if(option == 5) {
    	  C206_CaseStudy.addParentDetails();
      }else if (option == 6) {
    	  C206_CaseStudy.deleteParent(ParentList);
      }else if(option == 7) {
    	  C206_CaseStudy.viewParent(ParentList);
      }else if(option == 8) {
    	  C206_CaseStudy.addStudentDetails()
      }else if(option == 9) {
    	  C206_CaseStudy.deleteStudent(StudentList);
      }else if(option == 10) {
    	  C206_CaseStudy.viewStudent(StudentList);
      } 
      }
    }
    else if (len(login) ==5){
    	
    }
    else {
    	
    
    }
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
 }
private static int len(String login) {
	// TODO Auto-generated method stub
	return 0;
}

//  public static void userLogin() {
//	    C206_CaseStudy.setHeader("LOGIN PAGE");
//	    System.out.println("1. Parent");
//	    System.out.println("2. Student");
//	    System.out.println("3. Staff");
//	    System.out.println("4. Return item");
//	    System.out.println("5. Quit");
//	    Helper.line(80, "-");
//	}
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

			output += String.format("%-10s %-15s %-8s %-5s %-8 %-10 %-15s\n", CCADetailsList.get(i).getTitle(),
					CCADetailsList.get(i).getDescription(), CCADetailsList.get(i).getSize(),
					CCADetailsList.get(i).getDay(), CCADetailsList.get(i).getTime(), CCADetailsList.get(i).getVenue(),
					CCADetailsList.get(i).getICname());
		}
		return output;
	}
  

  		//========================================== VIEW CCACATEGORY =========================================
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
		//========================================== VIEW PARENT =========================================
		  public static void viewParent(ArrayList<Parent> ParentList) {
			    
			    C206_CaseStudy.setHeader("Parent Details");
			    String output = String.format("%-15s %-15s %-25s\n ", "Parent Name","Parent Email","Parent Contact Number");
			     output += retrieveParent(ParentList);  
			    System.out.println(output);
			  }
		  public static String retrieveParent(ArrayList<Parent> ParentList) {
			  
			  String output = "";
			  for (int i = 0; i < ParentList.size(); i++) {

			      output += String.format("%-15s %-15s %-25d\n", ParentList.get(i).getName(),ParentList.get(i).getEmail(),ParentList.get(i).getContactNum());
			    }
			    return output;
			  }
		  //========================================== VIEW STUDENT =========================================
		  public static void viewStudent(ArrayList<Student> StudentList) {
			    
			    C206_CaseStudy.setHeader("Student Details");
			    String output = String.format("%-15s %-15s %-15s %-20s\n ", "Student ID", "Student Name", "Student Level","Teacher In-Charge");
			     output += retrieveStudent(StudentList);  
			    System.out.println(output);
			  }
		  public static String retrieveStudent(ArrayList<Student> StudentList) {
			  
			  String output = "";
			  for (int i = 0; i < StudentList.size(); i++) {

			      output += String.format("%-15s %-15s %-15s %-20s\n ", StudentList.get(i).getStudentID(),StudentList.get(i).getName(),StudentList.get(i).getLvlclass(),StudentList.get(i).getName(),StudentList.get(i).getTeacher());
			    }
			    return output;
			  }
		  //  ========================================== ADD CCADETAILS=========================================
		  public static CCADetails addCCADetails() {
			  
			  String title = Helper.readString("Enter CCa Title > ");
			  String description = Helper.readString("Enter description > ");
			  int size = Helper.readInt("Enter size > ");
			  String day = Helper.readString("Enter CCA day > ");
			  int time = Helper.readInt("Enter CCA time > ");
			  String venue = Helper.readString("Enter CCA venue > ");
			  String ICname = Helper.readString("Enter CCA In-Charge name > ");
			

			  CCADetails ccaDetails = new CCADetails(title, description, size,day,time,venue,ICname);
			  return ccaDetails;

		  }

		  public static void addCCADetails(ArrayList<CCADetails> CCADetailsList, CCADetails ccaDetails) {

			  CCADetailsList.add(ccaDetails);
			  System.out.println("CCA Details Added");
		  } 
		  // ========================================== ADD CCACATERGORY =========================================
			public static CCACategory addCCACategory() {

				String CCAName = Helper.readString("Enter CCA name > ");

				CCACategory ccaCategory = new CCACategory(CCAName);
				return ccaCategory;

			}

			public static void addCCACategory(ArrayList<CCACategory> CCACatList, CCACategory ccaCategory) {

				CCACatList.add(ccaCategory);
				System.out.println("CCA Category Added");
			}
			// ========================================== ADD PARENT =========================================
			 public static Parent addParentDetails() {
				 
				  String name = Helper.readString("Enter Parent Name > ");
				  String email = Helper.readString("Enter Parent Email > ");
				  int num = Helper.readInt("Enter Parent Contact Number > ");
				  String studID = Helper.readString("Enter Student ID > ");
				  String studName = Helper.readString("Enter student name > ");
				  String lvlClass = Helper.readString("Enter student level > ");
				  String teacher = Helper.readString("Enter student teacher > ");

				  Parent parentDetails = new Parent(name, email, teacher, studID, studName, lvlClass, num);
				  return parentDetails;

			  }

			  public static void addParentDetails(ArrayList<Parent> ParentList, Parent parentDetails) {

				  ParentList.add(parentDetails);
				  System.out.println("Parent Details Added");
			  }
			  // ========================================== ADD STUDENT=========================================
			  public static Student addStudentDetails() {
					
				  String studID = Helper.readString("Enter Student ID > ");
				  String studName = Helper.readString("Enter student name > ");
				  String lvlClass = Helper.readString("Enter student level > ");
				  String teacher = Helper.readString("Enter student teacher > ");

				  Student StudentDetails = new Student(studID, studName, lvlClass,teacher );
				  return StudentDetails;

			  }

			  public static void addStudentDetails(ArrayList<Student> StudentList, Student StudentDetails) {

				  StudentList.add(StudentDetails);
				  System.out.println("Student Details Added");
			  }
			  
			  // =================================== DELETE STUDENT ======================================
			  public static void deleteStudent(Student[] StudentList) {

				   	C206_CaseStudy.deleteStudent(StudentList);

				    int deleteStudent = Helper.readInt("Enter student ID to delete > ");
				    if (deleteStudent > 0 && deleteStudent <= StudentList.length && StudentList[deleteStudent] != null) {
				      StudentList[deleteStudent] = null;
				      System.out.println("student deleted!");
				    } else {
				      System.out.println("Invalid student index");
				    }
				  }
			// =================================== DELETE PARENT ======================================
			  public static void deleteParent(Parent[] ParentList) {

				   	C206_CaseStudy.deleteParent(ParentList);

				    int deleteParent = Helper.readInt("Enter parent ID to delete > ");
				    if (deleteParent > 0 && deleteParent <= ParentList.length && ParentList[deleteParent] != null) {
				      ParentList[deleteParent] = null;
				      System.out.println("Parent deleted!");
				    } else {
				      System.out.println("Invalid parent index");
				    }
				  }
			// =================================== DELETE CCACATEGORY ======================================
			  public static void deleteccaCategory(CCACategory[]categoryList) {

				   	C206_CaseStudy.deleteccaCategory(categoryList);

				    int deleteccaCategory = Helper.readInt("Enter cca category to delete > ");
				    if (deleteccaCategory > 0 && deleteccaCategory <= categoryList.length && categoryList[deleteccaCategory] != null) {
				      categoryList[deleteccaCategory] = null;
				      System.out.println("Category deleted!");
				    } else {
				      System.out.println("Invalid category index");
				    }
				  }
			// =================================== DELETE CCADETAILS ======================================
			  public static void deleteccaDetails(CCADetails[]detailsList) {

				   	C206_CaseStudy.deleteccaDetails(detailsList);

				    int deleteccaDetails= Helper.readInt("Enter cca detail to delete > ");
				    if (deleteccaDetails > 0 && deleteccaDetails <= detailsList.length && detailsList[deleteccaDetails] != null) {
				      detailsList[deleteccaDetails] = null;
				      System.out.println("detail deleted!");
				    } else {
				      System.out.println("Invalid detail index");
				    }
				  }

	}
		  

