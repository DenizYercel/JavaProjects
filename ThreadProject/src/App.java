public class App {

	static Thread[] threads=new Thread[3];
	static int i=0;
	static int j=0;
	
	public static void main(String[] args) {
		
		Thread thread1=new Thread(new MyThread("Thread - 1"));
		Thread thread2=new Thread(new MyThread("Thread - 2"));
		Thread thread3=new Thread(new MyThread("Thread - 3"));
		threads[i++]=thread1;
		threads[i++]=thread2;
		threads[i++]=thread3;
		
		
		while(j<3) {		
				threads[j].start();
				if(threads[j].getState().equals("Terminated")) {
					int sayac = 0;
					sayac++;
				
				}
				j++;
				
				if(j>3) {
					System.out.println("Yolun acik olsun");
				}
				
		}
	
	}

}