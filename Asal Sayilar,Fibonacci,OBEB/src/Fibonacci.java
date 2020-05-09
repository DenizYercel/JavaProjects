import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int limit=0,i=0;
		System.out.print("Bulunacak fibonacci sayisini giriniz :");
		limit=input.nextInt();
		fibonacci(limit);
		System.out.print("fibonacci serisi : ");
		for(i=0;i<limit;i++) {
			System.out.print(fibonacci(i)+" ");
		}

	}
	
	public static int fibonacci(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1 || n==2) {
			return 1;
		}
		return fibonacci(n-2)+fibonacci(n-1);
	}

}
