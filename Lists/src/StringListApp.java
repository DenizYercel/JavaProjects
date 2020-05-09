import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringListApp {
	
		public static void main(String[] args){
		
		List<String> myList=new ArrayList<String>();
		
		myList.add("omer");
		myList.add("omtur");
		myList.add("ali");
		myList.add("hakan");
		myList.add("deniz");
		myList.add("veli");
		
		Collections.sort(myList);
		System.out.println(myList);
		
		Collections.sort(myList, new StringCompareByLengt());
		System.out.println(myList);
		
		Collections.sort(myList,new StringCompareReverse());
		System.out.println(myList);
	}

}

class StringCompareByLengt implements Comparator<String>{
	
	public int compare(String one,String two) {
		return Integer.valueOf(one.length()).compareTo(two.length());
	}
}

class StringCompareReverse implements Comparator<String>{
	
	public int compare(String one,String two) {
		return two.compareTo(one);
	}
	
}