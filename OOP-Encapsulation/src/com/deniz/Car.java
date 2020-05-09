package com.deniz;

public class Car {
	
	//prop
	int uretimYili;
	String marka;
	String renk;
	int motorGucu;
	
	// overloading : aynı isimle iki metodumuz var,params farklı olmalı.
	
	//constuctor
	public Car(String marka,int uretimYili){
		this.marka=marka;
		this.uretimYili=uretimYili;
	}
	
	//default constructor
	Car(){
		System.out.println("Car constructor, default");
	}
	
	//methods
	
	boolean start() {
		System.out.println(this.marka+ "started");
		return true;
		
	}
	void bakim() {
		System.out.println("Arabanin bakımını yapıyoruz");
	}

	@Override
	public String toString() {
		return "Car [uretimYili=" + uretimYili + ", marka=" + marka + "]";
	}

	public int getUretimYili() {
		return uretimYili;
	}

	public void setUretimYili(int uretimYili) {
		this.uretimYili = uretimYili;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public int getMotorGucu() {
		return motorGucu;
	}

	public void setMotorGucu(int motorGucu) {
		this.motorGucu = motorGucu;
	}
	
	
	
	
	
}
