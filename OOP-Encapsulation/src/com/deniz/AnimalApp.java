package com.deniz;

public class AnimalApp {

	public static void main(String[] args) {
		
		Animal h1=new Animal("Kedi",4);
		Animal h2=new Animal("Kuş", 2);
		Animal h3=new Animal("Köpek",1);
		
		h1.hareket();
		h1.sesVer();
		System.out.println(h1);
		h2.hareket();
		h2.sesVer();
		System.out.println(h2);
		h3.hareket();
		h3.sesVer();
		System.out.println(h3);
	}

}
