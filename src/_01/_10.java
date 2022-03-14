package _01;

import java.util.Scanner;

/**
 * 10.가장 짦은 문자거리
 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
 * teachermode e
 */
public class _10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        String t = scan.next();

        solution(input, t);
    }

    private static String solution(String input, String t) {

        int firstIndex = input.indexOf(t);
        int lastIndex = input.lastIndexOf(t);
        int [] answer = new int[input.length()];

        int cnt = getCharCnt(input, t);

        for (int i = 0; i <= firstIndex; i++) { //firstIndex
            answer[i] = firstIndex - i;
        }

        int j = 0;
        for (int i = lastIndex; i <= input.length() - 1; i++) {
            answer[i] = j;
            j++;
        }

        for (int i = 0; i < cnt; i++) {
            int a = firstIndex;
            int b = input.indexOf(t, firstIndex + 1);
            firstIndex = b;
            answer = midInput(a, b, answer);
        }

        for (int i=0; i<answer.length; i++) {
            System.out.print(answer[i] + " ");
        }

        return null;
    }

    private static int getCharCnt(String input, String t) {
        int result = 0;
        for (char x : input.toCharArray()) {
            if ( String.valueOf(x).equals(t) ) result++;
        }
        return result;
    }

    private static int[] midInput(int a, int b, int[] answer) {
        int lt = a;
        int rt = b;
        int cnt = 0;
        while(lt <= rt) {
            answer[lt] = cnt;
            answer[rt] = cnt;
            cnt++;
            lt++;
            rt--;
        }
        return answer;
    }
}
