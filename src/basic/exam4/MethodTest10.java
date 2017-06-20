package basic.exam4;

public class MethodTest10 {
	public static void main(String[] args) {
		int[] n = {23,10,70,80,60,25,81,80};
		
		int max = maxNumber(n);
		int min = minNumber(n);
		System.out.println("배열 n에서 가장 큰 값은 => " + max);
		System.out.println("배열 n에서 가장 작은 값은 => " + min);
	}

	private static int maxNumber(int[] n) {
		int max_num = n[0];
		for (int i = 0; i < n.length; i++) {
			if (max_num <= n[i]) {
				max_num = n[i];
			}
		}
		
		return max_num;
	}

	private static int minNumber(int[] n) {
		int min_num = n[0];
		for (int i = 0; i < n.length; i++) {
			if (min_num >= n[i]) {
				min_num = n[i];
			}
		}
		
		return min_num;
	}

}
