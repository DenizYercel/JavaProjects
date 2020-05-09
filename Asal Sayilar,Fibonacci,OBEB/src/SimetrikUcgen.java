
import java.util.Scanner;

public class SimetrikUcgen {
	
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);

		
		int boyut,sayac,bosluk=0,yildiz=0;
		System.out.print("Boyut girin : ");
		boyut=input.nextInt();
		while(boyut!=0) {
		sayac=boyut;
		for(int i=0;i<boyut;i++) {
			for (int j =sayac;j>0;j--) {
				
				System.out.print("*");
			}
			sayac--;
			System.out.print("\n");
		}
		for(int i=0;i<boyut;i++) {
			System.out.print("-");
		}
		System.out.print("\n");
		bosluk=boyut-1;
		yildiz=1;
		for(int i=0;i<boyut;i++) {
			for (int j=0;j<bosluk;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<yildiz;k++) {
				 System.out.print("*");	
			}
			System.out.print("\n");
			bosluk--;
			yildiz++;
		}
		
		System.out.print("Boyut girin : ");
		boyut=input.nextInt();
	
	}
		System.out.println("Güle Güle ...");
	
	}}
