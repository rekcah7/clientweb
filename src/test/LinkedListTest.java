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
		m_List.add(1,"python");//인덱스1에 python을 삽입
		m_List.set(2, "HTML5");//인덱스 2의 요소를 html5로 대체
		
		m_List.remove(3);//인덱스 3의 요소를 삭제
		
		for(String res : m_List){
			System.out.println(res);
		}

	}

}
