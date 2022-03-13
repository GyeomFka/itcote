package _01;

import java.util.Scanner;

/**
 * 9. 숫자만 추출
 */
public class _09_answer_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        int answer = solution(input);
        System.out.println(answer);
    }

    private static int solution(String input) {
        int answer = 0;
        for (char x : input.toCharArray()) {
            if (x >= 48 && x <= 57) {
                answer = answer * 10 + (x - 48);
            }
        }
        return answer;
    }
}
