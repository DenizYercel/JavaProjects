public class Kisi {
	
	String isim;
	String soyisim;
	double tcKimlikNo;
	String unvan;
	

	public String getUnvan() {
		return unvan;
	}
	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}
	public Kisi(String isim, String soyisim, double tcKimlikNo, String unvan) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
		this.tcKimlikNo = tcKimlikNo;
		this.unvan = unvan;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSoyisim() {
		return soyisim;
	}
	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	public double getTcKimlikNo() {
		return tcKimlikNo;
	}
	public void setTcKimlikNo(double tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
	}
	@Override
	public String toString() {
		return " Kisi [isim=" + isim + ", soyisim=" + soyisim + ", tcKimlikNo=" + tcKimlikNo + "]";
	}
	
	
	

}