import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AppOrnek {
static String harf;
	public static void main(String[] args) {
		
		
		ElektrikliCihaz[] eCihaz=new ElektrikliCihaz[10];
		
		
		CamasirMakinasi camasirMakinasi= new CamasirMakinasi( 0, 0, null, null, "Vestel", 2, 10);
		BulasikMakinasi bulasikMakinasi= new BulasikMakinasi(0, 0, null, null, 5, "Bosch");
		BulasikMakinasi bulasikMakinasi2=new BulasikMakinasi(0, 0, null, null, 2, "Arcelik");
		Buzdolabi buzdolabi= new Buzdolabi(0, 0, null, null, 1500, "Ariston");
		CepTelefonu cepTelefonu= new CepTelefonu(0, 0, null, 0, 20, 25, 1, "Apple");
		Bilgisayar bilgisayar= new Bilgisayar(0, 0, null, 60, 0, 0, 50, "Masaüstü");
		Bilgisayar  bilgisayar2=new Bilgisayar(0, 0, null, 20, 32, 50, 1000, "Laptop");
		
		Scanner scan=new Scanner(System.in);
		System.out.print("1-Beyaz Esya\n2-Elektronik  :Seciniz(cikmik icin exit yaziniz):");
		String giris=scan.next();
		while(!giris.equalsIgnoreCase("exit")) {
			
			int sayi=scan.nextInt();
			if(sayi==1) {
				System.out.print("a-Camasir\nb-Bulasik\nc-Buzdolabi\n");
				 harf=scan.next();
				switch (harf) {
				case "a":
					System.out.print(camasirMakinasi.toString()+"\n");
					break;
				case "b":
					System.out.print(bulasikMakinasi.toString()+"\n");
					break;
				case "c":
					System.out.print(buzdolabi.toString()+"\n");
					break;
				}
			}
				
				if(sayi==2) {
					System.out.print("d-Cep Telefonu\ne-Bilgisayar");
					harf=scan.next();
					switch (harf) {
					case "d":
						System.out.print(cepTelefonu.toString());
						break;
					case "e":
						System.out.print(bilgisayar.toString());
						break;
					}
			}
			
			System.out.print("1-Beyaz Esya\n2-Elektronik  :Seciniz(cikmik icin exit yaziniz):");
			if(!giris.equalsIgnoreCase("exit"))
				{giris=scan.next();}
			}
			
		
		
		
		}
	}

