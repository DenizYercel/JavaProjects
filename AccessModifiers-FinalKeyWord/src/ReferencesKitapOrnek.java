
public class ReferencesKitapOrnek {
	
	private String kitapAdi;
	private String yazar;
	private int basimYili;
	
	
	public ReferencesKitapOrnek(String kitapAdi, String yazar, int basimYili) {
		super();
		this.kitapAdi = kitapAdi;
		this.yazar = yazar;
		this.basimYili = basimYili;
	}
	public String getKitapAdi() {
		return kitapAdi;
	}
	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}
	public String getYazar() {
		return yazar;
	}
	public void setYazar(String yazar) {
		this.yazar = yazar;
	}
	public int getBasimYili() {
		return basimYili;
	}
	public void setBasimYili(int basimYili) {
		this.basimYili = basimYili;
	}
	@Override
	public String toString() {
		return "ReferencesKitapOrnek [kitapAdi=" + kitapAdi + ", yazar=" + yazar + ", basimYili=" + basimYili
				+ "]";
	}
	
	

}
