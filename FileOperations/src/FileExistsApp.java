import java.io.File;

public class FileExistsApp {

	public static void main(String[] args) {
		
		File myFile=new File("files\\deniz.txt");
		System.out.println(myFile.exists());
		
/*		File myfile1=new File("files/Ýtir.txt");  windowsta büyükk küçük önemli degil
 *  ama türkçe karakterleri kabul etmiyor.
		System.out.println(myfile1.exists());  */
		
		System.out.println("\"\" \\");
		
		System.out.println(myFile.getAbsolutePath());
	}

}
