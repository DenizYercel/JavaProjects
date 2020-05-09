package com.deniz;

public class ArabaOrnek{
	Motor motor;
	private String marka;
	private int uretimYili;
	private int maxSpeed;
	private int speed;
	
	
	
	public ArabaOrnek(Motor motor,String marka,int uretimYili,int maxSpeed) {
		this.motor=motor;
		this.marka=marka;
		this.uretimYili=uretimYili;
		this.maxSpeed=maxSpeed;
	}

	public ArabaOrnek(String marka, int uretimYili, int maxSpeed) {
		this.marka=marka;
		this.uretimYili=uretimYili;
		this.maxSpeed=maxSpeed;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public int getUretimYili() {
		return uretimYili;
	}

	public void setUretimYili(int uretimYili) {
		this.uretimYili = uretimYili;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void hizlan(int miktar) {
		speed+=miktar;
		if(this.speed>=maxSpeed) {
			speed=maxSpeed;
			System.out.println("hızını azalt");
		}
		
	}
	public void yavasla(int miktar) {
		if(this.speed<=maxSpeed)
		speed-=miktar;
	}
}
