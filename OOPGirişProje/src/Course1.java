
public class Course1 {
	private String courseCode;
	private String semesterCode;
	private double gradePoints;
	private int credits;
	
	
	
	public Course1(String courseCode, String semesterCode, double gradePoints, int credits) {
		this.courseCode = courseCode;
		this.semesterCode = semesterCode;
		this.gradePoints = gradePoints;
		this.credits = credits;
	}
	
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getSemesterCode() {
		return semesterCode;
	}
	public void setSemesterCode(String semesterCode) {
		this.semesterCode = semesterCode;
	}
	public double getGradePoints() {
		return gradePoints;
	}
	public void setGradePoints(double gradePoints) {
		this.gradePoints = gradePoints;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
}
