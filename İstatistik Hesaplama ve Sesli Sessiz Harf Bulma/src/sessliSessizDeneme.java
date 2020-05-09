import java.util.Scanner;

public class sessliSessizDeneme {


		public static void main(String[] args) {

			sesliSessizBul();

		}

		static void sesliSessizBul() {

			System.out.println("isimleri girin, bitirmek için boş satir girin :");
			Scanner input = new Scanner(System.in);

			String[] isimler = new String[50];
			String[] sesliH = new String[25];
			String[] sessizH = new String[25];
			String ad, sesliler, sessizler;
			String sesliHarf = "aeıioöuü";
			int i = 0;
			sesliler = "";
			sessizler = "";
			String boslukKontrol=null;
			boslukKontrol=input.nextLine();
			while (!boslukKontrol.equals(" ")) {     

				ad = input.nextLine();
				boslukKontrol=ad;
				if (ad.isEmpty()) {          
					break;
				} else {
					
					isimler[i] = ad;
					sesliler = " ";
					sessizler = " ";
					
					for (int j = 0; j < ad.length(); j++) {
						if (sesliHarf.contains(Character.toString(ad.charAt(j)))) {
							sesliler += ad.charAt(j);
						} else {
							sessizler += ad.charAt(j);
						}
					}
					sesliH[i] = sesliler;
					sessizH[i] = sessizler;
					i++;
				}
			}
			System.out.println("\nSesli Harfler :");
			for (String sesli : sesliH) {
				if (sesli != null)
					System.out.println(sesli);
			}
			System.out.println("Sessiz Harfler :");
			for (String sessiz : sessizH) {
				if (sessiz != null)
					System.out.println(sessiz);

			}

		}
	}


