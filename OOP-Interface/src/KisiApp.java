import java.util.Scanner;

public class KisiApp {
	static Scanner input = new Scanner(System.in);
	static Kisi[] kisilerim= new Kisi[25];
	static int kisiCount=0;
	//unvan ogretmen mi ogrenci mi degerini tutuyor..

	public static void main(String[] args) {
		
		
		kisiEkleOtomatik("Ogrenci","Deniz","Yercel",124124);
		kisiEkleOtomatik("Ogrenci","Veli", "CAMCI", 6789);
		kisiEkleOtomatik("Ogretmen","Ceren", "kazan",242213123);
		kisiEkleOtomatik("Ogretmen", "Deniz", "Yercel", 111111);
		kisiEkleOtomatik("Ogrenci","Samet", "nalbur", 22222);
		kisiEkleOtomatik("Ogrenci", "Mahmut", "su", 444444);
		kisiEkleOtomatik("Ogrenci", "seyma", "resim", 1234435647);
		
		
		
		int islem = 0;
		while (islem != 5) {

			islem = menuYazdirveIslemAl();

			switch (islem) {
			case 1:
				kisiEkle();
				break;

			case 2:
				kisiEkle();
				break;

			case 3:
				kisiListele();
				break;

			case 4:
				input.nextLine();
				System.out.print("Ogretmen icin Ogretmen Ogrenci icin Ogrenci yaziniz :");
				String unvan=input.nextLine();
				kisiListeleFiltreli(unvan);
				break;
			case 5:
				System.out.println("Güle Güle");
				break;
				
			}
		}

		
	}
	
	private static void kisiEkleOtomatik(String unvan,String isim, String soyisim, double tcKimlikNo) {
		
		Kisi kisi;
		if(unvan.equals("Ogretmen")) {
			kisi=new Ogretmen(isim, soyisim, tcKimlikNo, unvan, 22);
		}
		else {
			kisi=new Ogrenci(isim, soyisim, tcKimlikNo, unvan, 82, 8);
		}
		kisilerim[kisiCount++]=kisi;
	}
	private static void kisiEkle() {

		Kisi kisi= null;

		input.nextLine();
		
		System.out.print("Ýsim :");
		String isim = input.nextLine();
		System.out.print("Soy Ýsim :");
		String soyIsým=input.nextLine();

		System.out.print("TC kimlik no :");
		double tcKimlikNo = input.nextDouble();
		
		input.nextLine();
		System.out.print("Unvani giriniz :");
		String unvan=input.nextLine();
		
		
		if(unvan.equals("Ogretmen")) {
			
			System.out.println("sicil NO :");
			int sicilNo= input.nextInt();
		
	 	   kisi=new Ogretmen(isim, soyIsým, tcKimlikNo, unvan, sicilNo);
		}
		else if(unvan.equals("Ogrenci")) {
			System.out.print("Okul NO :");
			int okulNo= input.nextInt();
			
			System.out.print("Sinif NO :");
			int sinifNo= input.nextInt();
			
			kisi=new Ogrenci(isim, soyIsým, tcKimlikNo, unvan, okulNo, sinifNo);
		}
			
		
		
		kisilerim[kisiCount++] = kisi;
				
	}
	
private static void kisiListele() {
		
		for(int i=0; i<kisiCount; i++) {
			System.out.println(i+1+".kisi:"+kisilerim[i]);
		}
		
	}
	

private static void kisiListeleFiltreli(String unvan) {
	System.out.println(unvan+" kisi tipindeki kisiler");
	for(int i=0; i<kisiCount; i++) {
		if (kisilerim[i].getUnvan().equals(unvan)) {
			System.out.println(i+1+". kisi:"+kisilerim[i]);
		}
			
	}
	
}

	static int menuYazdirveIslemAl() {
		System.out.println("1 - Ogretmen Ekle :");
		System.out.println("2 - Ogrenci Ekle :");
		System.out.println("3 - Listele :");
		System.out.println("4 - Listele(Ogretmen mi Ogrenci mi ? :");		
		System.out.print("5 - Cikis :");
		int secim = input.nextInt();
		return secim;
	}

}