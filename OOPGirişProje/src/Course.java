import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Course {
	
	private String courseName;
	private String courseCode;
	public static final int MAX_CAPACITY=20;
	
	public Course(String cName,String cCode) {
		this.courseName=cName;
		this.courseCode=cCode;
	}
	
	private ArrayList<Student>  stuList =new ArrayList<Student>(); 
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String cName) {
		this.courseName=cName;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String cCode) {
		this.courseCode=cCode;
	}
	public void registerStudent(Student s) {
		if(stuList.size()<MAX_CAPACITY) {
			stuList.add(s);
		}
		else {
			JOptionPane.showMessageDialog(null, "COURSE FULL-Cannot register student");
		}	
	}
	
	public ArrayList<Student> getStudentList(){
		return stuList;
	}
	
	public String toString() {
		return "Course Code :"+courseCode+" Course name :"+courseName;
	}
	
}
