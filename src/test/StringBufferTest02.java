package test;

public class StringBufferTest02 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello!");
		System.out.println(sb);//��ü ���
		System.out.println("------------");
		
		sb.append(" Getting Stating");//sb�� ���� �߰�
		System.out.println(sb);
		System.out.println("------------");
		
		sb.insert(sb.length(), "Java");//sb ���� ����
		System.out.println(sb);
		System.out.println("------------");
		
		sb.reverse();//sb�� ���� ������ �Ųٷ� ���
		System.out.println(sb);
	}

}
