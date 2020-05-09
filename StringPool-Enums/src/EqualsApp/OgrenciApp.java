package EqualsApp;

public class OgrenciApp {

	public static void main(String[] args) {
		
		Ogrenci ogr1=new Ogrenci(1,"deniz","yercel");
		Ogrenci ogr2=new Ogrenci(1, "deniz", "yercel");
		
		System.out.println(ogr1==ogr2);
		System.out.println(ogr1.equals(ogr2));
		
		

	}

}
