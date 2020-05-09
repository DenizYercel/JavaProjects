
public class SomeRunnableApp {

	public static void main(String[] args) {
		
	/*	System.out.println("Runnable olusturuyorum");
		SomeRunnable someRunnable=new SomeRunnable();
		
		System.out.println("Runnable ile thread olustuyorum");
		Thread myThread=new Thread(someRunnable);*/
		
		
		Thread myThread =new Thread(new SomeRunnable());   //new Thread(new SomeRunnable()).start();
		
		myThread.start();

	}

}
