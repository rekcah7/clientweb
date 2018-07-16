package test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.apache.jasper.tagplugins.jstl.core.Catch;

public class ToCalcHelper {
	public static String toString(Object obj) {
		StringBuffer buffer = new StringBuffer();
		try {
			Class clazz = obj.getClass();// Ŭ���� ��ü�� ����

			// Ŭ������ ����� �ʵ��� ���̸� ����
			int[] num = new int[clazz.getDeclaredFields().length];
			int i = 0;

			// get+�ʵ� ù���� �빮��+�ʵ峪���� ���� �ҹ��ڷ� �޼ҵ������ ����� �����Ѵ�.
			for (Field field : clazz.getDeclaredFields()) {
				String fieldName = field.getName().toString();
				fieldName = "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);

				// ������ �޼ҵ� ���� getter�޼ҵ�� ����ǵ��� �����Ѵ�.
				Method method = clazz.getMethod(fieldName);
				Object value = method.invoke(obj);
				num[i] = (int) value;
				i++;
			}
			// NotMyNo ������̼��� ������� ���� �޼ҵ�� �����Ѵ�.
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
