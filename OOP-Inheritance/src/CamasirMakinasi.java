
public class CamasirMakinasi extends BeyazEsya{

	int program;
	int yikamakapasite;
	

	
	public CamasirMakinasi(int watt, int volt, String enerjiSınıfı, String renk, String yikama, int kapasite,
			int program) {
		super(watt, volt, enerjiSınıfı, renk);
		this.program = program;
		this.yikamakapasite = kapasite;
		
	}



	@Override
	public void ses() {
		super.ses();
	}
	
	
	

}
