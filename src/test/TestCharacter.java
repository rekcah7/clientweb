package test;

public class TestCharacter {
	public static void main(String[] args) {
		char ch = '\u0039';
		
		if(Character.isLowerCase(ch)){
			System.out.println("ch="+ch+"�ҹ��ھ�");
		}else if(Character.isUpperCase(ch)){
			System.out.println("ch="+ch+"�빮�ھ�");
		}else if(Character.isDigit(ch)){
			System.out.println("ch="+ch+"���ھ�");
		}else{
			System.out.println("�̵����� �ƴϾ�");
		}
	}

}
