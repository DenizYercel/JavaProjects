import java.util.ArrayList;
import java.util.List;

public class GenericsApp3 {
	
	public static void main(String[] args) {
		
		//type safe
		int deger=10;
		
		Sarma<Integer> myInt=new Sarma<Integer>(1, 6);
		Sarma<String> myString=new Sarma<String>(2, new String("deniz"));
		
		
		
	
}
}

class Sarma<T>{
	int id;
	T name;
	public Sarma(int id, T name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
