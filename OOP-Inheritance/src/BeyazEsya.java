
public class BeyazEsya extends ElektrikliCihaz{

	String renk;


	public BeyazEsya(int watt, int volt, String enerjiSınıfı) {
		super(watt, volt, enerjiSınıfı);
	}


	


	public void ses() {
		System.out.println("SES VERİLDİ");
	}





	
	public BeyazEsya(int watt, int volt, String enerjiSınıfı, String renk) {
		super(watt, volt, enerjiSınıfı);
		this.renk = renk;
	}
	
	

}
