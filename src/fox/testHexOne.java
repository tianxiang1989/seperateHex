package fox;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * һ��������1,2,4,8,16 ��������ɣ�Ҫ����ٷ�������ɵ�����
 *�Լ�д�ķ��� [Ч�ʵ�] 
 * 
 * @author liuxiuquan
 */
public class testHexOne {
	public static void main(String[] args) {
		int a = 1418;
		String b = Integer.toBinaryString(a);
		// System.out.println(b);
		List<Integer> list1 = findIndex(b, "1");
		List<Integer> listResult = new ArrayList<Integer>();
		for (Integer i : list1) {
			int d = (int) Math.pow(2, i);
			listResult.add(d);
		}

		System.out.println(a + "ͨ��testHexOne����Ľ����:\n" + listResult);

		// 2����תʮ���Ʒ���
		// BigInteger c=new BigInteger(b, 2);
		// System.out.println(c);
	}

	public static List<Integer> findIndex(String str, String key) {
		int index = -key.length();
		int length = str.length();
		List<Integer> list = new ArrayList<Integer>();
		while (str.indexOf(key, index + key.length()) > -1) {
			index = str.indexOf(key, index + key.length());
			list.add(length - index - 1);
		}
		return list;
	}
}
