public class Kisi {
	
	private String isim;
	private int dYili;
	private CType tip;
	
	
	

	public Kisi(String isim, int dYili, CType tip) {
		super();
		this.isim = isim;
		this.dYili = dYili;
		this.tip = tip;
	}



	public String getIsim() {
		return isim;
	}



	public void setIsim(String isim) {
		this.isim = isim;
	}



	public int getdYili() {
		return dYili;
	}



	public void setdYili(int dYili) {
		this.dYili = dYili;
	}



	public CType getTip() {
		return tip;
	}



	public void setTip(CType tip) {
		this.tip = tip;
	}



	@Override
	public String toString() {
		return " Isim :" + isim + ", Dogum Yili :" + dYili + ", Cinsiyet :" + tip ;
	}
	
	
	
	

}