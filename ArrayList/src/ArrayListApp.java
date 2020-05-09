import java.util.ArrayList;

public class ArrayListApp {

	public static void main(String[] args) {
		
		ArrayList myList=new ArrayList();
		
		myList.add(new Integer(1));
		myList.add("omer");
		myList.add(1.5);
		
		System.out.println(myList);
		
		
		for (Object object : myList) {
			
			System.out.println(object + " "+ object.getClass());
		}
		
		myList.add("deniz");
		myList.remove(1.5);
		System.out.println(myList);
		
		for(int i=0;i<myList.size();i++) {
			System.out.println(myList.get(i));
		}
		
		myList.set(1, "yercel");
		System.out.println(myList);
	}

}
