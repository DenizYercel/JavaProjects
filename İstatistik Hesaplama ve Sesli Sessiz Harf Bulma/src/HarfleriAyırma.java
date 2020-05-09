import java.util.Scanner;

public class HarfleriAyırma {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int sayac=0;
		System.out.print("İsim giriniz :");
		String boslukKontrol;
		String[] dizi=new String[50];
		String[] sesli=new String[50];
		String[] sessiz=new String[50];
		String[] charac={"aeıioöuü"};
		
		boslukKontrol=input.nextLine();
		while(!boslukKontrol.equals(" ")){
			dizi[sayac]=input.nextLine();
			boslukKontrol=dizi[sayac];
			sayac++;
		}
		for(sayac=0;sayac<dizi.length;sayac++) {
			System.out.println(dizi[sayac]);
		}
		
		for(sayac=0;sayac<50;sayac++) {
			for(int ka=0;ka<8;ka++) {
			if(dizi[sayac]==charac[ka]) {
				charac[ka]=dizi[ka];
				sesli[sayac]=charac[ka];
			}
			}
			
		}
		System.out.print("sesliler"+sesli[sayac]);
		
	}

}
