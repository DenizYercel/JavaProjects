package com.deniz;

public class Animal {
	String tur;
	int yas;
	String habitat;
	String renk;
	
	public Animal(int yas) {
		this.yas=yas;
	}
	
	public Animal(String tur,int yas) {
		this.tur=tur;
		this.yas=yas;
	}
	
	void hareket() {
		System.out.println(this.tur+ " Hareket ettirildi");
	}
	

	public void sesVer() {
		System.out.println(this.tur +": Ses verildi");
		
	}

	@Override
	public String toString() {
		return "Animal [tur=" + tur + ", yas=" + yas + "]\n";
	}
	
	
	
}
