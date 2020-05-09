
import java.util.Scanner;

public class Dikdortgen {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int en,boy;
		System.out.print("Boy girin : ");
		boy=scan.nextInt();
		System.out.print("En girin : ");
		en=scan.nextInt();
		
		
		for(int i=0;i<boy;i++) {
			for(int j=0;j<en;j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		
	
	}
}
