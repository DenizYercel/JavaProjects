
import java.util.Scanner;

public class Kare {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int kareBoyut;
		
		System.out.print("Boy girin :");
		kareBoyut=scan.nextInt();
		
		for(int i=0;i<kareBoyut;i++) {
			for(int j=0;j<kareBoyut;j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		
		
		
	}

}
