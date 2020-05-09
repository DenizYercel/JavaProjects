
public class Employee {
    public int employee_id;
	public String gender;
	public Project project;
	public Employee(int employee_id,String gender,Project p) {
		this.employee_id=employee_id;
		this.gender=gender;
		this.project=p;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public void display() {
		System.out.println("Employee ID :"+employee_id+"\n");
		System.out.println("Employee Gender :"+gender+"\n");
		System.out.println("Project İnformation"+"\n");
		
		project.display();
	}

	
}
