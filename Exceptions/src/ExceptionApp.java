import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionApp {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int x=10;
		System.out.println("x :"+x);
		System.out.print("tell me x :");
		
		try {
			x=input.nextInt();
			System.out.println("Input x :"+x);
			
			String isim=null;
			System.out.println(isim.charAt(1));
			
		} catch (InputMismatchException e) {
			
			System.out.println("Not a valid integer value");
			
		}
		catch (NullPointerException e) {
			System.out.println("isim henüz bos");
			
		}
		catch (Exception e) {
			System.out.println("her türlü hata olmus olabilir.");
		}
	}

}
