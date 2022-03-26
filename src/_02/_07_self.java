package _02;

public class _07_self {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {1, 0, 1, 1, 1, 0, 0, 1, 1, 0};
        System.out.println(solution(n, arr));
    }

    private static int solution(int n, int[] arr) {
        int answer = 0, cnt=0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                cnt++;
                answer += cnt;
            } else cnt = 0;
        }

        return answer;
    }
}
