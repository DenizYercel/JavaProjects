import java.util.Scanner;

public class OgrenciApp {
	static int ogrSayisi = 0;
	static int i;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Kaç öğrenci olacak :");
		
		ogrSayisi=scan.nextInt();
		
		String isim,soyIsim;
		int id = 0;
		
		Ogrenci[] ogrenci=new Ogrenci[ogrSayisi];  // Ogrenci classını gösteren bir dizi işaretçisi oluyor..
		
		for(i=0;i<ogrenci.length;i++) {
			System.out.print("İsim  "+""+"Soyisim  "+""+"ID  ");
			isim=scan.next();
			soyIsim=scan.next();
			id=scan.nextInt();
			ogrenci[i]=new Ogrenci(isim, soyIsim, id);
		}
	
		for(i=0;i<ogrenci.length;i++) {
			
		System.out.println("ogrenci["+i+"] =" +ogrenci[i] );
		}
		
		
		
		
		
		
		
	}
	
	

}
