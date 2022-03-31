package _03;

public class _05_two_pointers_algo {
	public static void main(String[] args) {
		int n = 15;
		int answer = 0, sum = 0, lt = 0;
		int m = n/2 + 1;

		int[] arr = new int[m];

		for (int i = 0; i < m; i++) arr[i] = i+1;

		for (int rt = 0; rt < m; rt++) {
			sum += arr[rt];
			if(sum==n) answer++;
			while(sum >= n) {
				sum-=arr[lt++];
				if(sum==n) answer++;
			}
		}
		System.out.println(answer);
	}
}
