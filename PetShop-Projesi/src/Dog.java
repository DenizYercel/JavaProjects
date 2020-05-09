
public class Dog extends Pet {
	
	String name;
	double price;
	public Dog(char gender, int age, String name, double price) {
		super(gender, age);
		this.name = name;
		this.price = price;
		this.age=age;
		this.gender=gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	@Override
	void eat() {
		System.out.println("Dog eats hotdog");
	}
	@Override
	void sound() {
		System.out.println("Dog sounds hav");
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", price=" + price + super.toString() + "]";
	}
	
	
	
	

}
