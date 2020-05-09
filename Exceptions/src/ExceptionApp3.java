import java.util.Scanner;

public class ExceptionApp3 {
	public static void main(String[] args)  {
		
		
		while(true){
			
			try {
				writeMenu();
			} catch (MenuException e) {
				e.printStackTrace();
				
			}
		}
	}

	public static void writeMenu() throws MenuException {
		System.out.println("1- Secenek1");
		System.out.println("2- Secenek2");
		System.out.println("3- Secenek3");
		
		Scanner input =new Scanner(System.in);
		int secim=input.nextInt();
		
		if(secim==1) {
			System.out.println("1 sectiniz.");
		}
		else if(secim==2) {
			System.out.println("2 sectiniz.");
		}
		else if(secim==3) {
			System.out.println("3 sectiniz.");
		}
		else
			throw new MenuException("yanlýs secim");
	}
	
}
