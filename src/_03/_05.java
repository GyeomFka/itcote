package _03;

/**
 * 5. 연속된 자연수의 합
 */
public class _05 {
	public static void main(String[] args) {
		/**
		 * 7 <= N <= 1000
		 */
		int n = 15;
		int[] arr = new int[n/2 + 2];
		for (int i = 1; i <= n/2 + 1; i++) {
			arr[i] = i;
		}

		int answer = 0;

		for (int i = 1; i <= n/2 + 1; i++) {
			int di = i;
			int sum = 0;
			while(sum < n) {
				if(di==n/2 + 1) {
					sum += arr[di];
					break;
				}
				sum += arr[di++];
			}
			if (sum==n) answer++;
		}

		System.out.println(answer);
	}
}
