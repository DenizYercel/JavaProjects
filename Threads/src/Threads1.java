
public class Threads1 {

	public static void main(String[] args) {
		
		System.out.println("hello from main");
		AnyThread any =new AnyThread();
	//	any.printMessages();
		
		any.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("good by my friends");
	}

}
