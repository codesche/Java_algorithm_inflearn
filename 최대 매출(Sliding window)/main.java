import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public int solution(int n, int m, int arr[]) {
        int sum = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            // 최초에 나온 합을 최댓값으로 잡음
            if (i == m - 1) {
                max = sum;
            }

            // 처음 길이를 벗어났을 때부터 한 칸씩 밀어주면서 비교
            if (i >= m){
                sum -= arr[i - m];
                max = Math.max(max, sum);
            }
        }
        return max;
    }


    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        System.out.println(T.solution(N, M, arr));

    }
}
