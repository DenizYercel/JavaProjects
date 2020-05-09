import java.util.ArrayList;
import java.util.List;

public class GenericsApp5 {
	
	public static void main(String[] args) {
		
		//type safe
		int deger=10;
		
		Sayim<Integer> myInt=new Sayim<Integer>(new Integer(2));
		Sayim<Double> myDouble=new Sayim<Double>(2.5);
		
	//	Sayi<String> myString=new Sayi<String>("deniz");  extends Number ile sayilara sýnýrladýk..
		
	
}
}

class Sayim<T extends Number>{
	T value;
	public Sayim( T value) {
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
