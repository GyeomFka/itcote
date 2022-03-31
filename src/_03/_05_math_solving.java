package _03;

/**
 * 5. 연속된 자연수의 합.
 */
public class _05_math_solving {
	public static void main(String[] args) {
		/**
		 * 몫/나머지 활용
		 */
		int n = 15;
		int answer = 0, cnt = 1;
		n--;
		while(n > 0) {
			cnt++;
			n=n-cnt;
			if(n%cnt==0) answer++;
		}
	}
}
