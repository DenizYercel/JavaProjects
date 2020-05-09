import java.util.Scanner;

public class TersUcgen{

	public static void main(String[] args) {
		int sayi,sayac=0,boyut=0;
		Scanner input=new Scanner(System.in);
		System.out.print("Boyut Girin :(Çıkmak için 0 giriniz :");
		boyut = input.nextInt();
		while(boyut!=0) {
			sayac=boyut;
			for(int i=0;i<boyut;i++) {
				for (int j =sayac;j>0;j--) {
					
					System.out.print("* ");
				}
				sayac--;
				System.out.print("\n");
			}
		}

	}

}
