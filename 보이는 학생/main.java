

// N명의 학생을 일렬로 세웠다
// 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어졌다
// 맨 앞에 서 있는 선생님이 볼 수 있는 학생의 수
// 앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않음)

// 130 135 148 140 145 150 150 153

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.valueOf(br.readLine());
        int[] arr = new int[N];
        int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            if (max < arr[i]) {
                result++;
                max = arr[i];
            }
        }
        System.out.println(result);
    }
}
