package _01;

public class _11_answer {
	public static void main(String[] args) {
		String input = "KBBCKLPPPS";
		String answer = solution(input);
		System.out.println(answer);
	}

	private static String solution(String input) {
		String answer = "";
		input += " ";
		int cnt = 1;
		for (int i = 0; i < input.length() - 1; i++) {
			if (input.charAt(i) == input.charAt(i+1)) {
				cnt++;
			} else {
				answer += input.charAt(i);
				if(cnt > 1) answer += String.valueOf(cnt);
				cnt = 1;
			}
		}
		return answer;
	}
}
