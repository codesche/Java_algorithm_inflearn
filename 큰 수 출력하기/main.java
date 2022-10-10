import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        // 첫 번째 요소는 무조건 출력
        answer.add(arr[0]);

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                answer.add(arr[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Main T = new Main();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int i = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 한 줄로 여러 데이터 출력하는 방법
        while (st.hasMoreTokens()) {
            arr[i] = Integer.parseInt(st.nextToken());
            i++;
        } //

        for (int x : T.solution(N, arr)) {
            System.out.print(x + " ");
        }
    }
}
