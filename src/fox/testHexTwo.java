package fox;
import java.util.ArrayList;
import java.util.List;

/**
 * һ��������1,2,4,8,16 ��������ɣ�Ҫ����ٷ�������ɵ�����
 * java API�ķ���  [NICE]
 */
public class testHexTwo {
	public static void main(String[] args) {
		int a = 1418;
		List<Integer> listRes = sepBinary(a);
		System.out.println(a+"ͨ��testHexTwo����Ľ���ǣ�\n"+listRes);
	}

	private static List<Integer> sepBinary(int i) {
		int mask = 1;
		List<Integer> listRes = new ArrayList<Integer>();
		int j = 1;
		do {
			if ((i & mask) != 0) {
				listRes.add(j);
			}
			i >>>= 1;
			j<<=1;
		} while (i != 0);
		return listRes;
	}
}
