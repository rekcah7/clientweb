package test;

class Test_my{
}

public class ObjecTest {
	public static void main(String[] args) {
		Test_my obj1 = new Test_my();
		Test_my obj2 = new Test_my();
		Test_my obj3 = obj1;
		
		System.out.println(" �����ڷ� �ּ� ���");
		System.out.println("obj1==obj3 "+(obj1 == obj3));
		System.out.println("obj1==obj2 "+(obj1 == obj2));
		System.out.println("-------------");
		System.out.println("equals �޼ҵ�� �ּҺ�");
		
		System.out.println("obj1.equals(obj3)"+obj1.equals(obj3));
		System.out.println("obj1.equals(obj3)"+obj1.equals(obj2));
		
		System.out.println("------------------");
		System.out.println("obj1�� hashCode : "+obj1.hashCode());
		System.out.println("obj1�� toString : "+obj1.toString());
		System.out.println("obj1�� getClass : "+obj1.getClass());
	}

}
