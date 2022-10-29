
// 최대 길이 연속부분수열
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count = k;
        int answer = 0;
        int left = 0;

        for (int right = 0; right < N; right++) {
            // 0을 만나면 count를 줄인다
            if (arr[right] == 0) {
                count--;
            }
            
            // count를 해서 0보다 작을 때 arr[left]가 0이면 count를 다시 증가시켜준 다음 left도 증가시켜줌
            while (count < 0) {
                if (arr[left] == 0) {
                    count++;
                }
                left++;
            }
            // right가 한 번 돌 때마다 더 큰 값을 answer에 저장
            answer = Math.max(answer, right - left + 1);
        }
        System.out.println(answer);
    }
}
