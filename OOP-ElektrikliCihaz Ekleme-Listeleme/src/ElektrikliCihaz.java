
public class ElektrikliCihaz {
	private String  enerjiSinifi;
	private String cihazTipi;   // tv,pc,telefon,buzdolabi...
	
	private int gucWatt;
	private int gerilimVolt=220;
	
	private char currentStatus='K';  // 'A' açık  , 'K' kapali
	
	
	 public void ac() {
		 if(currentStatus=='A'){
			 System.out.println("Cihaz zaten acik");
		 }
		 else {
			 currentStatus='A';
			 System.out.println("cihaz acildi");
		 }
	}
	 
	 public void kapa() {
		 if(currentStatus=='K') {
			 System.out.println("cihaz zaten kapali");
		 }
		 else {
			 currentStatus='K';
			 System.out.println("cihaz kapandi");
		 }
			 
	 }

	public String getEnerjiSinifi() {
		return enerjiSinifi;
	}

	public void setEnerjiSinifi(String enerjiSinifi) {
		this.enerjiSinifi = enerjiSinifi;
	}

	public String getCihazTipi() {
		return cihazTipi;
	}

	public void setCihazTipi(String cihazTipi) {
		this.cihazTipi = cihazTipi;
	}

	public int getGucWatt() {
		return gucWatt;
	}

	public void setGucWatt(int gucWatt) {
		this.gucWatt = gucWatt;
	}

	public int getGerilimVolt() {
		return gerilimVolt;
	}


	public char getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(char currentStatus) {
		this.currentStatus = currentStatus;
	}

	@Override
	public String toString() {
		return "ElektrikliCihaz [enerjiSinifi=" + enerjiSinifi + ", cihazTipi=" + cihazTipi + ", gucWatt=" + gucWatt
				+ ", gerilimVolt=" + gerilimVolt + ", currentStatus=" + currentStatus + "]";
	}
	
	
	 
}
