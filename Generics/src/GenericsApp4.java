import java.util.ArrayList;
import java.util.List;

public class GenericsApp4 {
	
	public static void main(String[] args) {
		
		//type safe
		int deger=10;
		
		Sayi<Integer> myInt=new Sayi<Integer>(new Integer(2));
		Sayi<Double> myDouble=new Sayi<Double>(2.5);
		
	//	Sayi<String> myString=new Sayi<String>("deniz");  extends Number ile sayilara sýnýrladýk..
		
	
}
}

class Sayi<T extends Number>{
	T value;
	public Sayi( T value) {
		super();
		this.value = value;
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	
	
}
