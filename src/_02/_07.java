package _02;

public class _07 {
	public static void main(String[] args) {
		int[] input = {1, 0, 1, 1, 1, 0, 0, 0, 1, 1};

		int answer = solution(input);
		System.out.println(answer);

	}

	private static int solution(int[] input) {
		int answer = 0;

		for (int i = 0; i < input.length-1; i++) {
			if (input[i] == 1) {
				if (input[i+1] == 0) {
					answer++;
				} else {

				}
			}
		}

		return answer;
	}

}
