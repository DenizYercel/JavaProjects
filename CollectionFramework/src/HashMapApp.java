
import java.util.HashMap;

public class HashMapApp {

	public static void main(String[] args) {
		
		HashMap<Integer, String> list=new HashMap<Integer, String>();
		
		list.put(6, "Ankara");
		list.put(1, "Adana");
		list.put(34, "İstanbul");
		
		
		System.out.println(list);
		System.out.println(list.get(34));
		
		list.remove(1);
		System.out.println(list);
		
		System.out.println(list.containsValue(6));
		
	}

}
