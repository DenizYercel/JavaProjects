import java.util.Scanner;

public class OBEB {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int sayi1,sayi2,ebob=0,i;
		System.out.print("OBEB'i hesaplanacak iki sayi girin,çıkmak için 0 girin: ");
		sayi1=input.nextInt();
		sayi2=input.nextInt();
		while(sayi1!=0) {
			
			for(i=1;i<=sayi1 && i<=sayi2;i++) {
				if(sayi1%i==0 && sayi2%i==0) {
					ebob=i;
					
				}
			}	
			
				System.out.println("Sayilarin OBEB'i :"+ebob+" dir");	
				
				
			System.out.print("OBEB'i hesaplanacak iki sayi girin,çıkmak için 0 girin: ");
			sayi1=input.nextInt();
			if(sayi1!=0) {
				sayi2=input.nextInt();	
			}
		}
		System.out.println("Güle güle...");
	}

}
