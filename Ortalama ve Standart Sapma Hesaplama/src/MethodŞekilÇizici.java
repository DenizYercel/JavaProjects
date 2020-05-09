import java.util.Scanner;

public class MethodŞekilÇizici {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int sayi=0,boyut=0,sayac=0,yildizSayisi=0,boslukSayisi=0,en=0;
		
          while(sayi!=6) {
			
			System.out.println("Şunları çizebiliyorum :");
			System.out.println("1-Kare :");
			System.out.println("2-Dikdörtgen :");
			System.out.println("3-Üçgen :");
			System.out.println("4-Ters Üçgen :");
			System.out.println("5-Kum saati :");
			System.out.print("Sana ne çizmemi istersin ?  :");
			sayi=input.nextInt();
			switch(sayi) {
			case 1:
				System.out.print("Boyut ne olsun ? :");
				boyut=input.nextInt();
				KareCiz(boyut);
				break;
			
			case 2:
				System.out.print("Boyut ne olsun ? :");
				boyut=input.nextInt();
				System.out.print("En ne olsun ? :");
				en=input.nextInt();
				DikdortgenCiz(boyut,en);
				
				break;
			
			case 3:
				System.out.print("Boyut ne olsun ? :");
				boyut=input.nextInt();
				UcgenCiz(boyut);
				
				break;
				
			case 4:
				System.out.print("Boyut ne olsun ? :");
				boyut=input.nextInt();
				TersUcgen(boyut);
				
				break;	
			
			case 5:
				System.out.print("Boyut ne olsun ? :");
				boyut=input.nextInt();
			    KumSaati(boyut);
			    break;
			    
			case 6:
				System.exit(sayi);
			}
          }
	}
	
	

   
	public static void KareCiz(int boyut) {
		for(int i=0;i<boyut;i++) {
			for(int j=0;j<boyut;j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
	
	public static void DikdortgenCiz(int boy,int en) {
		for(int i=0;i<boy;i++) {
			for(int j=0;j<en;j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
	
	public static void UcgenCiz(int boyut) {
		int sayac=0;
		for(int i=0;i<boyut;i++) {
			for(int j=0;j<sayac;j++) {
				System.out.print("* ");
			}
			sayac++;
			System.out.print("\n");
		}
	}
	public static void TersUcgen(int boyut) {
		int sayac=0;
		if(boyut!=0) {
			sayac=boyut;
			for(int i=0;i<boyut;i++) {
				for (int j=sayac; j>0 ;j--) {
					System.out.print("* ");
				}
				sayac--;
				System.out.print("\n");
			}
		}
	}
	
	public static void KumSaati(int boyut) {
		int yildizSayisi;
		int boslukSayisi = 0;
		yildizSayisi = boyut;

		if (boyut % 2 != 0) {

			for (int i = 0; i < boyut; i++) {
				
				for (int j = 0; j < yildizSayisi; j++) {		
					System.out.print("*");			
				}
				
				if (i < (boyut/ 2)) {
					yildizSayisi -= 2;
					boslukSayisi++;
				} else {
					yildizSayisi += 2;
					boslukSayisi--;
				}
				
				System.out.print("\n");
				for (int k = 0; k < boslukSayisi; k++) {
					
					System.out.print(" ");
				}
			}
		} else {
			System.out.print("Tek sayi giriniz..."+"\n");
		}
	}
	
	
	
	
}




