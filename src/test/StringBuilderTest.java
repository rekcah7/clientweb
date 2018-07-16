package test;

public class StringBuilderTest {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("문자열 관리 대상");
		System.out.println("sb = "+sb.toString());
		
		sb.delete(0, 2);
		System.out.println("sb = "+sb.toString());
		
		sb.deleteCharAt(sb.length()-2);
		System.out.println("sb = "+sb.toString());

	}

}
