package _01;

import java.util.Scanner;

public class _01_answer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        char c = scan.next().charAt(0);

        System.out.println(solution(str, c));
    }

    private static int solution(String str, char c) {
        int answer = 0;

        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        /*
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                answer++;
            }
        }
        */
        for (char x : str.toCharArray()) {
            if ( x == c ) {
                answer++;
            }
        }


        return answer;
    }
}
