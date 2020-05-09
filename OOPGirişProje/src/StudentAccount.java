import java.util.ArrayList;

public class StudentAccount {
	
	private String userName;
	private ArrayList<Course1> courseList=new ArrayList<Course1>();
	
	public StudentAccount(String user) {
		this.userName=user;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String toString() {
		String output="User Name :"+userName+"\n";
		for(Course1 current :courseList) {
			output+=current;
		}
		return output;
	}
	
	public void gradeCourse(String code,String semCode,double gradePoints,int credits) {
		Course1 c=new Course1(code, semCode, gradePoints, credits);
		courseList.add(c);
	}
	
	public double calculateGpa() {
		double gpa;
		double totalgrade=0;
		int totalCredits=0;
		for(Course1 c:courseList) {
			totalgrade+=c.getGradePoints();
			totalCredits+=c.getCredits();
		}
		gpa=totalgrade/totalCredits;
		return gpa;
	}
	
}
