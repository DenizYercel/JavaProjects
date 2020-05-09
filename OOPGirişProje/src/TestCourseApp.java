import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TestCourseApp {

	public static void main(String[] args) {
		
		ArrayList<StudentAccount> studentList=new ArrayList<StudentAccount>();
		
		String menu="(A)dd Student \n"+
					"(G)rade Course \n"+
					"(C)alculate Student GPA \n"+
					"(D)isplay Students \n"+
					"(E)xit";
		
		String choice =JOptionPane.showInputDialog(menu);
					
		
		
	}

}
