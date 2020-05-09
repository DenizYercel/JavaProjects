import java.util.ArrayList;
import java.util.List;

public class GenericsApp {
	
	public static void main(String[] args) {
		
		//type safe
		int deger=10;
		
		List liste=new ArrayList();
		
		liste.add(new Integer(10));
		liste.add(8);
		liste.add(10);
		
		int sum=0;
		for (Object object : liste) {
			sum+=Integer.valueOf(object.toString());
		}
		System.out.println("Toplam: "+sum);
	}
	
}
