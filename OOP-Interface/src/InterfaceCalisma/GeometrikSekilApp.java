package InterfaceCalisma;

public class GeometrikSekilApp {

	public static void main(String[] args) {
		
	//	Kare kare=new Kare(5);
		
		IGeometrikSekil sekil=new Kare(5);
		System.out.println("Kare(GeometrikSekil) alanı :"+sekil.alan());
		System.out.println("Kare(GeometrikSekil) cevre :"+sekil.cevre());
		
		

		Dikdortgen dikt=new Dikdortgen(3, 4);
		sekil=dikt; 
		System.out.println("Dikdörtgen(GeometrikSekil) alanı :"+sekil.alan());
		System.out.println("Dikdörtgen(GeometrikSekil) cevre :"+sekil.cevre());

		
		IBoyanabilir renkliSekil=dikt;
		renkliSekil.boya("kirmizi");
		renkliSekil.boyaSil();
		
		
		
		
		
	/*	System.out.println("Dikdörtgen:");
		System.out.println("Alan :" + dikdortgen.alan());
		System.out.println("Cevre :" + dikdortgen.cevre());
		
		
		System.out.println("Kare :");
		System.out.println("Alan :"+kare.alan());
		System.out.println("Alan :"+kare.cevre());
		*/
	}

}
