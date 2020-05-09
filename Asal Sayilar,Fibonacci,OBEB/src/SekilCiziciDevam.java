import java.util.Scanner;

public class SekilCiziciDevam {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int sayi=0,boyut=0,sayac=0,yildizSayisi=0,boslukSayisi=0;
		
		while(sayi!=6) {
			
			System.out.println("Şunları çizebiliyorum :");
			System.out.println("1-Kare :");
			System.out.println("2-Dikdörtgen :");
			System.out.println("3-Üçgen :");
			System.out.println("4-Ters Üçgen :");
			System.out.println("5-Kum saati :");
			System.out.println("6-Çıkış :");
			System.out.print("Sana ne çizmemi istersin ?  :");
			sayi=input.nextInt();
			if(sayi!=6) {
				System.out.print("Boyutu ne olsun ?");
				boyut=input.nextInt();
			}
			
			switch(sayi) {
			case 1:
				for(int i=0;i<boyut;i++) {
				for(int j=0;j<boyut;j++) {
					System.out.print("* ");
				}
				System.out.print("\n");
			}
			break;
			
			case 2:
				for(int i=0;i<boyut;i++) {
					for(int j=0;j<boyut;j++) {
						System.out.print("* ");
					}
					System.out.print("\n");
				}
				break;
				
			case 3:
				for(int i=0;i<boyut;i++) {
					for(int j=0;j<sayac;j++) {
						System.out.print("* ");
					}
					sayac++;
					System.out.print("\n");
				}
				break;
			case 4:
				sayac=boyut;
				for(int i=0;i<boyut;i++) {
					for (int j =sayac;j>0;j--) {
						
						System.out.print("* ");
					}
					sayac--;
					System.out.print("\n");
				}
				break;
			case 5:
				yildizSayisi = boyut;

				if (boyut % 2 != 0) {

					for (int i = 0; i < boyut; i++) {
						
						for (int j = 0; j < yildizSayisi; j++) {		
							System.out.print("*");			
						}
						
						if (i < (boyut / 2)) {
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
				}
				
				break;
				
			case 6:
				System.out.println("Güle Güle ...");
				break;
			default:
				break;
			}
		}
	}

}
