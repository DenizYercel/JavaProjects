package Enumss;

public class Animal {
	
	int id;
	PetType tip;
	int age;
	String name;
	public Animal(int id, PetType tip, int age, String name) {
		super();
		this.id = id;
		this.tip = tip;
		this.age = age;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public PetType getTip() {
		return tip;
	}
	public void setTip(PetType tip) {
		this.tip = tip;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Animal [id=" + id + ", tip=" + tip + ", age=" + age + ", name=" + name + "]";
	}
	
	
	

}
