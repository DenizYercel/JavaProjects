import java.util.ArrayList;
import java.util.List;

public class GenericsApp1 {
	
	public static void main(String[] args) {
		
		//type safe
		int deger=10;
		
		List<Integer> liste=new ArrayList<>();
		
		liste.add(new Integer(10));
		liste.add(8);
		liste.add(10);
		liste.add(2);
		
		
		int sum=0;
		for (Integer sayi : liste) {
			sum+=sayi;
		}
		
		System.out.println("Toplam: "+sum);
	}
	
}
