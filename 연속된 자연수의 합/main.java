import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        
        // 배열 생성
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        int left = 0;
        int answer = 0;
        int target_sum = 0;

        for (int i = 0; i < N; i++) {
            // while문 고려하여 조건문을 앞에다 배치
            if (target_sum == N) {
                answer++;
            }
            
            // 누적 합
            target_sum += arr[i];

            if (target_sum > N) {
                while (true) {
                    target_sum -= arr[left++];

                    if (target_sum <= N) {
                        break;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
