package StaticApp;

	public class Ogrenci {
	
   private int id;
   private String name;
   public static int numarator=100;
   
   
   public Ogrenci(String name) {
	
	this.id = numarator++;
	this.name = name;
	System.out.println(this.id+" " +this.name);
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public static int getNumarator() {
	return numarator;
}


public static void setNumarator(int numarator) {
	Ogrenci.numarator = numarator;
}
   
   
   
 

}
   
   
