
public class Node<T> {

		Node<T> nextNode;
	 Object object;
		Node<T> prevNode;
		int location;
	
	public Node(Object object) {
		super();
		this.object=object;
	}
	public Node(int location,Object object) {
		super();
		this.location=location;
		this.object=object;
	}
	
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
	public Node getFirstNode() {
		return prevNode;
	}
	public void setFirstNode(Node firstNode) {
		this.prevNode = firstNode;
	}
	
	
        
} 
	
	
