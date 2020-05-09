
public class Student {
	
	private String name;
	private String id;
	
	public Student(String n,String id) {
		this.name=n;
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id=id;
	}
	public String toString(){
		return "Student Name :" +name+"Student id  :" +id;
	}
	
}
