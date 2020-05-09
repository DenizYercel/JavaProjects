package IkiBoyutluDuzlem;

public class TestApp {
	public static void main(String[] args) {
		
		Point first=new Point(6,5);
		System.out.println("distance(0,0)= " + first.distance());
		
		Point second = new Point(3,1);	
		System.out.println("distance(second)= " + first.distance(second));
		
		
	}
}
