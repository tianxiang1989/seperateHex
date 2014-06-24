package fox;
import java.util.ArrayList;
import java.util.List;

/**
 * 一个数字由1,2,4,8,16 。。。组成，要求快速分离其组成的数字
 * java API的方法  [NICE]
 */
public class testHexTwo {
	public static void main(String[] args) {
		int a = 1418;
		List<Integer> listRes = sepBinary(a);
		System.out.println(a+"通过testHexTwo分离的结果是：\n"+listRes);
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
