package faktoriyelHesaplama;

import java.util.Random;

public class SayiTahminOyunu {

	public static void main(String[] args) {
		System.out.println("Tuttugum sayiyi bulabilecek misin ? :");
		
	}
	
	private static int getRandomNumberInRange(int min, int max) {
		
		if(min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
			return r.nextInt((max - min) + 1) + min;
		}

}
