import java.util.Scanner;
import java.math.*;

public class OrtalamaveStandartSapma {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		int sonuc[]=new int[5];
		double[] sayiFark=new double[5];
		int ortalama=0,standartSapma=0;
				double standartSapmaSonucu=0;
		for(int i = 0;i<sonuc.length;i++) {
		System.out.print(i+1+".Notu giriniz :");
		sonuc[i]=input.nextInt();
		}
		for(int i=0;i<sonuc.length;i++) {
			ortalama+=sonuc[i];
		}
		double ort=ortalama/sonuc.length;
		System.out.print("Ortalama :"+ort+"\n");
		
		for(int i=0;i<sonuc.length;i++) {
			sayiFark[i]=ort-sonuc[i];
			standartSapma+=sayiFark[i]*sayiFark[i];
		}
		
		 standartSapmaSonucu=Math.sqrt(standartSapma/4);
		
		System.out.print("Standart Sapma :"+standartSapmaSonucu);
		
	}

}
