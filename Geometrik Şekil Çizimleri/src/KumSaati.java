
import java.util.Scanner;

public class KumSaati {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int boy; // sat�r
		int yildizSayisi;
		int boslukSayisi = 0;

		System.out.print("Boy giriniz : ");
		boy = scan.nextInt();

		yildizSayisi = boy;

		if (boy % 2 != 0) {

			for (int i = 0; i < boy; i++) {
				
				for (int j = 0; j < yildizSayisi; j++) {		
					System.out.print("*");			
				}
				
				if (i < (boy / 2)) {
					yildizSayisi -= 2;
					boslukSayisi++;
				} else {
					yildizSayisi += 2;
					boslukSayisi--;
				}
				
				System.out.print("\n");
				for (int k = 0; k < boslukSayisi; k++) {
					
					System.out.print(" ");
				}
			}
		} else {
			System.out.print("Tek sayi giriniz...");
		}

	}
}
