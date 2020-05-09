package StaticOrnek;

public class Sample {
	
	public static int a;
	public int b=5;
	
	static {
		System.out.println("sinif baþliyor..");
		a=5;
	}
	
	Sample(){
		System.out.println("obje baþliyor");
	//	a++;
	//	b++;
	}

}
