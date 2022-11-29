import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 버블정렬 - 오름차순 기준
// 1. 앞에서부터 현재 원소와 바로 다음의 원소를 비교한다.
// 2. 현재 원소가 다음 원소보다 크면 원소를 교환한다.
// 3. 다음 원소로 이동하여 해당 원소와 그 다음원소를 비교한다.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // round는 배열크기 - 1 만큼 진행됨
        // 처음 원소가 아닌 그 다음번째 원소부터 비교
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < N - i; j++) {
                // 현재 원소가 다음 원소보다 클 경우 원소의 위치를 교환한다.
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
