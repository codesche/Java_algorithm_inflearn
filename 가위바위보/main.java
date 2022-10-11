import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1. 가위    2. 바위   3. 보
// A : 1    B : 3   => A가 이김
// A : 2    B : 1   => B가 이김
// A와 B의 합을 이용하여 로직 

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        StringTokenizer str = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(str.nextToken());
        }

        for (int i = 0; i < N; i++) {
              switch (A[i] + B[i]) {
                  case 2:
                      if (A[i] == B[i]) {
                          System.out.println("D");
                      }
                      break;

                  case 3:
                      if (A[i] > B[i]) {
                          System.out.println("A");
                      } else if (B[i] > A[i]) {
                          System.out.println("B");
                      }
                      break;

                  case 4:
                      if (A[i] > B[i]) {
                          System.out.println("B");
                      } else if (B[i] > A[i]) {
                          System.out.println("A");
                      } else if (A[i] == B[i]) {
                          System.out.println("D");
                      }
                      break;

                  case 5:
                      if (A[i] > B[i]) {
                          System.out.println("A");
                      } else if (A[i] < B[i]) {
                          System.out.println("B");
                      }
                      break;

                  case 6:
                      if (A[i] == B[i]) {
                          System.out.println("D");
                      }
                      break;
              }
        }
    }
}
