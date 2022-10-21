import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public int solution(int n, int[][] arr) {
        int answer = 0, max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {                  // 학생
            int cnt = 0;
            for (int j = 1; j <= n; j++) {              // 특정 학생의 학년
                for (int k = 1; k <= 5; k++) {          // 특정 학생의 학년과 다른 학생의 학년과 비교
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;                          // 카운트 한 번만 세고 break 처리
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;         // n번 학생
            }
        }

        return answer;
    }


    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N + 1][6];            // 인덱스를 0부터가 아닌 1부터 비교

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.print(T.solution(N, arr));
    }
}
