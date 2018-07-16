package test;

public class StringTest02 {
	public static int cnt=0;
	
	public static void main(String[] args) {
	String str = new String("abcd");
	String str2 = new String("abcd");
	Comp(str,str2);//1번째 case
	
	String str3 = "abcd";
	String str4 = "abcd";
	Comp(str3,str4);
	
	String str5="abcd";
	Comp(str3, str5);//3번째
	Comp(str, str5);//4번쨰		
	}
	
	public static void Comp(String str,String str2){
		cnt++;
		System.out.println(cnt+"번째 case의 결과");
		System.out.println("주소비교 str==str2 : "+(str == str2));
		System.out.println("override 값비교 str.equals(str2) =>"+str.equals(str2));
		System.out.println("================================");
		System.out.println();
	}

}
