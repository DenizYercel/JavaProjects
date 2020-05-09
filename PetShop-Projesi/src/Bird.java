
public class Bird extends Pet implements ILivesInCage{
	
	String type;
	String name;
	double price;
	int minCageSize;
	public Bird(char gender, int age, String type, String name, double price, int minCageSize) {
		super(gender, age);
		this.type = type;
		this.name = name;
		this.price = price;
		this.minCageSize = minCageSize;
		this.gender=gender;
		this.age=age;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	System.out.println("Bird eats feed");
		
	}
	
	@Override
	void sound() {
		System.out.println("Bird sounds cik");
	}
	
	
	public void getMinCageSize1(int minCageSize) {
		System.out.println("Bird "+minCageSize+" cm2'de yasar");
	}
	

	@Override
	public String toString() {
		return "Bird [type=" + type + ", name=" + name + ", price=" + price + super.toString() + "]";
	}
	@Override
	public int getMinCageSize(int minCageSize) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
