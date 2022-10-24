import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public ArrayList<Integer> solution (int N, int M, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        
        Arrays.sort(a);
        Arrays.sort(b);

        while (p1 < N && p2 < M) {
            if (a[p1] == b[p2]) {
                answer.add(a[p1]);
                p1++;
                p2++;
            } else if (a[p1] > b[p2]) {
                p2++;
            } else {
                p1++;
            }
        }

        return answer;
    }
    
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] B = new int[M];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            B[i] = Integer.parseInt(st2.nextToken());
        }

        for (int x : T.solution(N, M, A, B)) {
            System.out.print(x + " ");
        }

    }
}
