

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ListExampleApp {
	static Scanner input = new Scanner(System.in);
	static File myFile = new File("files/sehir.txt");
	static HashMap<Integer, String> map = new HashMap<Integer, String>();

	public static void main(String[] args) {

		menu();

		/*
		 * System.out.println(map); map.remove(1, "Adana"); System.out.println(map);
		 */

	}

	public static void menu() {

		try {

			Scanner scan = new Scanner(myFile);
			while (scan.hasNext()) {

				map.put(scan.nextInt(), scan.next());

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int sec = 0;

		while (sec != 4) {
			System.out.println("Ekle-1");
			System.out.println("Sil-2");
			System.out.println("Listele-3");
			System.out.println("Cikis-4");
			System.out.print("Secim:");
			sec = input.nextInt();
			switch (sec) {
			case 1:
				System.out.print("Eklenecek il:");
				String il = input.next();
				System.out.print("Plaka kodu:");
				int plakakodu = input.nextInt();
				map.put(plakakodu, il);
				System.out.println("eklendi...");
				System.out.println();
				break;
			case 2:
				System.out.print("Silmek istediðin plaka kodu: ");
				int kod;
				try {
					kod = input.nextInt();
					map.get(kod).equals(input);
					map.remove(kod);
					System.out.println("Silindi..\n");
				} catch (Exception e) {
					System.out.println("Hatali plaka kodu girdiniz..");
				}
				break;
			case 3:
				System.out.println("\n--LISTE--");
				System.out.println(map);
				break;
			case 4:
				try {
					BufferedWriter bf = null;
					;

					// create new BufferedWriter for the output file
					bf = new BufferedWriter(new FileWriter(myFile));

					// iterate map entries
					for (Map.Entry<Integer, String> entry : map.entrySet()) {

						// put key and value separated by a colon
						bf.write(entry.getKey() + " " + entry.getValue());

						// new line
						bf.newLine();
					}

					bf.flush();
					System.out.println("dosyaya yazdý..gule gule..");
				} catch (IOException e) {
					e.printStackTrace();
				}

				break;

			default:
				break;

			}

		}

	}

}
