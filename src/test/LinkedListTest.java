package test;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> m_List = new LinkedList<String>();
		
		m_List.add("java");
		m_List.add("servlet/jsp");
		m_List.add("spring");
		
		for(String res : m_List){
			System.out.println(res);
		}
		
		System.out.println("===================");
		m_List.add(1,"python");//�ε���1�� python�� ����
		m_List.set(2, "HTML5");//�ε��� 2�� ��Ҹ� html5�� ��ü
		
		m_List.remove(3);//�ε��� 3�� ��Ҹ� ����
		
		for(String res : m_List){
			System.out.println(res);
		}

	}

}
