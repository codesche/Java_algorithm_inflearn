import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public String solution(String s) {
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                 while (true) {
                     if (stack.peek() == '(') {
                         stack.pop();
                         break;
                     }
                     stack.pop();
                 }
            }
            else {
                stack.push(s.charAt(i));            // 그냥 문자인 경우
            }
        }

        for (int i = 0; i < stack.size(); i++) {
            answer += stack.get(i);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.solution(str));
    }
}
