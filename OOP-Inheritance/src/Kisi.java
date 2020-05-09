// multiple inheritaance yoktur javada,tek kalıtım vardır.
public class Kisi {

	String isim;
	String soyisim;
	long tckimlikno;
	char cinsiyet;


	public Kisi(String isim, String soyisim, long tckimlikno, char cinsiyet) {
		super();
		System.out.println("kisi constuctor,4 params");
		this.isim = isim;
		this.soyisim = soyisim;
		this.tckimlikno = tckimlikno;
		this.cinsiyet = cinsiyet;
	}
	
	

	public Kisi() {
	
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


	public long getTckimlikno() {
		return tckimlikno;
	}


	public void setTckimlikno(long tckimlikno) {
		this.tckimlikno = tckimlikno;
	}


	public char getCinsiyet() {
		return cinsiyet;
	}


	public void setCinsiyet(char cinsiyet) {
		this.cinsiyet = cinsiyet;
	}


	@Override
	public String toString() {
		return "Kisi [isim=" + isim + ", soyisim=" + soyisim + ", tckimlikno=" + tckimlikno + ", cinsiyet=" + cinsiyet
				+ ", getIsim()=" + getIsim() + ", getSoyisim()=" + getSoyisim() + ", getTckimlikno()=" + getTckimlikno()
				+ ", getCinsiyet()=" + getCinsiyet() + "]";
	}
	
	
	
	
	
	
	
}
