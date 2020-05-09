
public class PersonArrayList {
	
	private String name;
	
	private String surName;
	private int birth_Year;
	private String gender;

	
	
	
	
	public PersonArrayList(String name, String surName, int birth_Year, String gen) {
		super();
		this.name = name;
		this.surName = surName;
		this.birth_Year = birth_Year;
		this.gender = gen;
	}



	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public int getBirth_Year() {
		return birth_Year;
	}
	public void setBirth_Year(int birth_Year) {
		this.birth_Year = birth_Year;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}



	@Override
	public  String toString() {
		return " [name=" + name + ", surName=" + surName + ", birth_Year=" + birth_Year + ", gender="
				+ gender + "]";
	}
	
	
	
}
