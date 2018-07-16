package test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(80);
		arr1.add(90);
		arr1.add(100);
		
		System.out.println("for 문을 이용한 반복");
		for(int r : arr1){
			System.out.printf("%5d", r);
		}
		
		System.out.println("\n listlterator 문을 이용한 반복");
		
		ListIterator<Integer> res = arr1.listIterator();
		while(res.hasNext()){//다음 요소가 있으면
			System.out.printf("%5d", res.next());//다음 요소를 리턴
		}
	}

}
