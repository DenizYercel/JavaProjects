
public class CepTelefonu extends Elektronik {
	
	int hatSayisi;
	String marka;

	
	
	public CepTelefonu(int watt, int volt, String enerjiSınıfı, int ekranBoyutu, int ram, int cpu, int hatSayisi,
			String marka) {
		super(watt, volt, enerjiSınıfı, ekranBoyutu, ram, cpu);
		this.hatSayisi = hatSayisi;
		this.marka = marka;
	}



	public int getHatSayisi() {
		return hatSayisi;
	}



	public void setHatSayisi(int hatSayisi) {
		this.hatSayisi = hatSayisi;
	}



	public String getMarka() {
		return marka;
	}



	public void setMarka(String marka) {
		this.marka = marka;
	}
	
	
	
}
