
public class BagliListe<T> {
	
	 int size=0;
	 Node<T> firstNode=null;
	 


	public BagliListe() {
		super();
	}


	public Node getFirtstNode() {
		return firstNode;
	}


	public void setFirtstNode(Node firtstNode) {
		this.firstNode = firtstNode;
	}


	public int getSize() {
		return size;
	}


	
	
	public void add(T o) {
		Node<T> n=new Node(o);
		if(firstNode==null) {
		firstNode=n;
		}
		else {
			Node<T> temp=firstNode;
			while(temp.getNextNode()!=null) {
				temp=temp.getNextNode();
			}
			temp.setNextNode(n);
			
		}
		size++;
	}
	
	
	
	public void printList() {
		
		StringBuffer sb=new StringBuffer();
		Node<T> temp;
		temp=firstNode;
		if(temp!=null) {
			sb.append("[");
			sb.append(temp.getObject());
			while(temp.getNextNode()!=null) {
				temp=temp.getNextNode();
				sb.append(",");
				sb.append(temp.getObject());
		}
			sb.append("]");
		}
		else
			sb.append("Null");
		
		System.out.println(sb.toString());
		
	}
	
	public void addToLocation(int location,T o) {
		Node<T> n=new Node(location, o);
		if(firstNode==null) {
		firstNode=n;
		}
		else {
			Node temp=firstNode;
			int i=0;
			while(i<location-1) {
				temp=temp.getNextNode();
				i++;
			}
			Node<T> temp1;
			temp1=temp.nextNode;
			temp.nextNode=n;
			n.nextNode=temp1;
			
		}
	}
	
	public void remove(T item) {
		
	    while(firstNode.object==item)        
	    {

	        firstNode=firstNode.nextNode;

	    }
	
	    
	    Node<T> temp, temp1;
	    temp=firstNode;
	    temp1=firstNode.nextNode;
	    while(temp1!=null)
	    {
	        if(temp1.object==item)
	        {
	        Node next=temp1.nextNode;
	        temp.nextNode=next;
	        temp1=next;
	        }
	        else
	        {
	            temp=temp1;
	            temp1=temp1.nextNode;
	        }
	}
		
	}
	
	public void contains(T o) {
		Node<T> temp=firstNode;
		int kontrol=0;
		while(temp!=null){
			if(temp.getObject().equals(o)) {
				kontrol=1;
				break;
			}
			temp=temp.nextNode;
		}
		if(kontrol==1)
		System.out.println(o +"\n Nesne bulundu.. ");
		else
			System.out.println("bulunamadi..");
	}
	
	
	
		}
	

