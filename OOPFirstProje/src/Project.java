
public class Project {
	
	private String projectName;
	private double hoursWorked;
	public static final int HOURLY_PAY=300;
	
	
	public Project(String pN, int hW) {
		super();
		this.projectName=pN;
		this.hoursWorked=hW;
	}

	public String getProjectName() {
		return projectName;
	}
	
	public void setProjectName(String pName) {
		projectName=pName;
	}
	public double getHoursWorked() {
		return hoursWorked;
	}
	
	public void setHoursWorked(double hWorked) {
		hoursWorked=hWorked;
	}
	
	public void display() {
		System.out.println("Proje Name"+projectName);
		System.out.println("Projede çalıştığı saat"+hoursWorked);
	    
	}

	
	
	public double calculateProjectPay() {
		return (hoursWorked*HOURLY_PAY);
	}
}
