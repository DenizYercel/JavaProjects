
public class Cat extends Pet {
	
	String name;
	double price;
	
	
	public Cat(char gender, int age, String name, double price) {
		super(gender, age);
		this.name = name;
		this.price = price;
		this.name=name;
		this.price=price;
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
		System.out.println("Cat eats mouse");
	}
	
	@Override
	void sound() {
		System.out.println("Cat sounds miyaw");
	}



	@Override
	public String toString() {
		return "Cat [name=" + name + ", price=" + price +  super.toString() + "]";
	}
	
	
	

}
