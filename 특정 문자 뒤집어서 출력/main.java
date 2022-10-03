import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public String solution(String str) {
        String answer = " ";
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length() - 1;

        while (lt < rt) {
            // 알파벳이 아닐 때 - 왼쪽에서부터
            if (!Character.isAlphabetic(s[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(s[rt])) {        // 알파벳이 아닐 때 - 오른쪽에서부터
                rt--;
            } else {        // 알파벳일 때
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.solution(str));
    }
}
