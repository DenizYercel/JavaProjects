
public class PetApp {

	public static void main(String[] args) {
		
		Dog d =new Dog('E', 2, "kangal", 300);
		System.out.println(d.toString());
		d.eat();
		d.sound();
		
		Cat c =new Cat('K', 3, "VAN", 200);
		System.out.println(c.toString());
		c.eat();
		c.sound();
		
		Bird b=new Bird('E', 3, "iran", "cicikus", 40, 50);
		System.out.println(b.toString());
		b.getMinCageSize1(50);
		b.eat();
		b.sound();
		
	}

}
