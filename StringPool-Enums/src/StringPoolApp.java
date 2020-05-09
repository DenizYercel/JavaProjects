
public class StringPoolApp {

	public static void main(String[] args) {
		
		String s1="cat";
		String s2="cat";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println();
		String s3=new String("cat");
		
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));

	}

}
