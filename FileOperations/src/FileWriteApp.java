import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class FileWriteApp {
	
	public static void main(String[] args) {
		
		File myFile=new File("files/yercel.txt");
		
		try {
			Formatter fmtr=new Formatter(myFile);
			String s1="1";
			String s2="A";
			fmtr.format("%s\n", "deniz");
			fmtr.format("%s\n", "yercel");
			fmtr.format("%s\n", "elbet birgün ...");
			fmtr.format("%s-%s", s1,s2);
			fmtr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
