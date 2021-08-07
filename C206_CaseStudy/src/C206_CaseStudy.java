import java.util.ArrayList;
public class C206_CaseStudy {

	public static void main(String[] args) {

		ArrayList<CCADetails> CCADetailsList = new ArrayList<CCADetails>();

		CCADetailsList.add(new CCADetails("Soccer", "Sports activity",20,"Monday",1600,"Soccer Field","Mr.Bala"));
		CCADetailsList.add(new CCADetails("aesthetics Arts", "indoor activity",20,"Tuesday",1500,"Art room","Mr.Mala"));
		CCADetailsList.add(new CCADetails("Modern Dance", "Outdoor activity",20,"Wednesday",1300,"Dance room","Mr.vala"));
		CCADetailsList.add(new CCADetails("Photography club ", "Outdoor activity",20,"Thursday",1300,"Photography room","Mr.Pala"));

		int option = 0;

		while (option != Option_Quit) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				// View all items
				C206_CaseStudy.viewAllCamcorder(camcorderList);
				C206_CaseStudy.viewAllChromebook(chromebookList);

			} else if (option == 2) {
				// Add a new item
				C206_CaseStudy.setHeader("ADD");			
				C206_CaseStudy.setHeader("ITEM TYPES");
				System.out.println("1. Camcorder");
				System.out.println("2. Chromebook");
				
				int itemType = Helper.readInt("Enter option to select item type > ");

				if (itemType == 1) {
					// Add a camcorder
					Camcorder cc = inputCamcorder();
					C206_CaseStudy.addCamcorder(camcorderList, cc);

				} else if (itemType == 2) {
					// Add Chromebook
					Chromebook cb = inputChromebook();
					C206_CaseStudy.addChromebook(chromebookList, cb);

				} else {
					System.out.println("Invalid type");
				}

			} else if (option == 3) {
				// Loan item
				C206_CaseStudy.setHeader("LOAN");			
				C206_CaseStudy.setHeader("ITEM TYPES");
				System.out.println("1. Camcorder");
				System.out.println("2. Chromebook");
				
				int itemType = Helper.readInt("Enter option to select item type > ");

				if (itemType == 1) {
					// Loan camcorder
					C206_CaseStudy.loanCamcorder(camcorderList);
				} else if (itemType == 2) {
					// Loan Chromebook
					C206_CaseStudy.loanChromebook(chromebookList);
				} else {
					System.out.println("Invalid type");
				}

			} else if (option == 4) {
				// Return item
				C206_CaseStudy.setHeader("RETURN");				
				C206_CaseStudy.setHeader("ITEM TYPES");
				System.out.println("1. Camcorder");
				System.out.println("2. Chromebook");
				
				int itemType = Helper.readInt("Enter option to select item type > ");
				if (itemType == 1) {
					// Return camcorder
					C206_CaseStudy.returnCamcorder(camcorderList);
				} else if (itemType == 2) {
					// Return Chromebook
					C206_CaseStudy.returnChromebook(chromebookList);
				} else {
					System.out.println("Invalid type");
				}

			} else if (option == 5) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}

		}

	}

	public static void menu() {
		C206_CaseStudy.setHeader("RESOURCE CENTRE APP");
		System.out.println("1. Display Inventory");
		System.out.println("2. Add item");
		System.out.println("3. Loan item");
		System.out.println("4. Return item");
		System.out.println("5. Quit");
		Helper.line(80, "-");

	}

}
