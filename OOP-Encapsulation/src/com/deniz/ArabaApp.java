package com.deniz;

public class ArabaApp {

	public static void main(String[] args) {
		ArabaOrnek araba=new ArabaOrnek("Mercedes", 2015, 260);
		ArabaOrnek araba2=new ArabaOrnek("Mercedes", 2010, 200);
		ArabaOrnek araba3=new ArabaOrnek("Mercedes", 2009, 350);
		ArabaOrnek araba4=new ArabaOrnek("BMW", 2017, 300);
		
		
		Motor motor1=new Motor(1600, "LPG", 215);
		Motor motor2=new Motor(5000,"BENZİN", 400);
		
		System.out.println(araba.getSpeed());
		araba.setSpeed(150);
		System.out.println(araba.getSpeed());
		araba.hizlan(20);
		System.out.println(araba.getSpeed());
		araba.yavasla(80);
		System.out.println(araba.getSpeed());
		araba.hizlan(260);
		System.out.println(araba.getSpeed());
		araba.hizlan(260);
		System.out.println(araba.getSpeed());
		
		
		
		
		
		
	}

}
