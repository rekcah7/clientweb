package test;

public class TestInfinite {
	public static void main(String[] args) {
		double d1=0.5, d2=1.0/0.0;
		
		System.out.println("d1 : "+d1);
		System.out.println("=>"+Double.isInfinite(d1));
		System.out.println("d2:"+d2);
		System.out.println("=>"+Double.isInfinite(d2));
		}
}
