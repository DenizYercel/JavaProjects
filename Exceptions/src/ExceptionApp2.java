
public class ExceptionApp2 {

	public static void main(String[] args) throws Exception {
		
		int x=5,y=0;
		
		
			int z=div(x, y);
			System.out.println("sonuc :"+z);
		
		
	}
	
	public static int div(int sayi1,int sayi2) throws Exception {
		int sonuc=0;
		try {
			sonuc=sayi1/sayi2;
		} catch (Exception e) {
			System.out.println("Bolen sifir..");
			
			throw new Exception("hatalii");
		}
		return sonuc;
	}


}