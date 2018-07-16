package test;

import java.util.Vector;

public class VectorTest {
	public static void main(String[] args){
		
		Vector<String> vector = new Vector<String>(3);
		
		System.out.println("vector의 크기 : "+vector.size());
		System.out.println("vector의 용량 : "+vector.capacity());
		
		vector.addElement("java");
		vector.addElement("servlet/jsp");
		vector.addElement("spring");
		vector.addElement("python");
		
		System.out.println("데이터 삽입 후 vector의 크기 : "+vector.size());
		System.out.println("데이터 삽입 후 vector의 용량: "+vector.capacity());
		System.out.println("vector의 첫번째 요소 : "+vector.elementAt(0));
		
		vector.removeAllElements();//데이터 전체 삭제
		
		System.out.println("데이터 삭제 후 vector의 크기 : "+vector.size());
		System.out.println("데이터 삭제 후 vector의 용량 : "+vector.capacity());
	}
}
