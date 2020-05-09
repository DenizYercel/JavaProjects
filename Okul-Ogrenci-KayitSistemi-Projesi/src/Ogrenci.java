public class Ogrenci extends Kisi{
	
	private int ogrenciNo;
	private Sinif sinif;

	
	
	public Ogrenci(String isim, int dYili, CType tip, int ogrenciNo) {
		super(isim, dYili, tip);
		this.ogrenciNo = ogrenciNo;
	
	}
	

	public int getOgrenciNo() {
		return ogrenciNo;
	}


	public void setOgrenciNo(int ogrenciNo) {
		this.ogrenciNo = ogrenciNo;
	}


	public Sinif getSinif() {
		return sinif;
	}


	public void setSinif(Sinif sinif) {
		this.sinif = sinif;
	}


	@Override
	public String toString() {
		return "\nOgrenci Bilgisi: Ogrenci no :" + ogrenciNo  +super.toString()+sinif ;
	}


	


	
	
	
	
}