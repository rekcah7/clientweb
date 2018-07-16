package test;

public class TestCharacter {
	public static void main(String[] args) {
		char ch = '\u0039';
		
		if(Character.isLowerCase(ch)){
			System.out.println("ch="+ch+"소문자얌");
		}else if(Character.isUpperCase(ch)){
			System.out.println("ch="+ch+"대문자얌");
		}else if(Character.isDigit(ch)){
			System.out.println("ch="+ch+"숫자얌");
		}else{
			System.out.println("이도저도 아니얌");
		}
	}

}
