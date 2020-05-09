package com.deniz;

public class Donem {
	int id;
	String adi;
	public Donem(int id, String adi) {
		super();
		this.id = id;
		this.adi = adi;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	@Override
	public String toString() {
		return "" + adi + "";
	}
	
	

}
