import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public String solution(String s, String order) {
        String answer = "NO";
        Queue<Character> q = new LinkedList<>();

        // 큐 초기화
        for (char c : order.toCharArray()) {
            q.add(c);
        }

        for (char c : s.toCharArray()) {
            if (q.isEmpty()) {
                answer = "YES";
                break;
            }

            if (q.peek() == c) {
                q.poll();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        String order = sc.next();
        String subject = sc.next();

        System.out.println(main.solution(subject, order));
    }
}
