import java.util.Scanner;

public class TestMovieRental {

	public static void main(String[] args) {
		
		MovieRental[] movies=new MovieRental[15];

		int index=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter movie name :");
		String name=scan.next();
		
		while(name.equalsIgnoreCase("Exit")) {
			System.out.println("Enter number of days :");
			int days=scan.nextInt();
			System.out.println("Enter price per days :");
			double price=scan.nextDouble();
			movies[index++]=new MovieRental(name, days, price);
			
			System.out.println("Enter movie name :");
			
			name=scan.next();
		}
		
		
		
	}

}
