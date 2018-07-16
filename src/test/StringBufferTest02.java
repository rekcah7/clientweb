package test;

public class StringBufferTest02 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello!");
		System.out.println(sb);//전체 출력
		System.out.println("------------");
		
		sb.append(" Getting Stating");//sb의 끝에 추가
		System.out.println(sb);
		System.out.println("------------");
		
		sb.insert(sb.length(), "Java");//sb 끝에 삽입
		System.out.println(sb);
		System.out.println("------------");
		
		sb.reverse();//sb의 전제 내용을 거꾸로 출력
		System.out.println(sb);
	}

}
