public class Ogretmen extends Kisi{
	

	private int sicilNo;
	private Sinif sinif;
	private Okul okul;
	
	

	public Ogretmen(String isim, int dYili, CType tip, int sicilNo) {
		super(isim, dYili, tip);
		this.sicilNo = sicilNo;
	}

	


	public int getSicilNo() {
		return sicilNo;
	}

	public void setSicilNo(int sicilNo) {
		this.sicilNo = sicilNo;
	}


	public Sinif getSinif() {
		return sinif;
	}

	public void setSinif(Sinif sinif) {
		this.sinif = sinif;
	}

	public Okul getOkul() {
		return okul;
	}


	public void setOkul(Okul okul) {
		this.okul = okul;
	}




	@Override
	public String toString() {
		return "\n\nOgretmenin Bilgisi: Sicil No :" + sicilNo + "" + super.toString() + sinif;
	}

	
}