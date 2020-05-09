import java.util.Scanner;

public class AsalSayilar {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int i,limit=0,kontrol=0,sayac=0;
		System.out.print("Limit :");
		limit=input.nextInt();
		
		for(i=3;i<limit;i+=2) {
			
			for(int j=2;j<i;j++)
			{
				if(i%j==0) {
					kontrol=1;
					break;
				}
			}
			if(kontrol==0) {
				System.out.println(i);
				sayac++;
			}
			else {
				kontrol=0;
			}
			
		}
		System.out.println("Toplam "+sayac+" adet asal sayi bulundu");

	}

}
