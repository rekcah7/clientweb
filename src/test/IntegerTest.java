package test;

public class IntegerTest {
	public static void main(String[] args) {
		System.out.println("100�� 2������->"+Integer.toBinaryString(100));
		System.out.println("100�� 8������->"+Integer.toOctalString(100));
		
		System.out.println("100�� 16������->"+Integer.toHexString(100));
		
		Integer i = new Integer(100);
		int j = i;
		
		System.out.println(i.equals(j));
		System.out.println("i�� double��->"+i.doubleValue());

	}

}
