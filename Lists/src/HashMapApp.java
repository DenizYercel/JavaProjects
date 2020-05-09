import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapApp {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		HashMap<Integer, String> plakaSehir=new HashMap<Integer, String>();
		
		plakaSehir.put(6, "Ankara");
		plakaSehir.put(1, "Adana");
		plakaSehir.put(14, "Bolu");
		plakaSehir.put(34, "Istanbul");
		
	/*	System.out.print("Plaka kodu giriniz :");
		Integer plaka=input.nextInt();
	
		plakaSehir.entrySet().forEach(entry->{
			if(entry.getKey()==plaka) {
			System.out.println(entry.getValue());
				
		}
			});
		
		*/
		
		HashMap<String, String> girisKontrol=new HashMap<String, String>();
		
		girisKontrol.put("ahmet", "rahat");
		girisKontrol.put("veli", "yildiz");
		girisKontrol.put("deniz", "yercel");
		
		System.out.print("Kullanici adi giriniz :");
		String kAdi=input.next();
		System.out.print("Þifre giriniz :");
		String pass=input.next();

		
		girisKontrol.entrySet().forEach(entry->{
			if(entry.getKey().equals(kAdi)) {
				if(entry.getValue().equals(pass)) {
					System.out.println("Giris basarili.");
				}
				else {
					System.out.println("giris basarisiz.");
				}
			}
		});
		
		}
		
		
		
}
