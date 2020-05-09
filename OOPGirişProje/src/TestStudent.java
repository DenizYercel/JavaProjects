import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TestStudent {

	public static void main(String[] args) {
		ArrayList<Course> courseList=new ArrayList<Course>();
		courseList.add(new Course("CTP 101","51101"));
		courseList.add(new Course("CTP 102","51102"));
		
		Student stu1=new Student("Ali", "111");
		Student stu2=new Student("Veli","222");
		Student stu3=new Student("Ahmet", "333");
		
		courseList.get(0).registerStudent(stu1);
		courseList.get(0).registerStudent(stu2);
		courseList.get(0).registerStudent(stu3);
		
		courseList.get(1).registerStudent(stu2);
		
		String code =JOptionPane.showInputDialog("Enter couse code :");
		String result="";
	      for(Course temp:courseList) {
			result+=temp.getCourseName()+"with students : \n";
			if(temp.getCourseCode().equals(code)){
				for(Student s :temp.getStudentList()) {
					result+=s + "\n";
				}
			}
		}
	      
	      JOptionPane.showMessageDialog(null, result);
		
	/*	for(int i=0;i<courseList.size();i++) {
			if(courseList.get(i).getCourseCode().equals(code)) {
				result+=courseList.get(i).getCourseName() + "with students :\n";
				for(int j=0;j<courseList.get(i).getStudentList().size();j++) {
					result+=courseList.get(i).getStudentList().get(j)+"\n";
				}
			}
		}    */	
	      
	     
	      String id =JOptionPane.showInputDialog("Enter Student id :");
	      String res="";
	      for(Course temp:courseList) {
	    	  for(Student s :temp.getStudentList()) {
	    		  if(s.getId().equals(id)) {
	    			  res+=temp.getCourseName()+"\n";
	    		  }
	    	  }
	      }
	      
		
		JOptionPane.showMessageDialog(null, res);
	}

}
