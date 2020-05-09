import java.util.Scanner;

public class ElektrikliCihazApp {
	
	static Scanner input =new Scanner(System.in);
	static ElektrikliCihaz[] cihazlarim=new ElektrikliCihaz[50];
	static int cihazCount=0;
	
	public static void main(String[] args) {
		
		ElektrikliCihaz tv=new ElektrikliCihaz();
		cihazEkleOtomatik("Elektronik","TV", "A", 400);
		cihazEkleOtomatik("Elektronik","CamasirMakinasi", "A+", 200);
		cihazEkleOtomatik("BeyazEsya","Bilgisayar", "C", 1050);
			
		int islem=0;
		
	while(islem!=4) {
		
		
        islem=menu();
		
		switch (islem) {
		case 1:
			cihazEkle();	
			break;
		case 2:
			cihazListele();
			break;
		case 3:
			System.out.println("Hangi cihaz tipleri :");
			input.nextLine();
			String cihazTipi = input.nextLine();
			cihazListeleFilteli(cihazTipi);
			break;
		case 4:
			System.out.println("güle güle");
			break;
		default:
			break;

		}	
	}
	}
	
	private static void cihazListeleFilteli(String cihazTipi) {
		System.out.println(cihazTipi+" cihaz tipindeki cihazlar");
		for(int i=0;i<cihazCount;i++) {
			if(cihazlarim[i].getCihazTipi().equals(cihazTipi)) {
				System.out.println(i+".cihaz:"+cihazlarim[i]);
			}
		}
		
		
	}

	private static void cihazListele() {
		for(int i=0;i<cihazCount;i++) {
			System.out.println(i+".cihaz :"+cihazlarim[i]);
			
			//cihazlarim[i].getClass().equals(BeyazEsya.class)); // bunu ödevde deneyeceksin.
		}
		
	}

	private static void cihazEkleOtomatik(String sinif,String cihazTipi,String enerjiSinifi,int guc) {
		ElektrikliCihaz cihaz=new ElektrikliCihaz();
		if(sinif.equals("BeyazEsya")) {
			cihaz=new BeyazEsya("beyaz", cihazTipi, enerjiSinifi, guc);
		}
		else if(sinif.equals("Elektronik")) {
			cihaz=new Elektronik("HD", 2.6, 16, cihazTipi, enerjiSinifi, guc);
		}
		cihaz.setCihazTipi(cihazTipi);
		cihaz.setEnerjiSinifi(enerjiSinifi);
		cihaz.setGucWatt(guc);
		
		cihazlarim[cihazCount++]=cihaz;
		
	}
	

	private static void cihazEkle() {
		ElektrikliCihaz cihaz=new ElektrikliCihaz();
		input.nextLine();
		System.out.print("Cihaz tipi");
		String cihazTipi= input.nextLine();
		System.out.print("Enerji sinifi (A,A+,B,B,B+,C,C+");
		String enerjiSinifi=input.nextLine();
		System.out.print("Güc (watt) cinsinden nedir");
		int gucWatt=input.nextInt();
		System.out.println("sinif giriniz :");
		String sinif=input.nextLine();
		if(sinif.equals("BeyazEsya")) {
			System.out.print("renk giriniz :");
			String renk=input.nextLine();
			cihaz=new BeyazEsya(renk, cihazTipi, enerjiSinifi, gucWatt);
		}
		else if(sinif.equals("Elektronik")) {
			System.out.print("Ekran boyutu ");
			String ekranBoyutu=input.nextLine();
			System.out.print("CPU(GHZ) :");
			double cpuGHZ=input.nextDouble();
			System.out.print("Ram (GB)");
			double ramGB=input.nextDouble();
			cihaz=new Elektronik(ekranBoyutu, cpuGHZ, ramGB, cihazTipi, enerjiSinifi, gucWatt);
		}
		
		cihazlarim[cihazCount++]=cihaz;
		
	}


	static int menu() {
		System.out.println("1 - Cihaz Ekle :");
		System.out.println("2 - Listele :");
		System.out.println("3 - Filtreli Liste :");
		System.out.println("4 - Cikis:");
		System.out.print("Seciminiz :");
		int secim=input.nextInt();
		return secim;
	}

}
