
public class Bilgisayar extends Elektronik {
	
	int disk;
	String kasa;
	
	
	public Bilgisayar(int watt, int volt, String enerjiSınıfı, int ekranBoyutu, int ram, int cpu, int disk,
			String kasa) {
		super(watt, volt, enerjiSınıfı, ekranBoyutu, ram, cpu);
		this.disk = disk;
		this.kasa = kasa;
	}


	public int getDisk() {
		return disk;
	}


	public void setDisk(int disk) {
		this.disk = disk;
	}


	public String getKasa() {
		return kasa;
	}


	public void setKasa(String kasa) {
		this.kasa = kasa;
	}
	
	
	
	

}
