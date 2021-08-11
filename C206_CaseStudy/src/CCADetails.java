import java.time.format.DateTimeFormatter;
public class CCADetails  {
	private String title;
	private String description;
	private int size;
	private String day;
	private String time;
	private String venue;
	private String ICname;
	
	public CCADetails(String title, String description, int size, String day, String time, String venue,
			String iCname) {
		super();
		this.title = title;
		this.description = description;
		this.size = size;
		this.day = day;
		this.time = time;
		this.venue = venue;
		this.ICname = iCname;
	}

	public String getICname() {
		return ICname;
	}

	public void setICname(String iCname) {
		ICname = iCname;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public int getSize() {
		return size;
	}

	public String getDay() {
		return day;
	}

	public String getTime() {
		return time;
	}

	public String getVenue() {
		return venue;
	}

	
	
	
	
	
}
