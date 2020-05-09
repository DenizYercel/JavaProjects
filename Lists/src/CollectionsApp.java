import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsApp {
	
		public static void main(String[] args){
		
		List<String> myList=new ArrayList<String>();
		
		myList.add("omer");
		myList.add("ali");
		myList.add("hakan");
		myList.add("deniz");
		myList.add("veli");
		
		System.out.println(myList);
		
		Collections.reverse(myList);
		System.out.println(myList);
		
		System.out.println(Collections.max(myList));
		System.out.println(Collections.min(myList));
		
		Collections.sort(myList);
		System.out.println(myList);
		
		List<Integer> ints=new ArrayList<>();
		
		ints.add(4);
		ints.add(2);
		ints.add(7);
		ints.add(-5);
		System.out.println(ints);
		
		Collections.sort(ints);
		System.out.println(ints);
		
	}

}
