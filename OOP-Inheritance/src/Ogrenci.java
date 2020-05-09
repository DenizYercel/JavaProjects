
public class Ogrenci {
	
	String name;
	String surName;
	int id;
	
	public Ogrenci(String name,String surName,int id){
		
		this.name=name;
		this.surName=surName;
		this.id=id;
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
		return name+ " " + surName +" "+ id;
	}
	
	

}
