
public class Elektronik extends ElektrikliCihaz {
	
	String ekranBoyutu;
	double cpuGHZ;
	double ramMB;
	
	public Elektronik(String ekranBoyutu, double cpuGHZ, double ramMB,String cihazTipi,String enerjiSinifi,int guc) {
		super();
		this.ekranBoyutu = ekranBoyutu;
		this.cpuGHZ = cpuGHZ;
		this.ramMB = ramMB;
		this.setCihazTipi(cihazTipi);
		this.setEnerjiSinifi(enerjiSinifi);
		this.setGucWatt(guc);
	}

	public String getEkranBoyutu() {
		return ekranBoyutu;
	}

	public void setEkranBoyutu(String ekranBoyutu) {
		this.ekranBoyutu = ekranBoyutu;
	}

	public double getCpuGHZ() {
		return cpuGHZ;
	}

	public void setCpuGHZ(double cpuGHZ) {
		this.cpuGHZ = cpuGHZ;
	}

	public double getRamMB() {
		return ramMB;
	}

	public void setRamMB(double ramMB) {
		this.ramMB = ramMB;
	}

	@Override
	public String toString() {
		return "Elektronik [ElekktrikliCihaz["+this.getCihazTipi()+""+this.getEnerjiSinifi()+""+this.getGucWatt()+"],ekranBoyutu=" + ekranBoyutu + ", cpuGHZ=" + cpuGHZ + ", ramMB=" + ramMB + "]";
	}
	
	

	
	
}
