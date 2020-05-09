import java.util.ArrayList;

public class Sinif {
	
	 ArrayList<Ogrenci> ogrenciList=new ArrayList<Ogrenci>();
	private Okul okul;
	private Ogretmen ogretmen;
	private int sicilNo;
	private char sinifSube;
	
	
	public Sinif( int sicilNo, char sinifSube) {
		super();
		this.sicilNo = sicilNo;
		this.sinifSube = sinifSube;
	}
	
	

	public Sinif() {
		super();
	}



	public Okul getOkul() {
		return okul;
	}


	public void setOkul(Okul okul) {
		this.okul = okul;
	}


	public Ogretmen getOgretmen() {
		return ogretmen;
	}



	public void setOgretmen(Ogretmen ogretmen) {
		this.ogretmen = ogretmen;
	}



	public ArrayList<Ogrenci> getOgrenciList() {
		return ogrenciList;
	}



	public void setOgrenciList(ArrayList<Ogrenci> ogrenciList) {
		this.ogrenciList = ogrenciList;
	}


	public int getSicilNo() {
		return sicilNo;
	}


	public void setSicilNo(int sicilNo) {
		this.sicilNo = sicilNo;
	}

	public char getSinifSube() {
		return sinifSube;
	}




	public void setSinifSube(char sinifSube) {
		this.sinifSube = sinifSube;
	}
	
	
	public void ogrenciKayit(Ogrenci ogrenci) {
		ogrenciList.add(ogrenci);
		ogrenci.setSinif(this);
	}

	@Override
	public String toString() {
		return "\nSinif Bilgisi: Sinif-Sicil No :" + sicilNo + ", Bagli bulundugu sube:" + sinifSube+okul;
	}

	


	
}