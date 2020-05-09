package StaticOrnek;

public class SampleApp {
	public static void main(String[] args) {
		Sample sample=new Sample();
		Sample sample2=new Sample();
		
		System.out.println("sample.a="+sample.a);
		System.out.println("sample2.a="+sample2.a);
		
		sample.a++;
		sample.b++;
		
		System.out.println("sample.a="+sample.a);
		System.out.println("sample2.a="+sample2.a);
		
		System.out.println("sample.b="+sample.b);
		System.out.println("sample2.b="+sample2.b);
	}

}
