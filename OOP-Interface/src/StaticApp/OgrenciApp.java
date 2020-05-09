package StaticApp;

public class OgrenciApp {
	static Ogrenci[] ogrenciler=new Ogrenci[10];

	public static void main(String[] args) {
		
		
		ogrenciler[0]=new Ogrenci("deniz");
		
		ogrenciler[1]=new Ogrenci("mehmet");

	
		ogrenciler[2]=new Ogrenci("ayse");
	
		ogrenciler[3]=new Ogrenci("fatma");
		
		
		System.out.println(Ogrenci.numarator);
		System.out.println(ogrenciler[1].numarator);
	
		
		
		
		
	}

}
