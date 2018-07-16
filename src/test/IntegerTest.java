package test;

public class IntegerTest {
	public static void main(String[] args) {
		System.out.println("100을 2진수로->"+Integer.toBinaryString(100));
		System.out.println("100을 8진수로->"+Integer.toOctalString(100));
		
		System.out.println("100을 16진수로->"+Integer.toHexString(100));
		
		Integer i = new Integer(100);
		int j = i;
		
		System.out.println(i.equals(j));
		System.out.println("i를 double로->"+i.doubleValue());

	}

}
