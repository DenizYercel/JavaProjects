import java.util.ArrayList;
import java.util.Scanner;

public class PersonArrayListApp {
	
	static String secim="";
	static ArrayList<PersonArrayList> myPersons=new ArrayList<PersonArrayList>();
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		
		myPersons.add(new PersonArrayList("deniz", "yercel", 1994, "E"));
		myPersons.add(new PersonArrayList("mehmet", "tasiyan", 2001, "E"));
		myPersons.add(new PersonArrayList("ayse", "uygur", 1990, "K"));
		
	while(!secim.equals("C")) {
			
			try {
				
				secim=menu();
					
			switch(secim) {
		case "E":
				personEkle();
			break;
		case "S":
			personSil();
			break;
		case "D":
			personDegistir();
			break;
		case "L":
			personListele();
			break;
		case "G":
			personDetay();
			break;
		case "A":
			personAra();
			break;
		case "C":
			System.out.println("güle güle...");
			break;
			default:
				throw new Exception("hatali Secim..");
			}
			}
			
		catch (Exception e){
			
				System.out.println("Hatali Secim..");
			}
	}

		
		
	}
	
	
	public static void personAra() {
		String ara = null;
		try {
			System.out.print("Arama :");
			ara = scan.next();
		} catch (Exception e) {
			System.out.println("hatali veri girdiniz..");
		}
		for(int i=0;i<myPersons.size();i++) {
			if(myPersons.get(i).getName().contains(ara) || myPersons.get(i).getSurName().contains(ara)){
				System.out.println(myPersons.get(i));
			}
		}
	}
	
	
	public static void personDetay() {
		int index = 0;
		try {
			System.out.print("Görüntülenecek sahsin indeksi :");
			index = scan.nextInt();
		} catch (Exception e) {
			System.out.println("hatali veri girdiniz..");
		}
			System.out.println(myPersons.get(index));
		
	}
	
	public static void personDegistir() {
		int index = 0;
		String name = null;
		String surname = null;
		int bYear = 0;
		String gen = null;
		try {
			System.out.print("Degistirilecek sahsin indeksi :");
			index = scan.nextInt();
			
			System.out.print("Yeni bilgiler (Ad Soyad DogumYili Cinsiyet) :");
			name = scan.next();
			surname = scan.next();
			bYear = scan.nextInt();	
			gen = scan.next();
		} catch (Exception e) {
			System.out.println("hatali veri girdiniz...");
		}
		PersonArrayList p=new PersonArrayList(name, surname, bYear, gen);
		myPersons.set(index, p);
	}
	
	public static void personListele() {	
		for(int i=0;i<myPersons.size();i++) {
			System.out.println(myPersons.get(i).getName() +" "+myPersons.get(i).getSurName());
		}
	}
	
	public static void personSil() {
		String name = null;
		try {
			System.out.print("Silinecek kisinin adini giriniz :");
			name = scan.next();
		} catch (Exception e) {
			System.out.println("hatali veri girdiniz..");
		}
		
		for(int i=0;i<myPersons.size();i++) {
			if(name.equals(myPersons.get(i).getName())) {
				myPersons.remove(i);
				
			}
			
			}
		
				System.out.println("silme iþlemi yapilamadi");
			
		
		
	}
	
	
	public static void personEkle() {
		String name = null;
		String surname = null;
		int bYear = 0;
		String gen = null;
		try {
			System.out.print("Isim giriniz :");
			name = scan.next();
			System.out.print("Soy isim giriniz :");
			surname = scan.next();
			System.out.print("Yas giriniz :");
			bYear = scan.nextInt();
			System.out.print("Cinsiyet giriniz :");
			gen = scan.next();
		} catch (Exception e) {
			System.out.println("hatali veri girdiniz ..");
		}
		
		PersonArrayList p=new PersonArrayList(name, surname, bYear, gen);
		
		myPersons.add(p);
	}
	
	public static String menu() throws Exception {
		System.out.println("--------MENU--------");
		System.out.println("EKLE (E):");
		System.out.println("SIL  (S):");
		System.out.println("DEGISTIR (D):");
		System.out.println("LISTELE (L):");
		System.out.println("DETAY GORUNTULE (G):");
		System.out.println("ARA (A):");
		System.out.println("CIKIS (C):");
		System.out.print("Seciminiz :");
		
		String secim = null;
		try {
			secim = scan.next();
		} catch (Exception e) {
			System.out.println("Hatali Secim..");
		}
		
		System.out.println();
		return secim;
		
	}

}
