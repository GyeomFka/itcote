package _02;

/**
 * int String 없이 뒤집은 수 만들기.
 */
public class _06_int_reverse {
	public static void main(String[] args) {
		int tmp = 12300;
		int res = 0;
		while (tmp > 0) {
			int t = tmp % 10;
			res = res * 10 + t;
			tmp = tmp / 10;
		}
		System.out.println(res);

		if (isPrime(res)) {
			System.out.println("prime" + res);
		} else {
			System.out.println("에헴");
		}
	}

	private static boolean isPrime(int res) {
		if (res == 1) return false;
		for (int i = 2; i < res; i++) {
			if(res%1 == 0) return false;
		}
		return true;
	}

}
