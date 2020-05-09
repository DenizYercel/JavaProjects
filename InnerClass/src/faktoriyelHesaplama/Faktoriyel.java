package faktoriyelHesaplama;

import java.util.Scanner;
import java.util.stream.Stream;

public class Faktoriyel {
	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		System.out.print("Faktöriyeli hesaplanacak sayi giriniz :");
		int a=input.nextInt();
		
		
		System.out.print("Sonuç :"+faktoriyel(a));
	}
	
	public static int faktoriyel(int sayi) {
		if(sayi==0) {
			return 1;
		}
		else {
			return sayi*faktoriyel(sayi-1);
		}
	}

}
