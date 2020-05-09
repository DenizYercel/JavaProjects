package data;

import java.sql.Date;

public class Teacher {

	private String ad;
	private String soyad;
	private int bolum_id;
	private String bolum_adi;
	private String unvan;
	private int baslamaTarihi;
	private int sicil_no;
	
	
	
	
	public Teacher(String ad, String soyad,int bolum_id, int sicil_no, int baslamaTarihi, String unvan) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.unvan = unvan;
		this.baslamaTarihi = baslamaTarihi;
		this.sicil_no = sicil_no;
		this.bolum_id=bolum_id;
	}
	public Teacher() {
		
	}
	
	public String getAd() {
		return ad;
	}


	public void setAd(String ad) {
		this.ad = ad;
	}


	public String getSoyad() {
		return soyad;
	}


	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}


	public String getBolum_adi() {
		return bolum_adi;
	}
	public void setBolum_adi(String bolum_adi) {
		this.bolum_adi = bolum_adi;
	}
	public int getBolum_id() {
		return bolum_id;
	}


	public void setBolum_id(int bolum_id) {
		this.bolum_id = bolum_id;
	}


	public String getUnvan() {
		return unvan;
	}


	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}


	public int getBaslamaTarihi() {
		return baslamaTarihi;
	}


	public void setBaslamaTarihi(int baslamaTarihi) {
		this.baslamaTarihi = baslamaTarihi;
	}


	public int getSicil_no() {
		return sicil_no;
	}


	public void setSicil_no(int sicil_no) {
		this.sicil_no = sicil_no;
	}


	@Override
	public String toString() {
		return "Teacher [ad=" + ad + ", lastName=" + soyad + ", bolum_id=" + bolum_id + ", unvan=" + unvan
				+ ", baslamaTarihi=" + baslamaTarihi + ", sicil_no=" + sicil_no + "]";
	}


	
	

	
	
}
