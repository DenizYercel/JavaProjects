
public class AnyThread extends Thread{
	
	

	public void printMessages() {
		System.out.println("hello,this is any thread.. Sleeping");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("wake upp");
	}
	
	
	@Override
	public void run() {
		System.out.println("this is me");
		printMessages();
	}

}
