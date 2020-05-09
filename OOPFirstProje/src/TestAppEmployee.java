
public class TestAppEmployee {

	public static void main(String[] args) {
		Project pr1=new Project("SOFTWARE", 5);
		Project pr2=new Project("proje1234124", 12);
		
		Employee e1=new Employee(2,"Male",pr1);
		Employee e2=new Employee(4,"Female",pr1);
		
		e1.display();
		e2.display();
		System.out.println("salary paid: "+e1.project.calculateProjectPay());
		
		e1.getProject().setHoursWorked(10);
		System.out.println("salary paid: "+e1.project.calculateProjectPay());
	}

}
