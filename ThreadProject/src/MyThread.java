import java.util.Random;

public class MyThread implements Runnable{

	
	private	String isim;
	private String state1;
	

	public MyThread(String isim) {
		this.isim=isim;
	}

	


	public String getIsim() {
		return isim;
	}


	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getState1() {
		return state1;
	}


	public void setState1(String state) {
		this.state1 = state;
	}




	public void  message() {
	
		int a=getRandomNumberInRange(5, 15);
		System.out.println(isim +" beklemeye baþladý");
	 try { 

			Thread.sleep(a*1000);  
			 
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	 	
	 System.out.println("Bana müsade "+isim);
	 System.out.println("Güle güle "+isim);
		
		
		
		
		
	
	}

	@Override
	public void run() {
		
		message();
		
		
	}
	
	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

}