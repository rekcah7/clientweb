package test;

import java.util.Vector;

public class VectorTest {
	public static void main(String[] args){
		
		Vector<String> vector = new Vector<String>(3);
		
		System.out.println("vector�� ũ�� : "+vector.size());
		System.out.println("vector�� �뷮 : "+vector.capacity());
		
		vector.addElement("java");
		vector.addElement("servlet/jsp");
		vector.addElement("spring");
		vector.addElement("python");
		
		System.out.println("������ ���� �� vector�� ũ�� : "+vector.size());
		System.out.println("������ ���� �� vector�� �뷮: "+vector.capacity());
		System.out.println("vector�� ù��° ��� : "+vector.elementAt(0));
		
		vector.removeAllElements();//������ ��ü ����
		
		System.out.println("������ ���� �� vector�� ũ�� : "+vector.size());
		System.out.println("������ ���� �� vector�� �뷮 : "+vector.capacity());
	}
}
