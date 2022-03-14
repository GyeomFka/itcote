package _01;

public class _12_answer {
	public static void main(String[] args) {
		String input = "AbcdefgaBcdefgabCdefgabcDefg";
		String answer = "";

		for (int i = 0; i < 4; i++) {
			String tmp = input.substring(0, 7).replace('#', '1').replace('*', '0');
			int num = Integer.parseInt(tmp, 2);
			answer += (char)num;

			input = input.substring(7);
		}
	}
}
