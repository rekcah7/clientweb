package test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.apache.jasper.tagplugins.jstl.core.Catch;

public class ToCalcHelper {
	public static String toString(Object obj) {
		StringBuffer buffer = new StringBuffer();
		try {
			Class clazz = obj.getClass();// 클래스 객체로 리턴

			// 클래스가 선언된 필드의 길이를 리턴
			int[] num = new int[clazz.getDeclaredFields().length];
			int i = 0;

			// get+필드 첫글자 대문자+필드나머지 문자 소문자로 메소드명으로 만들어 조합한다.
			for (Field field : clazz.getDeclaredFields()) {
				String fieldName = field.getName().toString();
				fieldName = "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);

				// 조합한 메소드 명을 getter메소드로 실행되도록 지정한다.
				Method method = clazz.getMethod(fieldName);
				Object value = method.invoke(obj);
				num[i] = (int) value;
				i++;
			}
			// NotMyNo 어노테이션이 선언되지 않은 메소드는 실행한다.
			for (Method method : clazz.getDeclaredMethods()) {
				NotMyNo nmn = method.getAnnotation(NotMyNo.class);
				if (nmn == null)
					if (method.getName().length() == 6) {
						Object value = method.invoke(obj, num[0], num[1]);
						buffer.append(method.getName().substring(3)).append("=").append(value).append("\n");
					}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return buffer.toString();
	}
}
