package com.deniz;

public class CarApp {

	public static void main(String[] args) {
		
		Car araba =new Car();
		
		Car mercedes;
		mercedes=new Car("Mercedes", 2019);
		
		araba.start();
		mercedes.start();
		
		System.out.println(araba);
		System.out.println(mercedes);
		mercedes.bakim();

	}

}
