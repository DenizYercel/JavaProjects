public class Person {
	
	String name;
	String surname;
	int birthYear;
	CType tip;
	
	

	public Person(String name, String surname, int birthYear, CType tip) {
		super();
		this.name = name;
		this.surname = surname;
		this.birthYear = birthYear;
		this.tip = tip;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public CType getTip() {
		return tip;
	}

	public void setTip(CType tip) {
		this.tip = tip;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", birthYear=" + birthYear + ", tip=" + tip + "]";
	}

	
	
	
	
	
}