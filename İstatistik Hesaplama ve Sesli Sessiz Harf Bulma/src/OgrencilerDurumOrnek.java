import java.util.Scanner;

public class OgrencilerDurumOrnek {

	public static void main(String[] args) {
		Scanner  input =new Scanner(System.in);
		int ogrenciSayisi,i=0;
		double ort=0;
		System.out.print("Kaç öğrenci için istatistik yapilacak :");
		ogrenciSayisi=input.nextInt();
		
		String[] ad=new String[ogrenciSayisi];
		String[] soyad =new String[ogrenciSayisi];
		int[] notlar=new int[ogrenciSayisi];
		
		for( i=0;i<ogrenciSayisi;i++) {
			System.out.print(i+1+"."+"Öğrenci Ad,Soyad ve Not :");
			 ad[i]=input.next();
			soyad[i]=input.next();
			notlar[i]=input.nextInt();
		}
		ogrenciYazdir(ad,soyad,notlar,ogrenciSayisi);
		System.out.print("Ortalama :"+ ortalamaYazdir(notlar, ogrenciSayisi)+"\n\n");
		System.out.print("Max sayisi :"+ maxBul(notlar, ogrenciSayisi)+"\n\n");
		System.out.print("Min sayisi :"+ minBul(notlar, ogrenciSayisi)+"\n\n");
		ortalamaUstu(notlar, ogrenciSayisi,ad,soyad);
		ortalamaAltı(notlar, ogrenciSayisi,ad,soyad);
	}
	
	public static void ogrenciYazdir(String ad[],String soyad[],int not[], int ogrenciSayisi) {
		
		System.out.println("-----------------");
		System.out.println("Öğrenciler Listesi :"+"\n");
		for(int i=0;i<ogrenciSayisi;i++) {
			System.out.println(ad[i]+" "+soyad[i]+" "+not[i]);
		}
	}
	
	public static int ortalamaYazdir(int not[],int ogrenciSayisi) {
		int ort,sum=0;
		for(int i=0;i<ogrenciSayisi;i++) {
			sum+=not[i];
		}
		int ort1=(sum/ogrenciSayisi);
		return ort1;
	}
	
	public static int maxBul(int[] not,int ogrenciSayisi) {
		int i=0;
		int max = not[i];
		for(i = 0;i<ogrenciSayisi;i++) {
			 if(not[i]>max) {
				 max=not[i];
			}	

		}
		return max;
	}
	public static int minBul(int[] not,int ogrenciSayisi) {
		int i=0;
		int min=not[i];
		for( i =0;i<ogrenciSayisi;i++) {
			if(not[i]<min) {
				min=not[i];
			}
		}
		return min;
	}
	public static void ortalamaUstu(int[] not,int ogrenciSayisi,String[] name,String[] surname) {
		int i,ort,sum=0;
			for(i=0;i<ogrenciSayisi;i++) {
				sum+=not[i];
			}
			int ort1=(sum/ogrenciSayisi);
			System.out.println("Ortalama üstü öğrenciler:");
			for(i=0;i<ogrenciSayisi;i++) {
			if(ort1<not[i]) {
				System.out.println(name[i]+" "+surname[i]+" "+not[i]+"\n");
			}
		}
	}
	public static void ortalamaAltı(int[] not,int ogrenciSayisi,String[] name,String[] surname) {
		int i,ort,sum=0;
			for(i=0;i<ogrenciSayisi;i++) {
				sum+=not[i];
			}
			int ort1=(sum/ogrenciSayisi);
			System.out.println("Ortalama altı öğrenciler :");
			for(i=0;i<ogrenciSayisi;i++) {
			if(ort1>not[i]) {
				System.out.println(name[i]+" "+surname[i]+" "+not[i]+"\n");
			}
		}
	}
	
	
	

}
