package _01;

/**
 * 11. 문자열 압축
 * 입력예 : KKHSSSSSSSE / 출력예 : K2HS7E
 * 입력예 : KSTTTSEEKFKKKDJJGG / 출력예 : KST3SE2KFK3DJ2G2
 */
public class _11 {
	public static void main(String[] args) {
		String str = "KBBCKLP";

		char a = str.charAt(0);
		int cnt = 1;
		String answer = "";

		for(int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == a) {
				a = str.charAt(i);
				cnt++;
			} else {
				answer += String.valueOf(a);
				answer += String.valueOf(cnt);
				a = str.charAt(i);
				cnt = 1;
			}
		}
		System.out.println(answer);
	}
}
