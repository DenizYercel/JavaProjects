package IkiBoyutluDuzlem;

public class Point {
	int x,y;
	
	public Point() {
		
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	double distance() {
		return Math.sqrt((0-getX())*(0-getX())+(0-getY()*(0-getY())));
	}
	
	double distance(int x,int y) {
		return Math.sqrt(this.x-x)*(this.x-x)+(this.y-y)*(this.y*y);
		
	}
	double distance(Point p) {
		return x;
		
	}
	

}