import java.util.List;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListApp {
	public static void main(String[] args) {
		
		List<String> myList=new ArrayList<String>();   //daha abstract yapýyoruz,bagýmlýlýgý azaltýyoruz.
													//abc =new LinkedList<String>();
		myList.add("omer");
		myList.add("ali");
		myList.add("hakan");
		myList.add("deniz");
		myList.add("veli");
		
		System.out.println(myList);
		
	
	/*	Stack<String> stack=new Stack<String>();
		
		stack.addAll(myList);
		while(!stack.empty()) {
			System.out.print(stack.pop()+" ");  */
		
		
		
		Stack<String> myStack=new Stack<String>();
		
		for (String item : myList) {
			myStack.push(item);
		}
		myList=new ArrayList<String>();
		
		while(!(myStack.empty())) {
			myList.add(myStack.pop());
		}
		System.out.println(myList);
		
		}
		
		
		
		
		
	}


