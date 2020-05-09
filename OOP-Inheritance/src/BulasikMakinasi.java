
public class BulasikMakinasi  extends BeyazEsya{
	
	int program;
	String adi;
	
	
	public BulasikMakinasi(int watt, int volt, String enerjiSınıfı, String renk, int program, String adi) {
		super(watt, volt, enerjiSınıfı, renk);
		this.program = program;
		this.adi = adi;
	}



	@Override
	public void ses() {
		System.out.println("ses verildi.");
	}



	@Override
	public String toString() {
		return "BulasikMakinasi [program=" + program + "]";
	}

	
}
