package faktoriyelHesaplama;

import java.util.Scanner;

public class MukemmelSayi {
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		
		int islem=0;
		
		while(islem!=3) {
			islem=menu(islem);
			int sayi;
			switch (islem) {
			case 1:
					System.out.print("Sayiyi giriniz :");
					sayi=scan.nextInt();
					sayiMukemmelMi(sayi);
				break;

			case 2:
				System.out.print("Ka�a kadar listeyelim :");
				sayi=scan.nextInt();
				mukemmelSayi(sayi);
				break;
			case 3:
				System.out.println("Gule gule..");
			break;
			}
			
		}
		
		
		

	}
	
	
	
	
	public static void sayiMukemmelMi(int sayi) {
		int total=0;
		for(int i=1;i<=sayi/2;i++) {
			if(sayi%i==0) {
				total+=i;
		}
		}
		if(sayi==total) {
			System.out.println("Sonu� :  Sayi m�kemmeldir.\n");
		}
		else
			System.out.println("Sonu� : Sayi m�kemmel degildir.\n");
		}
		
	
	
	public static boolean sayiyaKadarMukemmelBulan(int sayi) {
		int total=0;
		for(int i=1;i<=sayi/2;i++) {
			if(sayi%i==0) {
				total+=i;
		}
		}
		if(total==sayi){
		return true;
		}
		else{
		return false;
		}
			
	}
	
	
	static void mukemmelSayi(int sayi) {
		int total=0;
		for(int i=1;i<sayi;i++) {
			if(sayiyaKadarMukemmelBulan(i)) {	
				total=i;
				System.out.println(total);
			}
		}
	}
	
	
	
	
	
	
	public static int menu(int sayi) {
		System.out.println("   MEN� ");
		System.out.println("1 - Sayi mukemmel mi Kontrol et :");
		System.out.println("2 - Bir sayiya kadar bulunan  tum mukemmel sayilar :");
		System.out.println("3 - cikis :");
		System.out.print("Seciminiz :");
		int secim=scan.nextInt();
		return secim;
		
	}

}
