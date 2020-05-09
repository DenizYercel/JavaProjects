
public class FoodItem {
	
	private String desc;
	private double size;
	private double price;
	
	
	public FoodItem(String d,double s,double p) {
		this.desc=d;
		this.size=s;
		this.price=p;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public double getSize() {
		return size;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setDesc(String newDesc) {
		desc=newDesc;
	}
	
	public void setSize(double newSize) {
		size=newSize;
	}
	public void setPrice(double newPrice) {
		price=newPrice;
	}
	public void display() {
		System.out.println("Description of the FoodItem object is :"+desc);
		System.out.println("Size of the FoodItem object is :"+size);
		System.out.println("Price of the FoodItem object is :"+price);
	}

	public double calcUnitPrice() {
		return (price/size);
	}
	
	
}
