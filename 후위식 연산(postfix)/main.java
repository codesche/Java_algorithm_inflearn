// 스택 개념 활용
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (char x : s.toCharArray()) {
            if (Character.isDigit(x)) {
                stack.push(x - 48);
            } else {
                int right = stack.pop();
                int left = stack.pop();
                if (x == '+') {
                    stack.push(left + right);
                } else if (x == '-') {
                    stack.push(left - right);
                } else if (x == '*') {
                    stack.push(left * right);
                } else if (x == '/') {
                    stack.push(left / right);
                }
            }
        }
        answer = stack.peek();
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.solution(str));
    }
}
