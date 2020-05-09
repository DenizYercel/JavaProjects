import java.util.Scanner;

public class ObebOkek {

	public static void main(String[] args) {
		int i,sayi1,sayi2,obeb=1,okek=1,bolen=2;
		Scanner input=new Scanner(System.in);
		System.out.print("İki sayi giriniz :");
		sayi1=input.nextInt();
		sayi2=input.nextInt();
		while(sayi1>1 || sayi2>1) {
			if(sayi1%bolen==0 && sayi2%bolen==0) {
				System.out.print(sayi1+" "+sayi2+"\t"+" | "+bolen+" *"+"\n");
				okek*=bolen;
				obeb*=bolen;
				sayi1/=bolen;
				sayi2/=bolen;
			}	
			else if(sayi1%bolen==0) {
				System.out.print(sayi1+" "+sayi2+"\t"+" | " +bolen+"\n");
				okek*=bolen;
				sayi1/=bolen;
			}
			else if(sayi2%bolen==0) {
				System.out.print(sayi1+" "+sayi2+"\t"+" | " +bolen+"\n");
				okek*=bolen;
				sayi2/=bolen;
			}
			else {
				bolen++;
			}

		}
		System.out.print("EBOB :"+obeb+"\n"+"EKOK :"+okek);

}}