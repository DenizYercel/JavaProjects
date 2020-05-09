
public class Application {

	public static void main(String[] args) {
		
		Kisi kisi=new Kisi("deniz", "yercel",34567891232L,'E');
		System.out.println(kisi.toString());
		
		
		
		Personel p =new Personel("veli", "can", 12312312311L, 'E', 3, "Muhasebe");
		System.out.println(p);
		
		Musteri m=new Musteri("abc-bank-222");
	//	((Kisi)m) // upcasting
		
		Kisi herKisi;
		herKisi=new Personel("ahmet", "hasad", 111, 'E', 112, "idari işler");
		herKisi=kisi;
		herKisi=new Musteri("Hesabım kalsın mahşere");
		
		System.out.println(((Musteri)herKisi).getHesap()); //downcasting
		
		herKisi=p;
		System.out.println(((Personel)herKisi).getDepartman());
	}

}
