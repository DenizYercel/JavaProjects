import java.util.LinkedList;

public class LinkedListApp {

	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<String>();
		
		list.add("deniz");
		list.add("batur");
		list.add("ayse");
		
		System.out.println(list);
		
		list.addFirst("Reis");
		
		System.out.println(list);
		
		System.out.println(list.peekLast());
		
		list.add(1, "samet");
		System.out.println(list);
	//	list.
		
		
	}

}
