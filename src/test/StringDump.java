package test;

public class StringDump {
	public static void main(String[] args) {
		String str ="16�������� �ٲߴϴ�.";
		
		System.out.println(str);
		
		char [] buf = str.toCharArray();
		
		for(int i=0;i<buf.length;i++){
			System.out.print(Integer.toString(buf[i],16)+" ");
		}

	}

}
