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
		
		System.out.println("for ���� �̿��� �ݺ�");
		for(int r : arr1){
			System.out.printf("%5d", r);
		}
		
		System.out.println("\n listlterator ���� �̿��� �ݺ�");
		
		ListIterator<Integer> res = arr1.listIterator();
		while(res.hasNext()){//���� ��Ұ� ������
			System.out.printf("%5d", res.next());//���� ��Ҹ� ����
		}
	}

}
