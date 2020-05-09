
public class Elektronik extends ElektrikliCihaz{
	
	int ekranBoyutu;
	int ram;
	int cpu;
	
	
	public Elektronik(int watt, int volt, String enerjiSınıfı, int ekranBoyutu, int ram, int cpu) {
		super(watt, volt, enerjiSınıfı);
		this.ekranBoyutu = ekranBoyutu;
		this.ram = ram;
		this.cpu = cpu;
	}


	public int getEkranBoyutu() {
		return ekranBoyutu;
	}


	public void setEkranBoyutu(int ekranBoyutu) {
		this.ekranBoyutu = ekranBoyutu;
	}


	public int getRam() {
		return ram;
	}


	public void setRam(int ram) {
		this.ram = ram;
	}


	public int getCpu() {
		return cpu;
	}


	public void setCpu(int cpu) {
		this.cpu = cpu;
	}
	
	public void reset() {
		System.out.println("Reset atıldı");
	}


}
