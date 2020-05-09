
import java.util.Scanner;

public class Ucgen {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);

		
		int boy;
		int sayac=1;
		
		System.out.print("Boy giriniz : ");
		boy=scan.nextInt();
		
		for(int i=0;i<boy;i++) {
			for(int j=0;j<sayac;j++) {
				System.out.print("* ");
			}
			sayac++;
			System.out.print("\n");
		}
	}

}
