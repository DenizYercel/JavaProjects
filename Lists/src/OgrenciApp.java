import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OgrenciApp {

	public static void main(String[] args) {
		
		List<Ogrenci> stdnts=new ArrayList<>();
		
		stdnts.add(new Ogrenci("deniz", "yercel", 23));
		stdnts.add(new Ogrenci("batur", "bn", 11));
		stdnts.add(new Ogrenci("ercan", "kk",20));
		
		System.out.println(stdnts);
		
		Collections.sort(stdnts);
		System.out.println(stdnts);
		System.out.println();
		
		Collections.sort(stdnts, new OgrenciSiralarIsmeGore());
		System.out.println(stdnts);
		System.out.println();
		
		Collections.sort(stdnts, new OgrenciSiralarIsmeGoreTersten());
		System.out.println(stdnts);
	}

}


class Ogrenci implements Comparable<Ogrenci>{
	private String name;
	private String surName;
	private int id;
	
	
	public Ogrenci(String name, String surName, int id) {
		super();
		this.name = name;
		this.surName = surName;
		this.id = id;
	}
	


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSurName() {
		return surName;
	}



	public void setSurName(String surName) {
		this.surName = surName;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	@Override
	public String toString() {
		return "Ogrenci name=" + name;
	}

	@Override
	public int compareTo(Ogrenci o) {

		return this.name.compareTo(((Ogrenci)o).name);
	}
	
	
}
class OgrenciSiralarIsmeGore implements Comparator<Ogrenci>{

	@Override
	public int compare(Ogrenci o1, Ogrenci o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}

class OgrenciSiralarIsmeGoreTersten implements Comparator<Ogrenci>{

	@Override
	public int compare(Ogrenci o1, Ogrenci o2) {
		return o2.getName().compareTo(o1.getName());
	}
	
}


