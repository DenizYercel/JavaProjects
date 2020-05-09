package Enumss;

public class EnumApp {

	public static void main(String[] args) {

		Animal dog=new Animal(1, PetType.DOG, 2, "jo");
		
		Animal cat =new Animal(2, PetType.CAT, 3, "hellokitty");
		
		Animal anml=new Animal(3,PetType.BIRD, 1, "pasa");
		
		anml.setTip(PetType.CAT);
		
		
		System.out.println(anml);
		
		PetType tip=PetType.BIRD;
		
		for(PetType pt:PetType.values()) {
			System.out.println(pt);
			
			
		}
	}

}
