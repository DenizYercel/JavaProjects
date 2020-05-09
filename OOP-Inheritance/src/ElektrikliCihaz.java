
public class ElektrikliCihaz {
	int watt;
	int volt;
	String enerjiSınıfı;
	
	
	

	
	


	public int getWatt() {
		return watt;
	}
	public void setWatt(int watt) {
		this.watt = watt;
	}
	public int getVolt() {
		return volt;
	}
	public void setVolt(int volt) {
		this.volt = volt;
	}
	public String getEnerjiSınıfı() {
		return enerjiSınıfı;
	}
	public void setEnerjiSınıfı(String enerjiSınıfı) {
		this.enerjiSınıfı = enerjiSınıfı;
	}
	
	
	
	public ElektrikliCihaz(int watt, int volt, String enerjiSınıfı) {
		super();
		this.watt = watt;
		this.volt = volt;
		this.enerjiSınıfı = enerjiSınıfı;
	}


	public void ac() {
		System.out.println("Açıldı");
	}
	public void kapa() {
		System.out.println("Kapatıldı");
	}

}
