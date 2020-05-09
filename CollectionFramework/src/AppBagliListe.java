
public class AppBagliListe<T> {

	public static void main(String[] args) {
		
		
	/*	BagliListe bListe=new BagliListe();
		bListe.add(1);
		bListe.printList();
		bListe.add( "deniz");
		bListe.add(5);
		bListe.printList();
		bListe.addToLocation(3, 20);
		bListe.printList();
		bListe.remove(1);
		bListe.printList();
		bListe.contains(5);  */
		
		
	/*	BagliListe<String> myString=new BagliListe<String>();
		myString.add("ali");
		myString.add("veli");
		myString.add("deniz");
		myString.printList();
		myString.remove("veli");
		myString.printList();  
		System.out.println();   */
		
		BagliListe<Ogrenci> myOgrenci=new BagliListe<Ogrenci>();
		Ogrenci o1=new Ogrenci("deniz", "yercel", 1);
		myOgrenci.add(o1);
		Ogrenci o2=new Ogrenci("fethi", "sen", 2);
		myOgrenci.add(o2);
		Ogrenci o3=new Ogrenci("batur", "su", 3);
		myOgrenci.add(o3);
		myOgrenci.printList();
		
		myOgrenci.remove(o1);
		myOgrenci.printList();
		myOgrenci.contains(o2);
	}

}

class Ogrenci {
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
		return " name=" + name + ", surName=" + surName + ", id=" + id ;
	}



	

	
	
}