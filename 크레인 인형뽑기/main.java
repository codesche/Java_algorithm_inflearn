import java.io.*;
import java.util.*;

public class Main {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int pos : moves) {
            for (int i = 0; i < board.length; i++) {        // 2차원 배열의 행 크기
                if (board[i][pos - 1] != 0) {               // 인형을 뽑은 경우 (숫자를 뽑은 경우)
                    int tmp = board[i][pos - 1];            // 뽑은 숫자 변수에 담기
                    board[i][pos - 1] = 0;                  // 뽑은 후 원래 위치를 0으로 변환

                    if (!stack.isEmpty() && tmp == stack.peek()) {      // 같은 숫자가 연속으로 쌓이면
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.push(tmp);                    // 뽑은 숫자 스택에 쌓기 (같은 숫자 아니거나 stack이 비어 있는 경우)
                    }
                    break;                                  // 한 번만 뽑아야 하기에 break
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] Two_arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                Two_arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int M = Integer.parseInt(br.readLine());
        int[] arr = new int[M];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        System.out.println(T.solution(Two_arr, arr));
    }
}
