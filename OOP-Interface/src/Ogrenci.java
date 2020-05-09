public class Ogrenci extends Kisi{
	
	int okulNo;
	int sinif;
	
	
	
	public Ogrenci(String isim, String soyisim, double tcKimlikNo, String unvan, int okulNo, int sinif) {
		super(isim, soyisim, tcKimlikNo, unvan);
		this.okulNo = okulNo;
		this.sinif = sinif;
		this.setIsim(isim);
		this.setSoyisim(soyisim);
		this.setTcKimlikNo(tcKimlikNo);
		this.setUnvan(unvan);
	}
	
	
	public int getOkulNo() {
		return okulNo;
	}
	public void setOkulNo(int okulNo) {
		this.okulNo = okulNo;
	}
	public int getSinif() {
		return sinif;
	}
	public void setSinif(int sinif) {
		this.sinif = sinif;
	}
	@Override
	public String toString() {
		return "Ogrenci [okulNo=" + okulNo + ", sinif=" + sinif + ""+ super.toString() + "]";
	}
	
	
	

}