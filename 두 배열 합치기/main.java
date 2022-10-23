import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] B = new int[M];

        StringTokenizer st2 = new StringTokenizer(br. readLine(), " ");
        for (int i = 0; i < M; i++) {
            B[i] = Integer.parseInt(st2.nextToken());
        }

        // 리스트 생성
        List<Integer> list = new ArrayList<>();

        // 리스트에 배열 요소 생성
        for (int i = 0; i < N; i++) {
            list.add(A[i]);
        }

        // 리스트에 배열 요소 생성
        for (int i = 0; i < M; i++) {
            list.add(B[i]);
        }

        // 배열 정렬
        Collections.sort(list);

        for (Integer int_value : list) {
            System.out.print(int_value + " ");
        }
    }
}
