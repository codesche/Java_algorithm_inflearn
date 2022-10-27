import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        int count = 0;
        int left = 0;

        for (int right = 0; right < N; right++) {
            sum += arr[right];

            if (sum == M) {
                count++;
            }

            while (sum >= M) {
                // 합이 원하는 수보다 크거나 같으면 합에서 left 인덱스의 값을 빼준다
                sum -= arr[left++];
                if (sum == M) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
