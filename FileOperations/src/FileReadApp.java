import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadApp {

	public static void main(String[] args) {
		
		File file=new File("files\\deniz.txt");
		System.out.println(file.exists());
		try {
			Scanner input=new Scanner(file);
			while(input.hasNext()) {
				System.out.println(input.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadi..");
		}
		
		
		
	}

}
