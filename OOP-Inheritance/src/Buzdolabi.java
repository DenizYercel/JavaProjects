
public class Buzdolabi extends BeyazEsya{
	
	int ichacim;

	
	public Buzdolabi(int watt, int volt, String enerjiSınıfı, String renk, int ichacim, String string) {
		super(watt, volt, enerjiSınıfı, renk);
		this.ichacim = ichacim;
	}


	public int getIchacim() {
		return ichacim;
	}


	public void setIchacim(int ichacim) {
		this.ichacim = ichacim;
	}
	
	@Override
	public void ses() {
		System.out.println("ses verildi");
	}
	
	

}
