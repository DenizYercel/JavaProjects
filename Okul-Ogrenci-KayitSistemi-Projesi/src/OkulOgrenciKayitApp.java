import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class OkulOgrenciKayitApp {
	static Scanner scan=new Scanner(System.in);
	 static ArrayList<Okul> oListe=new ArrayList<Okul>();
	static int secim;
	
	public static void main(String[] args) {
		
		otomatikEkle();
	//	printOkul(oListe);
	//	printOgretmen(oListe);
	//	printOgrenci(oListe);
		
		
		while(secim!=5) {
			
			try {
				
				secim=menu();
					
			switch(secim) {
		case 1:
			okulIslemleri();
			break;
		case 2:
			sinifIslemleri();
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			System.out.println("g�le g�le...");
			break;
			default:
				throw new MenuExceptionDeneme("hatali Secim..");
			}
			}
			
		catch (MenuExceptionDeneme e){
			
				System.out.println("Hatali Secim..");
			}
	}
			
			}
			
			
			
	private static void sinifIslemleri() {
		
		System.out.println("--------SINIF ISLEMLERI MENUSU-----");
		System.out.println("1 - SINIF EKLEME :");
		System.out.println("2 - SINIF LISTELEME");
		System.out.println("3 - SINIF SECIMI:");
		System.out.println("6 - ANA MENU:");
		System.out.print("SECMINIZ :");
		
		int gezgin = 0 ;
		try {
			gezgin = scan.nextInt();
		} catch (Exception e) {
			System.out.println("Hatali Secim..");
		}
		
		if(gezgin==1) {
			System.out.print("Sinif ismini giriniz :");
			scan.nextLine();
			String sName=scan.nextLine();
			Sinif sName=new Sinif(sName);
			oListe.get(0).getSinifList().get(index);
			
			
		}
		if(gezgin==2) {
			System.out.println(oListe.toString());
			
		}
		if(gezgin==3) {
			System.out.println(oListe.toString());
			System.out.println();
			System.out.println("Secilecek okulun adini giriniz..");
			scan.nextLine();
			String s=scan.nextLine();
			Okul o = new Okul();
			o.setOkulAdi(s);
		}
		if(gezgin==6) {
			try {
				menu();
			} catch (MenuExceptionDeneme e) {
				System.out.println("hatali girdiniz...");
			}
		}
		
	}



	private static void okulIslemleri() {
		System.out.println("--------OKUL ISLEMLERI MENUSU-----");
		System.out.println("1 - OKUL EKLEME :");
		System.out.println("2 - OKUL LISTELEME");
		System.out.println("3 - OKUL SECIMI:");
		System.out.println("4 - ANA MENU:");
		System.out.print("SECMINIZ :");
		
		int gezgin = 0 ;
		try {
			gezgin = scan.nextInt();
		} catch (Exception e) {
			System.out.println("Hatali Secim..");
		}
		
		if(gezgin==1) {
			System.out.print("Okul ismini giriniz :");
			scan.nextLine();
			String okulName=scan.nextLine();
			Okul oName=new Okul(okulName);
			oListe.add(oName);
			
		}
		if(gezgin==2) {
			System.out.println(oListe.toString());
			
		}
		if(gezgin==3) {
			System.out.println(oListe.toString());
			System.out.println();
			System.out.println("Secilecek okulun adini giriniz..");
			scan.nextLine();
			String s=scan.nextLine();
			Okul o = new Okul();
			o.setOkulAdi(s);
		}
		if(gezgin==4) {
			try {
				menu();
			} catch (MenuExceptionDeneme e) {
				System.out.println("hatali girdiniz...");
			}
		}
		
	}



	public static int menu() throws MenuExceptionDeneme {
		System.out.println("--------MENU--------");
		System.out.println("1 - OKUL ISLEMLERI :");
		System.out.println("2 - SINIF ISLEMLERI");
		System.out.println("3 - OGRETMEN ISLEMLERI:");
		System.out.println("4 - OGRENCI ISLEMLERI");
		System.out.println("5 - CIKIS :");
		System.out.print("Seciminiz :");
		
		int secim = 0 ;
		try {
			secim = scan.nextInt();
		} catch (Exception e) {
			System.out.println("Hatali Secim..");
		}
		
		System.out.println();
		return secim;
		
	}
	
	
	
	public static void printOgrenci(List list) {
		for(int i=0;i<oListe.size();i++) {
			for(int j=0;j<oListe.get(i).getSinifList().size();j++) {
				Iterator temp=oListe.get(i).getSinifList().get(j).getOgrenciList().iterator();
				while(temp.hasNext()) {
					System.out.println(temp.next());
				}
			}
		}
	}
	
	public static void printOgretmen(List list) {
		for(Okul  o:oListe) {
			System.out.println(o.getOgretmenList());
		}
	}
	public static void printOkul(List list) {
		for(Okul o:oListe) {
			System.out.println(o);
		}
	}

	private static void otomatikEkle() {
		Okul okul1=new Okul("jale tezer ilkokulu");
		Okul okul2=new Okul("Mevlana �lkokulu");
		Okul okul3=new Okul("�ehit Kubilay ilkokulu");
		oListe.add(okul1);
		oListe.add(okul2);
		oListe.add(okul3);
		
		
		Sinif sinif1=new Sinif(15, 'B');
		Sinif sinif2=new Sinif(21, 'A');
		Sinif sinif3=new Sinif(66, 'C');
		Sinif sinif4=new Sinif(77, 'D');
		Sinif sinif5=new Sinif(79, 'E');
		
		Ogretmen ogretmen=new Ogretmen("fatma", 1970, CType.K, 21);
		Ogretmen ogretmen2=new Ogretmen("hakan", 1945, CType.E, 24);
		Ogretmen ogretmen3=new Ogretmen("orhan", 1991, CType.E, 60);
		Ogretmen ogretmen4=new Ogretmen("leyla", 1955, CType.K,90);
		Ogretmen ogretmen5=new Ogretmen("uygur", 1989, CType.E, 80);
		
		
		oListe.get(0).sinifEkle(sinif1);
		
		oListe.get(1).sinifEkle(sinif2);
		oListe.get(1).sinifEkle(sinif3);
		
		oListe.get(2).sinifEkle(sinif4);
		oListe.get(2).sinifEkle(sinif5);
		
		
		oListe.get(0).sinifaOgretmenAta(ogretmen, sinif1);
		
		oListe.get(1).sinifaOgretmenAta(ogretmen2, sinif2);
		oListe.get(1).sinifaOgretmenAta(ogretmen3, sinif3);
		
		oListe.get(2).sinifaOgretmenAta(ogretmen4, sinif4);
		oListe.get(2).sinifaOgretmenAta(ogretmen5, sinif5);
		
		
		oListe.get(0).ogretmenEkle(ogretmen);
		
		oListe.get(1).ogretmenEkle(ogretmen2);
		oListe.get(1).ogretmenEkle(ogretmen3);
		
		oListe.get(2).ogretmenEkle(ogretmen4);
		oListe.get(2).ogretmenEkle(ogretmen5);
		
		
		
		Ogrenci ogrenci=new Ogrenci("samet", 2002, CType.E, 15);
		Ogrenci ogrenci1=new Ogrenci("deniz", 1994,CType.E, 82);
		Ogrenci ogrenci2=new Ogrenci("ayse", 2001,CType.K, 45);
		Ogrenci ogrenci3=new Ogrenci("vural", 1997, CType.E, 99);
		Ogrenci ogrenci4=new Ogrenci("kardelen", 2005,CType.K, 62);
		Ogrenci ogrenci5=new Ogrenci("turkan", 2005, CType.E, 11);
		Ogrenci ogrenci6=new Ogrenci("arya", 1994,CType.K, 21);
		Ogrenci ogrenci7=new Ogrenci("hale", 2001,CType.K, 23);
		Ogrenci ogrenci8=new Ogrenci("polat", 1997, CType.E, 24);
		Ogrenci ogrenci9=new Ogrenci("cemil", 2005,CType.E, 27);
		
		
		
//		oListe.get(0).getSinifList().get(0).ogrenciEkle(ogrenci);
		
		sinif1.ogrenciKayit(ogrenci);
		sinif1.ogrenciKayit(ogrenci1);
		
		sinif2.ogrenciKayit(ogrenci2);
		sinif2.ogrenciKayit(ogrenci3);
		
		sinif3.ogrenciKayit(ogrenci4);
		sinif3.ogrenciKayit(ogrenci5);
		
		sinif4.ogrenciKayit(ogrenci6);
		sinif4.ogrenciKayit(ogrenci7);
		
		sinif5.ogrenciKayit(ogrenci8);
		sinif5.ogrenciKayit(ogrenci9);
		
	
		
		
	/*	System.out.println(oListe);
		System.out.println();
		System.out.println(oListe.get(0).getSinifList());
		System.out.println();
		System.out.println(oListe.get(0).getOgretmenList());
		System.out.println(oListe.get(0).getSinifList().get(0).getOgrenciList()); */
		
		
	/*	System.out.println(oListe.get(1).getOgretmenList());
		System.out.println(oListe.get(1).getSinifList().get(0).getOgrenciList());  */
		
		
	/*	System.out.println(oListe.get(2).getSinifList());
		System.out.println(oListe.get(2).getSinifList().get(0).getOgrenciList());  */
	}
		
}
	