package test;

public class StringTest {
	public static void main(String[] args) {
		String s = "aBcAbCabcABC";
		System.out.println("4��° ���� chartAT: "+s.charAt(3));
		System.out.println("abc�� ��ġ indexOf: "+s.indexOf("abc"));
		
		System.out.println("s�� ���� length:"+s.length());
		System.out.println("a�� R�� ��ȯ replace: "+s.replace('a', 'R'));
		
		System.out.println("aBc�� ���� substring: "+s.substring(0,3));
		System.out.println("��� �빮�ڷ� ��� uppercase: "+
		s.toUpperCase());
		
		System.out.println("�빮�� C�� ��ġ :"+(s.indexOf("C")+1)+"��°");
	}

}
