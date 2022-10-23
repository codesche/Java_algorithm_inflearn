import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 투 포인터 개념 활용
public class Main2 {

    public ArrayList<Integer> solution(int N, int M, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        
        // 투 포인터
        while (p1 < N && p2 < M) {
            if (a[p1] < b[p2]) {
                answer.add(a[p1++]);
            } else {
                answer.add(b[p2++]);
            }
        }

        // p1이 남아 있는 경우
        while (p1 < N) {
            answer.add(a[p1++]);
        }

        // p2가 남아 있는 경우
        while (p2 < M) {
            answer.add(b[p2++]);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main2 T = new Main2();
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

        for (int x : T.solution(N, M, A, B)) {
            System.out.print(x + " ");
        }
    }
}
