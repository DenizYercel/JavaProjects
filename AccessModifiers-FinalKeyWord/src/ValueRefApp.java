
public class ValueRefApp {

	public static void main(String[] args) {
		
	/*	int sayi=8;
		int kare;
		kare=kareAl(sayi);
		System.out.println("sayi :"+sayi);
		System.out.println("Karesi :"+kare);    */

		System.out.println();
		
		ReferencesKitapOrnek ktp= new ReferencesKitapOrnek("Kaþagý", "Ömer Seyfettin", 1990);
		kitapYazdir(ktp);
		
		ktp=kitapKontrol(ktp);
		System.out.println(ktp.toString());
		
		
		
		
		
		System.out.println();
		
		if(ktp.getKitapAdi().equals("Beyaz Atli Prens")) {
			System.out.println("Güncellenmiþ");
		}

		System.out.println("kitabin adi :"+ktp.getKitapAdi());
		System.out.println("kitabin yazari :"+ktp.getYazar());
		System.out.println("kitabin basim yili :"+ktp.getBasimYili());
	
	}
	public static ReferencesKitapOrnek kitapKontrol(ReferencesKitapOrnek kitap) {
		if(kitap.getBasimYili()<2010) {
			kitap=new ReferencesKitapOrnek("Yaprak Dökümü", "Nuri guntekin", 2020);
		}

		return kitap;
	}
	
	
	public static void kitapYazdir(ReferencesKitapOrnek kitap) {
		System.out.println("Kitabin adi :"+kitap.getKitapAdi());
		System.out.println("Kitabin yazari :"+kitap.getYazar());
		System.out.println("Basim yili :"+kitap.getBasimYili());
		
		kitap.setKitapAdi("Beyaz Atli Prens");
		kitap.setYazar("deniz yercel");
		kitap.setBasimYili(1995);
	}
	
	
	public static int kareAl(int i) {
		int sonuc;
		System.out.println("sayi kopyasi(i) :"+i);
		sonuc =i*i;
		i++;
		System.out.println("Sayi kopyasi(i) :"+i);
		return sonuc;
	}

}
