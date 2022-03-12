package _01;

public class _05 {

	public static void main(String[] args) {
		String input = "a@bcde@";

		String answer = solution(input);

		// System.out.println(answer);
	}

	private static String solution(String input) {
		String answer = "";

		char[] cList = input.toCharArray();
		char[] cListCopy = new char[cList.length];

		int cnt = 0;

		for(int i = cList.length-1; i >= 0; i--) {
			if(cList[i] == '@') {
				cListCopy[i] = '@';
			} else {
				cListCopy[cnt] = cList[i];
			}
			cnt++;
		}

		for(int i = 0; i < cListCopy.length; i++) {
			System.out.print(cListCopy[i]);
		}

		return cListCopy.toString();
	}

}
