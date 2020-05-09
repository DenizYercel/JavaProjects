
public class Personel extends Kisi{
	
	int id;
	String departman;
	
	
	
	public Personel(String isim, String soyisim, long tckimlikno, char cinsiyet, int id, String departman) {
		super(isim, soyisim, tckimlikno, cinsiyet);
		this.id = id;
		this.departman = departman;
		System.out.println("Personel constructor,6 params");
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getDepartman() {
		return departman;
	}



	public void setDepartman(String departman) {
		this.departman = departman;
	}



	@Override
	public String toString() {
	  /* return "super:Kisi [isim=" + isim + ", soyisim=" + soyisim + ", tckimlikno=" + tckimlikno + ", cinsiyet=" + cinsiyet
		+ ", getIsim()=" + getIsim() + ", getSoyisim()=" + getSoyisim() + ", getTckimlikno()=" + getTckimlikno()
		+ ", getCinsiyet()=" + getCinsiyet() + "]"; */ // 2.yazdırma şekli..
		
		
		return  super.toString()+"\n"+  "Personel [id=" + id + ", departman=" + departman + "]";
	}
	
	
	
	

}
