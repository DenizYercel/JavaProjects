
public class MovieRental {
	private String movieName;
	private int days;
	public double pricePerDay;
	private static int numMovies=0;
	
	public MovieRental(String movieName,int days,double pricePerDay) {
		numMovies++;
		this.movieName=movieName;
		this.days=days;
		if(days>4)
		 this.pricePerDay=pricePerDay-pricePerDay*0.2;
		else
			this.pricePerDay=pricePerDay;
		
	}
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String mName) {
		movieName=mName;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int d) {
		days=d;
	}
	public double getPrice() {
		return pricePerDay;
	}
	public void setPrice(double p) {
		pricePerDay=p;
	}
	
	public static int getNumMovies() {
		return numMovies;
	}
	public double calculateCost() {
		return pricePerDay*days;
	}
	
	public String toString() {
		return "Movie Name" + movieName + "\nPrice :"+ pricePerDay +"\nNumber of days :"+days;
	}
}
