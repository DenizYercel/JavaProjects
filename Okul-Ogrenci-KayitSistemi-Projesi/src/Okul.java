import java.util.ArrayList;

 public class Okul {
	
	 ArrayList<Sinif> sinifList =new ArrayList<Sinif>();
	 ArrayList<Ogretmen> ogretmenList =new ArrayList<Ogretmen>();
	
	private String okulAdi;

	
	public Okul(String okulAdi) {
		super();
		this.okulAdi = okulAdi;
	}
	
	

	public Okul() {
		super();
	}



	public ArrayList<Sinif> getSinifList() {
		return sinifList;
	}

	public void setSinifList(ArrayList<Sinif> sinifList) {
		this.sinifList = sinifList;
	}

	public ArrayList<Ogretmen> getOgretmenList() {
		return ogretmenList;
	}

	public void setOgretmenList(ArrayList<Ogretmen> ogretmenList) {
		this.ogretmenList = ogretmenList;
	}

	public String getOkulAdi() {
		return okulAdi;
	}

	public void setOkulAdi(String okulAdi) {
		this.okulAdi = okulAdi;
	}
	
	
	public void sinifaOgretmenAta(Ogretmen ogretmen,Sinif sinif) {
		ogretmen.setSinif(sinif);
		sinif.setOgretmen(ogretmen);

	}
	
	public void sinifEkle(Sinif sinif) {
		sinifList.add(sinif);
		sinif.setOkul(this);
	}
	
	public void ogretmenEkle(Ogretmen ogretmen) {
		ogretmenList.add(ogretmen);
		ogretmen.setOkul(this);
	}

	@Override
	public String toString() {
		return "\nOkul'un  Adi= " + okulAdi +",";
	}

	
	
}