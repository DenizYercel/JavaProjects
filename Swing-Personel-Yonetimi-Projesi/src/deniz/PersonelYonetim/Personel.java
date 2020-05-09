package deniz.PersonelYonetim;
import java.util.ArrayList;

public class Personel {
	
	private String isim;
	private String soyIsim;
	private int sicilNo;
	private int girisYili;
	private String dogumYeri;
	private CType  tip;
	private boolean yonetimPersoneli;
	

	
	

	public Personel(String isim, String soyIsim, int sicilNo, int girisYili, String dogumYeri, CType tip,
			boolean yonetimPersoneli) {
		super();
		this.isim = isim;
		this.soyIsim = soyIsim;
		this.sicilNo = sicilNo;
		this.girisYili = girisYili;
		this.dogumYeri = dogumYeri;
		this.tip = tip;
		this.yonetimPersoneli = yonetimPersoneli;
	}
	

	public boolean yonetimPersoneli() {
		return yonetimPersoneli;
	}


	public void setYonetimPersoneli(boolean yonetimPersoneli) {
		this.yonetimPersoneli = yonetimPersoneli;
	}


	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyIsim() {
		return soyIsim;
	}

	public void setSoyIsim(String soyIsim) {
		this.soyIsim = soyIsim;
	}

	public int getSicilNo() {
		return sicilNo;
	}

	public void setSicilNo(int sicilNo) {
		this.sicilNo = sicilNo;
	}

	public int getGirisYili() {
		return girisYili;
	}

	public void setGirisYili(int girisYili) {
		this.girisYili = girisYili;
	}

	public String getDogumYeri() {
		return dogumYeri;
	}

	public void setDogumYeri(String dogumYeri) {
		this.dogumYeri = dogumYeri;
	}

	public CType getTip() {
		return tip;
	}

	public void setTip(CType tip) {
		this.tip = tip;
	}

	
	@Override
	public String toString() {
		return "Personel [isim=" + isim + ", soyIsim=" + soyIsim + ", sicilNo=" + sicilNo + ", girisYili=" + girisYili
				+ ", dogumYeri=" + dogumYeri + ", tip=" + tip +  "]";
	}
	
	
	
	
	
	

}
