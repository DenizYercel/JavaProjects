import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorApp {
	public static void main(String[] args) {
		
		List<String> myList=new ArrayList<String>();
		
		myList.add("omer");
		myList.add("ali");
		myList.add("hakan");
		myList.add("deniz");
		myList.add("veli");
		
		System.out.println(myList);
		
		Iterator<String> itr=myList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
