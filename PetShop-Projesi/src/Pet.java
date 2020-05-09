
public class Pet {
	
	char gender;
	int age;
	
	
	
	public Pet(char gender, int age) {
		super();
		this.gender = gender;
		this.age = age;

	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	void sound() {
		System.out.println("Pets sounds");
	}
	
	void eat() {
		System.out.println("Pets eats");
	}

	@Override
	public String toString() {
		return "Pet [gender=" + gender + ", age=" + age + "]";
	}
	

}
