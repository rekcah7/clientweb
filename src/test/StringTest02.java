package test;

public class StringTest02 {
	public static int cnt=0;
	
	public static void main(String[] args) {
	String str = new String("abcd");
	String str2 = new String("abcd");
	Comp(str,str2);//1��° case
	
	String str3 = "abcd";
	String str4 = "abcd";
	Comp(str3,str4);
	
	String str5="abcd";
	Comp(str3, str5);//3��°
	Comp(str, str5);//4����		
	}
	
	public static void Comp(String str,String str2){
		cnt++;
		System.out.println(cnt+"��° case�� ���");
		System.out.println("�ּҺ� str==str2 : "+(str == str2));
		System.out.println("override ���� str.equals(str2) =>"+str.equals(str2));
		System.out.println("================================");
		System.out.println();
	}

}
