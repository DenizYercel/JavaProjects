public class Ogretmen extends Kisi {
	
	int sicilNo;
	
	
	



	public Ogretmen(String isim, String soyisim, double tcKimlikNo, String unvan, int sicilNo) {
		super(isim, soyisim, tcKimlikNo, unvan);
		this.sicilNo = sicilNo;
		this.setIsim(isim);
		this.setSoyisim(soyisim);
		this.setTcKimlikNo(tcKimlikNo);
		this.setUnvan(unvan);
	}

	public int getSicilNo() {
		return sicilNo;
	}

	public void setSicilNo(int sicilNo) {
		this.sicilNo = sicilNo;
	}

	@Override
	public String toString() {
		return "Ogretmen [sicilNo=" + sicilNo + ""+ super.toString() + "]";
	}
	
	
	
}