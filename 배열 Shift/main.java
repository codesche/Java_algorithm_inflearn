import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("n : ");
        int N = Integer.parseInt(br.readLine());

        // 데이터를 담을 배열
        int[] data = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("data[" + i + "] : ");
            data[i] = Integer.parseInt(br.readLine());
        }

        // 바뀌기 전
        for (int i = 0; i < N; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();

        // 오른쪽으로 1칸 Shift
        int temp = data[N - 1];
        for (int i = N - 1; i >= 1; i--) {
            data[i] = data[i - 1];
        }
        data[0] = temp;

        // 바뀐 후
        for (int i = 0; i < N; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        br.close();
    }
}
