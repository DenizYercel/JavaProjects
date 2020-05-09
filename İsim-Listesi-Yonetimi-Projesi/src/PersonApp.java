import java.util.Scanner;

public class PersonApp {
	static Person[] persons=new Person[50];
	static int pCount=0;
	static String secim="";
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args)  {
		
		personEkleOtomatik("Deniz", "Yercel", 1994, CType.E);
		personEkleOtomatik("Samet", "Su", 1990, CType.E);
		personEkleOtomatik("Ayse", "Haydi", 2000, CType.K);
		
		
	
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
				throw new MenuExceptionDeneme("hatali Secim..");
			}
			}
			
		catch (MenuExceptionDeneme e){
			
				System.out.println("Hatali Secim..");
			}
	}
			
	}	
	

	
	
	
	public static void personAra() {
		System.out.print("Arama :");
		String ara=scan.next();
		for(int i=0;i<pCount;i++) {
			if(persons[i].getName().contains(ara) || persons[i].getSurname().contains(ara)){
				System.out.println(persons[i]);
			}
		}
	}
	
	public static void personDetay() {
		System.out.print("Görüntülenecek sahsin indeksi :");
		int index=scan.nextInt();
		System.out.println(persons[index]);
	}
	
	public static void personDegistir() {	
		System.out.print("Degistirilecek sahsin indeksi :");
		int index=scan.nextInt();
		System.out.println(persons[index-1]);
		
		System.out.print("Yeni bilgiler (Ad Soyad DogumYili Cinsiyet) :");
		String name=scan.next();
		String surname=scan.next();
		int bYear=scan.nextInt();		
		CType tip=CType.valueOf(scan.next());
		
		Person p=new Person(name, surname, bYear, tip);
		persons[index]=p;
	}
		

	
	public static void personSil() {
		System.out.print("Silinecek kisinin adi :");
		String name=scan.next();
		for(int i=0;i<pCount;i++) {	
			if(persons[i].getName().equals(name)) {
				int temp=i;
				while(temp<pCount) {
					persons[i]=persons[i+1];
					temp++;
				}		
				pCount--;
			}
		}
	}
	
	
	
	
	
	public static void personEkle() {
		
		System.out.print("Isim giriniz :");
		String name=scan.next();
		System.out.print("Soy isim giriniz :");
		String surname=scan.next();
		System.out.print("Yas giriniz :");
		int bYear=scan.nextInt();
		System.out.print("Cinsiyet giriniz :");
		
		CType tip=CType.valueOf(scan.next());
		
		
		Person person=new Person(name, surname, bYear,tip);
		persons[pCount++]=person;
		
	}
	
	
	public static void personEkleOtomatik(String name,String surname,int bYear,CType t) {
		Person person=new Person(name, surname, bYear, t);
		
		persons[pCount++]=person;
		
	}
	
	public static void personListele() {
		for(int i=0;i<pCount;i++) {
			System.out.println(i+1+" person "+persons[i].getName()+" "+persons[i].getSurname());
		}
	}
	
	public static String menu() throws MenuExceptionDeneme {
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